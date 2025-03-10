import axios from 'axios'
import React, { useEffect, useState } from 'react'

export const Axios_4 = () => {
  // 앞에있는 변수 데이터 변경 및 리덴더링을 위한 state변수 생성
  const [person,setPerson] = useState([]);

  useEffect(()=>{
    //서버에 있는 데이터 가져오기
    axios.get('/api/t4')
    .then((res)=>{
      console.log('성공');
      console.log(res);
      console.log(res.data);
      setPerson(res.data)//서버에서 가져온 데이터를 state변수의 데이터 변경 및 리렌더링
    })
    .catch((error) =>{
      console.log('실패');

    })
  },[]);

  const am = () =>{
    axios.get('/api/t4')
    .then((res)=>{
      console.log('성공');
      console.log(res);
      setPerson(res.data)
    })
    .catch((error) =>{
      console.log('실패');

    })
  }
  return (
    <>
      <div>Axios_4</div>
      <table border={1}>
        <thead>
          <tr>
            <td>이름</td>
            <td>나이</td>
            <td>주소</td>
          </tr>
        </thead>
        <tbody>
          {
            person.map((p,i)=>{
              return(
                  <tr key = {i}>
                    <td>{p.name}</td>
                    <td>{p.age}</td>
                    <td>{p.addr}</td>
                  </tr>
              )
            })
          }
        </tbody>
      </table>
    </>
  )
}

export default Axios_4
