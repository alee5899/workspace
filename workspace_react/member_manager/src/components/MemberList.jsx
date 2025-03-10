import axios from 'axios';
import React, { useEffect, useState } from 'react'
import { Link, useNavigate } from 'react-router-dom';
import MemberDetail from './MemberDetail';

export const MemberList = () => {
  //회원 목록데이터를 저장할 state변수
  const[MemberList,setMemberList]=useState([]);
  const nav = useNavigate();

  //회원목록 조회
  useEffect(()=>{
    axios.get('/api/members').
          then((res)=>{
            console.log(res.data);
            setMemberList(res.data);
          }).
          catch((error)=>{
            console.log(error);
          })
  },[]);

  return (
   <>
      <div>게시글 목록 페이지</div>
            <div>
              <table>
                <thead>
                  <tr>
                    <td>NO</td>
                    <td>회원ID</td>
                    <td>회원이름</td>
                    <td>회원연락처</td>
                    <td>가입일</td>
                  </tr>
                </thead>
                <tbody>
                  {
                    MemberList.map((member,i)=>{
                      return( 
                        <tr key={i}>
                          <td>{MemberList.length - i}</td>
                          <td>
                            <Link to={`/detail/${member.memId}`}><span>{member.memId}</span></Link>
                            </td>
                          <td>{member.memName}</td>
                          <td>{member.memTel}</td>
                          <td>{member.joinDate}</td>
                        </tr>
                      )
                    })
                  }
                </tbody>
              </table>

              <button type='button' onClick={(e)=>{nav('/join')}}>회원등록</button>
            </div>
   </>
   
  )
}
export default MemberList