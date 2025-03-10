import React, { useState } from 'react'
import List from './List'
import axios from 'axios'

export const Board = () => {
  const [sdata,setSData] = useState([])
  axios.get('/api/t11')
  .then((res)=>{
    console.log("통신성공");
    console.log(res.data);
  })
  .catch((error)=>{
    console.log("통신실패")
  })

  return (
    <>
      <div>
        <List />
      </div>
    </>

  )
}
export default Board
