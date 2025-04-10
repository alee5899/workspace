import { createSlice } from "@reduxjs/toolkit";
import Login from "../components/Login";
import { jwtDecode } from "jwt-decode";

const getToken = ()=>{
  const token =localStorage.getItem('accessToken')

  //token이 없으면 null을 리턴후 함수 종료
  if(token === null) return null;
  
  //토큰의 payload 부분을 해석해서 객체로 리턴
  const decodedToken = jwtDecode(token);

  //현재날짜 및 시간/(현재 날짜 및 시간을 가져오면 밀리세컨드단위로 단위를 가져옴)
  const currentTime = Date.now() / 1000;

  // 토큰의 만료시간이 지났으면
  if(decodedToken.exp < currentTime){
    return null;
  }
  return token;

}

const authSlice = createSlice({
  name : 'auth',
  initialState : {token : getToken()},
  reducers : {
    loginReducer : (state,action)=>{
      state.token = action.payload;
      localStorage.setItem('accessToken',action.payload);
    },
    logoutReducer : (state)=>{
      state.token = null;
      localStorage.removeItem('accessToken')
    }
  }
})

export const {loginReducer,logoutReducer} = authSlice.actions; 
export default authSlice;