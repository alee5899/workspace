import React, { useState } from 'react'

export const Input_3 = () => {
  //select에서 선택한 데이터를 저장하기위한 state
  //초기값은 여러 option들 중에 최초로 화면에 표현한 값으로 지정
  //option태그의 value 속성값으로 지정
  const[fruit,setFruit] = useState('banana');
  return (
    <>
      <select value={fruit} onChange={(e) => {
          setFruit(e.target.value);
        }}>
        <option value="apple" >사과</option>
        <option value="banana">바나나</option>
        <option value="orange">오렌지</option>
      </select>
    </>
   
  )
}

export default Input_3
