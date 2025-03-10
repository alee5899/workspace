import React, { useEffect, useState } from 'react'

export const Effect_1 = () => {
  const [cnt1,setCnt1] = useState(0);
  const [cnt2,setCnt2] = useState(0);

  // useEffect의 두번째 매개변수[]를 의존성 배열이라 부름
  // 의존성 배열을 어떻게 작성하냐에 따라 useEffect의 리렌더링 시점의 실행여부를 결정

  // 의존성 배열을 빈배열로 선언하면 useEffect 의 내용은 mount될때만 실행!
  useEffect(() => {
    console.log(5);
  }, []);

  // 의존성배열을 작성하면 monut 될때와 변수의 데이터가 변경되서 리렌더링 될때만 실행
  //mount될때 cnt2값이 변경되어 리렌더링 될대
  useEffect(() => {
    console.log('cnt2 값 변경');
  }, [cnt2]);

  // mount 될때 cnt1 cnt2 둘중 하나라도 변경되어 리렌더링 될때 실행
  useEffect(() => {
    console.log('둘다 값 변경');
  }, [cnt1,cnt2]);

  return (

   <>
      <div>Effect_1</div>

       {/* 버튼클릭 -> setCnt1발동(cnt1의 데이터가 +1 바뀌면서 리렌더링) -> useEffect(()=>{}, [cnt1]), useEffect(()=>{}, [cnt1, cnt2]) 발동*/}
      <button type='button' onClick={(e) => {
        setCnt1(cnt1 +1)
      }}>cnt1 변경 버튼</button>

      <button type='button' onClick={(e) => {
        setCnt2(cnt2 +1)
      }}>cnt2 변경 버튼</button>
   </>
  )
}

export default Effect_1