import axios from 'axios';
import React, { useEffect, useState } from 'react'

export const Axios_1 = () => {
  //서버에서 받은 데이터를 저장할 state변수
  const[num,setNum] = useState(0);

  //서버에서 데이터 받을때 명령어 - axios.get().then().catch();

  // 마운트될때만 서버에서 데이터를 받기 위해 useEffect를 사용하는것이다
  useEffect(() => {
    //서버에서 데이터 받기
    //get 안에는 데이터를 요청할 url을 작성
    axios.get('/api/t2').
    //통신 성공 후 실행 내용 작성
    //res는 통신 성공에 대한 모든 정보가 담겨있는 객체
          then((res) => {
            //통신 성공 시 num변수에 서버에서 받아온 데이터를 저장!
            setNum(res.data);
          }).
    //통신 실패 시 실행 내용 작성
    //error는 통신 실패에 대한 모든 정보가 담겨있는 객체
          catch((error) => {});
  },[]);

  return (
    <>
    <h3>데이터 받기1</h3>
    <p>받은 데이터 : {num} </p>
    {console.log(5)}
    </>
  )
}
export default Axios_1
