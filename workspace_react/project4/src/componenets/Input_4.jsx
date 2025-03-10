import React, { useState } from 'react'

export const Input_4 = () => {
  //모든 입력정보를 저장할 state변수 생성
  const[memberInfo,setMemberInfo] = useState({
    name : '',
    tel : '',
    mail : '',
    major : ''
  })

  //모든 input태그의 값이 변경될때 실행할 함수
  //input태그에 입력한 정보를 memberInfo에 저장하는 기능 

  const changeMemberInfo = (e) => {
    setMemberInfo({
      ...memberInfo,
      [e.target.name]  : e.target.value
    });
  };
  return (
    <>
    <div>회원가입서</div>
    이름 : <input name='name' type="text" value={memberInfo.name} onChange={(e)=>{
     changeMemberInfo(e);
    }}  />   

    <br /> 

    연락처 : <input name='tel' type="text" value={memberInfo.tel} onChange={(e)=> {
      changeMemberInfo(e);
    }} />

    <br /> 
    이메일 : <input  name='mail' type="text" value={memberInfo.mail} onChange={(e)=>{
      changeMemberInfo(e);
    }} />    
    <br />

    희망과목
    <select name='major' value={memberInfo}  onChange={(e)=>{
      changeMemberInfo(e);
    }}>
    <option value="국어">국어</option>
    <option value="영어">영어</option>
    <option value="수학">수학</option>
    </select>

    <br />
    <br />

    <div>작성내용</div>
     <div>이름 :{memberInfo.name} </div>
     <div>연락처 :{memberInfo.tel} </div>
     <div>이메일 :{memberInfo.mail} </div>
     <div>희망과목 :{memberInfo.major} </div>
    </>
   
  )
}
export default Input_4
