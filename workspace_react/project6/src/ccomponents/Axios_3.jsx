import axios from 'axios';
import React, { useEffect, useState } from 'react'

export const Axios_3 = () => {
  //서버에서 넘어오는 데이터를 저장할 변수의 초기값은 최종적으로 받는  데이터의 자료형과 일치시켜서  만들어줘야한다
  const [person,setPerson] = useState({});

  //서버에서 데이터를 받아 person 에 저장하는 함수
  const getPersonData = () => {
      //{}중갈호 받아오면 서버에서 }데이터 받아오기 해야한다
      axios.get('/api/t3')
      //then에는 통신 성공시 실행할 내용 작성
      //res는 통신 성공시 모든 데이터가 객체형태로 존재한다
      //우리가 서버에서 받은 데이터는 객체니까  res.data가 존재한다
      .then((res)=> {
        console.log('통신성공');
        console.log(res.data);
        setPerson(res.data);
      })
      //catch에는 통신 성공시 실행할 내용 작성
      //error : 통신 실패에 모든 데이터가 객체형태로 존재한다
      .catch((error)=> {
        console.log('통신실패');
        console.log(error);
      })
  };

  // useEffect  컴퍼넌트의 특정 생애주기 에 기능을 구현할때
  // 또는 기능을 실행할때 마운트 할때 리렌더링할때
  //서버에서 데이터 받을때 오래걸리기 때문에 useEffect를 사용한다 왜냐하면 그림 다 그린후 useEffect가 실행되기 때문이다
  // useEffect는 반복되는 데이터를 반복안되게 도와준다

  //서버에서 데이터받기위해서 axios를 사용
  return (
    <>
    <input type="button" value={'버튼'}
    onClick={(e) => {
      getPersonData();
    }}/>

    <div>
      <p>이름:{person.name}</p>
      <p>나이:{person.age}</p>
      <p>주소:{person.addr}</p>
    </div>
    </>
  )
}

export default Axios_3