import React, { useState } from 'react'

const InputTest = () => {
  const[data,setData] = useState({
    id : '',
    age : '',
    name : ''
  });

  const changeData = ((e)=>{
    setData({
      ...data,
      [e.target.name] : e.target.value
    })
  })
  return (
  <>
      <div>InputTest</div>
      <div> id : <input type="text" name='id' onChange={(e)=>{changeData(e)}} /></div>
      <div> 나이 : <input type="text" name='age' onChange={(e)=>{changeData(e)}} /></div>
      <div> 이름 : <input type="text" /></div>
  </>
  )
}

export default InputTest