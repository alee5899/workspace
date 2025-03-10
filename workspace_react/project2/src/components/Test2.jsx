import React, { useState } from 'react'
import './Test2.css';
export const Test2 = () => {
  // const[변수(저장되는값),함수( 앞의 변수인 데이터를 바꿔주는값)](변수초기화)
  const[displayText,setDisplayText] = useState('ON'); // usesState : ['ON', f]
  const[btnText, setBtnText] = useState('OFF')
  return (
 <>
      <div>Test2</div>
      {/* //디스플레이텍스스트 적엇으니 온 나옴 */}
      <div>{displayText}</div>
      <button type='button' onClick={() => {
        setDisplayText(displayText === 'ON'? 'OFF' : 'ON');
        setBtnText(btnText === 'ON' ? 'OFF' : 'ON');
      }}>{btnText}</button>
  
 </>

  )
  
}

export default Test2