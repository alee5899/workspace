import axios from 'axios';
import React, { useEffect, useState } from 'react'
import { data, Link, useNavigate, useParams } from 'react-router-dom';
import BoardWriter from './BoardWriter';
import './boardList.css'
import styles from './BoardList.module.css'
import dayjs from 'dayjs';

const BoardList = () => {
  //조회한 게시글 목록 데이터를 저장할 state변수
  const [boardList,setBoardList] = useState([]);
  const nav = useNavigate();
  const param = useParams(); 
  //서버에서 게시글 목록 받아오기
  useEffect(()=>{
    axios.get('/api/boards')
          .then((res)=>{
            console.log(res.data)
          setBoardList(res.data)})
          .catch((error)=>{
            console.log(error)
          })
  },[])
  const [data,setData] = useState({
    age: "",
    name: ""
  })
  const changeData=(e)=>{
    setData({
      ...data,
      [e.target.name] : e.target.value
    })
  }

  //검색창에 입력한 데이터를 저장할 변수
  const [searchData,setSearchData] = useState({
    searchKeyword: "TITLE",
    searchValue: ""
  });

  //검색창 내용 변경 시 실행되는 함수
  const changeSearchData = (e) =>{
    setSearchData({
      ...searchData,
      [e.target.name] : e.target.value
    })
  }

  console.log(searchData);

  //검색 버튼 클릭 시 실행 함수
  const searchList = () =>{
    axios.get(`/api/boards?searchKeyword=${searchData.searchKeyword}&searchValue=${searchData.searchValue}`)
    .then(res=>{setBoardList(res.data)})
    .catch(error =>{console.log(error)})
  }

  return (
    <>
    <div>자유게시판</div>
    <div>
      <select value={searchData.searchKeyword} name='searchKeyword' 
      onChange={(e)=>{changeSearchData(e)}}>
        <option value="TITLE">제목</option>
        <option value="WRITER">작성자</option>
      </select>
      <input type="text" name='searchValue' value={searchData.searchValue} onChange={(e)=>{changeSearchData(e)}}/>
      <button type='button' onClick={e=>searchList()}>검색</button>
    </div>
    <div>
      <table className={[styles.list].join(' ')}>
        <thead>
          <tr>
            <td className='aaa bbb'>NO</td>
            <td>제목</td>
            <td>작성자</td>
            <td>작성일</td>
            <td>조회수</td>
          </tr>
        </thead>
        <tbody>
          {
            boardList.length == 0
            ?
            <tr>
              <td colSpan={5}>등록된 게시글이 없습니다</td>
            </tr>
            :
            boardList.map((board,i)=>{
              return(
              <tr key={i}>
                <td>{boardList.length - i}</td>
                <td>
                  <span onClick={(e)=>{nav(`/detail/${board.boardNum}`)}}>{board.title}</span>
                  </td>
                <td>{board.writer}</td>
                <td>{dayjs(board.regDate).format('YYYY년 MM월 DD일')}</td>
                <td>{board.readCnt}</td>
              </tr>
              )
            })
          }
        </tbody>
      </table>
            <button type='button' onClick={(e)=>{
              nav('/writer')
            }}>글쓰기</button>

            {/* 아래 나이, 이름 입력값을 Qurey String 방식으로 */}
            {/* 버튼 클릭 시 /tesr url로 전달하세요  */}
            <div>Qurey String 실습</div>
            <div>나이: <input type="text" name='age' value={data.age}
            onChange={(e)=>{changeData(e)}}/></div>
            <div>이름: <input type="text" name='name' value={data.name}
            onChange={(e)=>{changeData(e)}} /></div>
            <button type="button" onClick={(e)=>{
              nav(`/test?age=${data.age}&name=${data.name}`)
            }}>Qurey String</button>
    </div>
    </>
   
  )
}

export default BoardList