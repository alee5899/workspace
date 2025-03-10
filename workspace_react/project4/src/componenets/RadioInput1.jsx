import React, { useState } from 'react'

export const RadioInput1 = () => {
  const[a,setA] = useState({
    name : '',
    mail : '',
    pw : '',
    score : '',
    boolean : '',
    my : ''
  });

  const ac = (e) => {
    setA({
      ...a,
    [e.target.name] : e.target.value
    })
  }
  return (
    <>
      <div>이름 <input name='name' value={a.name} type="text" onChange={((e) => {
        ac(e);
      })}/></div>
      <div>이메일 <input name='mail' value={a.mail} type="text" onChange={((e) => {
        ac(e);
      })} /></div>
      <div>비밀번호 <input name='pw' value={a.pw} type="password" onChange={((e) => {
        ac(e);
      })} /></div>
      학과
      <select name='score' value={a.score} onChange={(e)=>{
        ac(e)
      }}>
        <option>wl</option>
        <option>후후</option>
        <option>이이</option>
      </select>
      <div>성별
        <input name='boolean' type="radio" value='남'  onChange={(e)=>{
          ac(e)
         }}/>남자
        <input name='boolean' type="radio" value='여'  onChange={(e)=> 
        {ac(e)
        }} />여자
      </div>
      <textarea name='my' onChange={(e)=> {
        ac(e)
      }}></textarea>자기소개    

      <br />
      이름{a.name}
      <br />
      이메일{a.mail}
      <br />
      비밀번호{a.pw}
      <br />
      학과{a.score}
    <br />
    성별{a.boolean}
    <br />
    자기소개{a.my}
    </>
   
  )
}
export default RadioInput1