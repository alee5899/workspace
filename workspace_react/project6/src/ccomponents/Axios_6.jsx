import axios from 'axios'
import React from 'react'

export const Axios_6 = () => {

  //axios의 post()함수의 두번째 매개변수로 
  //자바로 전달할 데이터를 작성할수있다
  //자바로 전달할 데이터는 객체형식으로 지정해야함
  axios.post('/api/t6',{name:'kim',age : 20}).then().catch();
  return (
    <>
      <div>axios를 사용하여 서버에 데이터를 전달하기</div>
    </>
  )
}
export default Axios_6