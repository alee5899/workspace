import React from 'react'
import { useDispatch, useSelector } from 'react-redux'
import { handleCounter, increase } from '../redux/counterSlice'

const Test1 = () => {
  //store에 저장된 myName값 가져옴
  const counter = useSelector(state => state.counter)

  // store에 등록된 reducer(함수)를 호출해주는 객체
  const dispatch = useDispatch()

  return (
    <>
      <div>Test1 {counter}</div>
      <button type="button" onClick={()=>{
        // dispatch(increase())
        dispatch(handleCounter(5))
      }}>+1 증가</button>
    </>
  )
}

export default Test1