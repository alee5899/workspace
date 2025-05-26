import * as SecureStore from 'expo-secure-store';
import { jwtDecode } from 'jwt-decode';
import { loginReducer, logoutReducer } from './authSlice';


// 토큰에서 로그인한 회원 email 추출
// 토큰에서 email을 추출을 못하면 null을 리턴 있으면 email을 리턴
export const getUserSubFromToken = (token) => {
  if (!token) return null;

  /*
  falsy 값: false, 0, ''(빈문자), null, undefined, NaN

   try-catch문: 예외 처리
   try문을 하다가 오류가 발생하면 catch문을 실행

   기본 방식 (or연산자) -왼쪽 데이터가 falsy일때 오른쪽 데이터 실행
   const username = user.name || 'Guest';

   Nullish 병합 연산자 - 왼쪽 데이터가 null 또는 undefined일때 오른쪽 데이터 실행
   const username = user.name ?? 'Guest';
    */


  try {
    // 암호화 되어있는 토큰을 가져오는 코드 
    const decoded = jwtDecode(token);


    // 옵셔널 체이닝 연산자
    // decoded가 null 또는 undefined -> undefined
    return decoded?.sub || null;
  } catch (error) {
    console.log('jwtDecode 실패:', error);
    return null;
  }
};

export const getUserRoleFromToken = (token) => {
  if (!token) return null;

  try {
    const decoded = jwtDecode(token);
    return decoded?.role || null;
  } catch (error) {
    console.log('jwtDecode 실패:', error);
    return null;
  }
};