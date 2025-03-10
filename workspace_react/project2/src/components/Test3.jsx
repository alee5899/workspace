import './Test3.css';
import React, { useState } from 'react'

export const Test3 = () => {
  //보이는 상태
  //리렌더링 되면 마지막값을 저장한다
  const [isShow, setIsShow] = useState(true);
  const [btnText,setBtnText] = useState('광고닫기')
  return (
    <>
    <div>Test3</div>
    <button type='button' onClick={() => {
      setIsShow(!isShow);   // isShow = !isShow
      setBtnText(btnText === '광고닫기' ? '광고보기' : '광고닫기');
    }}>{btnText}</button>

    {/*자바스크림트 코드 사용할려고 중갈호 사용 */}
    {
      isShow ? <div className='banner'>오늘 구매하시면 30% SALE!!!</div> : null
    }
        
    </>

  );
};

export default Test3;
