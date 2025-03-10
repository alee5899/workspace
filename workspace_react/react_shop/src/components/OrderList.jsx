import axios from 'axios';
import React, { useEffect, useState } from 'react'
import Oreder from './Oreder';

const OrderList = () => {
  //주문 목록 조회 데이터
  const [orderLIst,setOrderLIst] = useState([]);
  useEffect(()=>{
    axios.get('/api/orders')
    .then(res=>{setOrderLIst(res.data);
      console.log(res.data);
    })
    .catch(error=>console.log(error))
  },[])
  return (
    <>
    <h3>총3건의주문정보가검색되었습니다</h3>
    <table>
      <thead>
        <tr>
          <td>NO</td>
          <td>상품명</td>
          <td>상품단가</td>
          <td>구매수량</td>
          <td>구매가격</td>
          <td>주문자</td>
          <td>주문일</td>
        </tr>
      </thead>
      <tbody>
        {
          orderLIst.map((order,i)=>{
            return (
              <tr key={i}>
                <td>{orderLIst.length - i}</td>
                <td>{order.itemDTO.itemName}</td>
                <td>{order.itemDTO.itemPrice}</td>
                <td>{order.buyCnt}</td>
                <td>{order.buyPrice}</td>
                <td>{order.buyer}</td>
                <td>{order.buyDate}</td>
              </tr>
            )
          })
        }
      </tbody>
    </table>
    </>
   
  )
}

export default OrderList