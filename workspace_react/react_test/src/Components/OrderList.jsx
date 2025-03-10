import axios from 'axios';
import React, { useEffect, useState } from 'react'

export const OrderList = ({setOrder, setIsShow}) => {
  const [OrderList,setOrderList] = useState([]);

 useEffect(()=>{
    axios.get("/api/orders")
    .then((res)=>{
      console.log(res.data);
      setOrderList(res.data);
    })
    .catch((error)=>{
      console.log('오류발생');
      console.log(error);
    })
  },[]);
  axios
  return (
    <div>
      <table className='list-table'>
        <colgroup>
        <col width={'10%'} />
        <col width={'*'} />
        <col width={'20%'} />
        <col width={'20%'} />
        </colgroup>
        <thead>
          <tr>
            <td>NO</td>
            <td>상품명</td>
            <td>상품가격</td>
            <td>수량</td>
            <td>총구매 가격</td>
          </tr>
        </thead>
        <tbody>
          {
            OrderList.map((order, i)=>{
              return(
                <tr key={i}onClick={(e)=>{
                  for(let i = 0; i < OrderList.length; i++){
                    console.log(order.orderNum)
                    if(OrderList[i].orderNum == order.orderNum){
                      setOrder(OrderList[i]);
                    }
                  }
                  setIsShow(true);
                }}>
                  <td>{OrderList.length - i}</td>
                  <td>{order.itemName}</td>
                  <td>{order.price}</td>
                  <td>{order.count}</td>
                  <td>{order.price * order.count}</td>
                </tr>
              )
            })
          }
        </tbody>
      </table>
    </div>
  )
}
export default OrderList
