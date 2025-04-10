import './App.css'
import { Link, Route, Routes } from 'react-router'
import Login from './components/Login'
import Join from './components/Join'
import Admin from './components/Admin'
import UserPage from './components/UserPage'
import Header from './components/Header'
import Menu from './components/Menu'
import { jwtDecode } from 'jwt-decode'
import { useEffect } from 'react'
import axios from 'axios'
import { axiosInstance } from './redux/axiosInstance'


function App() {
  // const test = jwtDecode('Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ1c2VyIiwicm9sZSI6IlJPTEVfVVNFUiIsImlhdCI6MTc0NDI2NTk3OSwiZXhwIjoxNzQ0MjY3Nzc5fQ.Dg3uRQ7M8GXkpOh4wLvqcZvdTsTWnPbdB_smwhk_P9Mt6WYqAYmsADdL1fkEfSD2LwqIhnfNKKsyGGYOClJbtA')
  // console.log(test)

  useEffect(()=>{
    axiosInstance.get('/test1')
                  .then()
                  .catch();
  },[])
  return (
    <div>
      <Header />
      <Menu />
      <Routes>
          <Route path='' element={<div>메인페이지</div>}/>
          <Route path='/login' element={<Login />}/>
          <Route path='/join' element={<Join />}/>
          <Route path='/user' element={<UserPage/>}/>          
          <Route path='/admin' element={<Admin />}/>
      </Routes>
    </div>
  )
}

export default App

