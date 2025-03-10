import axios from 'axios';
import React, { useEffect, useState } from 'react'

export const Axios_8 = () => {
  //모든 입력값을 저장할 state 변수
  const [food,setFood] = useState({
    orderInfo : '', // 왜 빈문자?
    count : 1,
    option : "토핑",
    text : '',
    time : ''
  });

  console.log(food)

  //모든 입력값이 변경될때 마다 실핼시킬 함수
  const dataC = (e) => {
    //food변수를 변경시키고 싶어서 =>setFood(); 사용

    setFood({});
    //setfood 앞의 food의 데이터를 변경하고 리렌더링 하는 기능
    //(내용) : 내용? food의 데이터를  안에 있는 내용으로
    //setFood({}) : food의 데이터를 변경하고 리렌더링해주는기능, 안에있는 내용으로, 객체 
    // () 안에있는 객체로 데이터를 변경해주고 리렌더링해준다


    setFood({
      ...food,
      count : 4,
      [e.target.name] : e.target.value,
    });
  };
  // 객체안에 있는 내용으로 데이터를  변경해주고 

  //전송 버튼 클릭 시 서버로 데이터를 보내는 기능의 함수
  const sendData = () => {
    axios.post('api/t9',food)
    .then((res)=>{
      alert('서버로 데이터를 전송했습니다')
    })
    .catch((error)=>{
      console.log(error);
    })
  }
  return (
    <>
    <div>
      음식선택
      <select  name='orderInfo'  value={food.orderInfo} onChange={(e)=>{
        setFood({
          ...food
          , orderInfo : e.target.value
        })
      }} >
        <option value="선택">선택</option>
        <option value="치킨">치킨</option>
        <option value="피자">피자</option>
        <option value="족발">족발</option>
      </select>
    </div>
    <div>수량<input type="number" value={food.count} name='cnt' onChange={(e)=>{
      dataC(e)
        console.log(e.target.value);
        setFood({...food, count : e.target.value})
      }} /></div>
    <div>
      추가선택 <input type="radio"  name='option'value={"토핑"} checked={food.option === "토핑"} onChange={(e)=>{
        dataC(e)
      }}/>토핑추가
      추가선택 <input type="radio" name='option' value={"음료"} checked={food.option === "음료"} onChange={(e)=>{dataC(e)}}/>음료추가
      추가선택 <input type="radio"  name='option' value={"공기밥"} checked={food.option === "공기밥"} onChange={(e)=>{
        dataC(e)
      }}/>공기밥추가
    </div>
    <div>
      요청사항<textarea value={food.text} name='text'  onChange={(e)=>{
        dataC(e)
      }}  />
    </div>
    <div>주문일시<input type="date" value={food.time} name='time' onChange={(e)=>{
      dataC(e)
      }} /></div>
    <button type='button' value={food.time} onClick={(e)=>{
      dataC(e);
      sendData();
    }}>전송</button>
    <button type='button' onClick={(e)=>{}}>데이터 확인버튼</button>

    
    </>
  )
}

export default Axios_8

//option에는 value속성을 포함한다 무조건!!!!!