import axios from 'axios';
import React, { useState } from 'react'
import { useNavigate } from 'react-router-dom';
const BoardWriter = () => {
  const nav = useNavigate();
  const [writeData,setwriteData] = useState({});

  const changeWriteData = (e) =>{
    setwriteData({
      ...writeData,
      [e.target.name] : e.target.value
    });
  };


  console.log(writeData)
  //writeData

  //글 등록 버튼 클릭시 서버의 insert api실행
  const insertBoard = () => {
    axios.post('/api/boards',writeData)
          .then((res)=>{
            alert("게시글 등록 성공")
            nav('/')
            console.log(res.data)
            writeData(res.data)
          })
          .catch((error)=>{error})
  }

  return (
    <>
      <div>제목<input type="text" name='title' value={writeData.title} onChange={(e)=>{changeWriteData(e)}}/></div>
      <div>작성자<input type="text" name='writer' value={writeData.writer} onChange={(e)=>{changeWriteData(e)}} /></div>
      <div>내용<textarea rows={5} cols={50} name='content' value={writeData.content} onChange={(e)=>{changeWriteData(e)}}></textarea></div>
      <div><button type="button" onClick={(e)=>{
        {insertBoard()}
      }}>글등록</button></div>
    </>
  )
}

export default BoardWriter