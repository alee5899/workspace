import axios from 'axios';
import React, { useState } from 'react'
import { useNavigate } from 'react-router-dom';
//입력한 모든 정보를 저장할 state변수
export const Join = () => {
  const nav = useNavigate();
  const [regData,setRegData] = useState({
      memId : "",
      memName: "",
      memPw: "",
      memTel:"",
      memIntro: "",
      pwConfirm: ""
  });

  //input 태그에 값 입력시 실행 할 함수
  const changeRegData = (e)=>{
    setRegData({
      ...regData,
      [e.target.name] :e.target.value
    })
  }

  const validateRegData = ()=>{
    let isValid = true;
    if(regData.memId === ''){
      alert('ID는 필수 입력입니다')
      isValid = false;
    }
    if(regData.memName === ''){
      alert('이름은 필수입력입니다')
      isValid = false;
    }
    if(regData.memPw!==regData.pwConfirm){
      alert('입력한 비밀번호를 확인하세요')
      isValid = false;
    }
  return isValid;
  }
  //가입버튼 클릭시 실행함수
  const regMember = ()=>{
    //데이터 유효성검사(validation 처리)
    if(!validateRegData()){
      return;
    }
    validateRegData();
    axios.post('/api/members',regData)
          .then((res)=>{
            if(res.data !==1){
              alert('알수 없는 이유로 오류가 발생했습니다');
              return;
            }

            alert(`${regData.memId}님 가입을 축하합니다`);
            nav('/');

          
          })
          .catch((error)=>{
            console.log(error)
          })
  }
  console.log(regData)
  return (
    <>
    <div>회원등록</div>
    <div>아이디<input type="text" 
                value={regData.memId}
                name='memId'
                onChange={(e)=>{changeRegData(e)
    }}/></div>
    <div>이름<input type="text" 
    value={regData.memName} name='memName' onChange={(e)=>{changeRegData(e)
    }} /></div>
    <div>비밀번호<input type="password"  value={regData.memPw}name='memPw' onChange={(e)=>{changeRegData(e)
    }}/></div>
    <div>비밀번호 확인<input type="password"  value={regData.pwConfirm}  name='pwConfirm' onChange={(e)=>{changeRegData(e)
    }}/></div>
    <div>연락처<input type="text" value={regData.memTel} name='memTel' onChange={(e)=>{changeRegData(e)
    }} /></div>
    <div>회원소개<input type="text" value={regData.memIntro} name='memIntro' onChange={(e)=>{changeRegData(e)
    }} /></div>
    <button type='button' onClick={(e)=>{
      regMember();
    }}>가입</button>
    </>
   
  )
}
export default Join