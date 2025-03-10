import { Route, Routes } from 'react-router-dom'
import './App.css'
import BoardList from './components/BoardList'
import BoardWriter from './components/BoardWriter'
import BoardDetail from './components/BoardDetail'
import BoardUpdate from './components/BoardUpdate'
import QueryString from './components/QueryString'
import UseEffectTest from './components/UseEffectTest'

function App() {

  return (
    <div className='container'>
    <h1>게시판 프로젝트</h1>
      {/* <UseEffectTest/> */}
      <Routes>
        {/* 게시글 목록 페이지 */}
        <Route path='' element={<BoardList/>}/>
        {/* 글 작성 페이지 */}
        <Route path='/writer' element={<BoardWriter/>}/>
        {/* 상세 보기 페이지 */}
        <Route path='/detail/:boardNum' element={<BoardDetail/>}/>
        {/*게시글 수정 페이지 */}
        <Route path='/update/:boardNum' element={<BoardUpdate/> }/>

        {/* 쿼리 스트링 연습 페이지 */}
        <Route path='/test' element={<QueryString/>}/>
      </Routes>
    </div>
  )
}

export default App