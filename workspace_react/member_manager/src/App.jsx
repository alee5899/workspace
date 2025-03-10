import { Route, Routes } from 'react-router-dom'
import './App.css'
import MemberList from './components/MemberList.jsx'
import MemberDetail from './components/MemberDetail.jsx'
import Join from './components/Join.jsx'
import MemberUpdate from './components/MemberUpdate.jsx'
import InputTest from './components/InputTest.jsx'

// React_MEMBER 테이블에 저장된 모든 회원 정보를 조회하여 
// MemberList 컴포넌트에 table 형식으로 표현하세여
// 테이블의 컬럼:No(행번호),회원ID,회원명,회원연락처,가입일

function App() {
  return (
    <>
      <div>
        <h1>회원 관리 프로그램</h1>
      </div>
      <Routes>
        {/* 회원 목록 페이지 */}

        {/* '' : localhost:5173 */}
        {/* '/' : localhost:5173/ */}
        <Route path="/" element={<MemberList />} />

        {/* 회원 상세 정보 페이지 */}
        <Route path="/detail/:memId" element={<MemberDetail />} />

        {/* 회원 등록 페이지 */}
        <Route path="/join" element={<Join />} />

        {/* 회원 수정 페이지 */}
        <Route path="/update/:memId" element={<MemberUpdate/>} />
      </Routes>
      {/* <InputTest/> */}
    </>
  );
}

export default App