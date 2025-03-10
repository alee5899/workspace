import './Test4.css';
import React, { useState } from 'react'
import { useActionState } from 'react'

export const Test4 = () => {
  const[numArr,setNumArr] = useState([0,0,0]);


  function changeData(index){
    const copyArr = [... numArr]; //[0,0,0]
    copyArr[index] = copyArr[index] + 1;
    setNumArr(copyArr)


    // numArr[0] = numArr[0] + 1;
    // setNumArr(numArr);


  }
  return (
    <>
    <div>Test4</div>
    <span onClick={() => {
      changeData(0);
      // setNumArr([numArr[0] + 1,0,0])
    }}>{numArr[0]}</span>


    <span onClick={() =>{
      changeData(1);
    }}>{numArr[1]}</span>


    <span onClick={() => {
      changeData(2);
    }}>{numArr[2]}</span>
    </>
  )
}

export default Test4
