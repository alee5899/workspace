import axios from 'axios';
import React, { useEffect, useState } from 'react'
import { use } from 'react';

export const Axios_2 = () => {
  //서버에서 받은 데이터를 저장할  state변수
  const [sum,setSum] = useState({});
  


  // useEffect(()=>{}, 의존성배열(생략))
  // 의존성배열 : 아무것도 안줬다 => mount, update;
  //             [] => mount 일때만
  //             [a, b, c, d] => mount, 배열안에 속해있는 변수가 하나라도 데이터가 변경돼서 리렌더링 될때

  //https://http://localhost:8080/t3
  useEffect(() =>{
    axios.get('/api/t3')
    .then((res) => {
      console.log(res.data);
      setSum(res.data);
    })
    .catch((error) => {
      console.log('실패');
      console.log('error');
    })

  }, [])



  return (
    <>
      <div>Axios_2</div>
      <p>{sum.name}</p>
    </>
  )
}

export default Axios_2
