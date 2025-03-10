import React, { useState } from 'react'

export const Input_1 = () => {
  //input 태그의 value 속성을 저장할 state변수
  const[data,setData] = useState('');
  return (
    <>
      <h2>input태그에 데이터 입력받기</h2>

      {/* input태그 사용할때 value하고 onChange를 필수로 써야한다 */}
      {/* target - 이벤트가 발생한 태그 */}
      <input type="text" onChange={(e) => {
        // console.log(e);
        //이벤트가 발생한 태그에 value값을 불러온다
        console.log(e.target.value);
        setData(e.target.value);

      }} />

      <div>
        input 태그에 입력한내용: {data}
      </div>
    </>
  )
}

export default Input_1