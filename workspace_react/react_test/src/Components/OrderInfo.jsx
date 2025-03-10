import React, { useState } from 'react'
import OrderList from './OrderList';
import OrderDetail from './OrderDetail';

export const OrderInfo = () => {
  const[order,setOrder] = useState({});

  //상세정보가 보일지/안보일지 결정하는 state변수
  const [isShow, setIsShow] = useState(false);
  return (
    <>
          <div className='container'>
        <div><h2>게시글 제목</h2></div>
        <OrderList setOrder = {setOrder} setIsShow={setIsShow}/>

        {
          isShow ? <OrderDetail order={order}/> :null
        }
        
      </div>
    </>
  )
}
export default OrderInfo