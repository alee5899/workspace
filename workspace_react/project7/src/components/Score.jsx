import axios from 'axios';
import React, { useEffect, useState } from 'react'

export const Score = () => {
  const [sc,setSc] = useState(0);

  function bt(e){
    axios.get('/api/t10')
    .then((res)=>{
      console.log("통신성공");
      console.log(res.data);

    })
    .catch((error)=>{
      console.log("통신실패");
    })
  }
  
   
  return (
    <>
    {sc}<button type='button' onClick={bt}>생성</button>
    {sc}<button type='button'>생성</button>
    {sc}<button type='button'>생성</button>
    {sc}<button type='button'>생성</button>
    {sc}<button type='button'>생성</button>
    
    
    </>
   
  )
}
export default Score
