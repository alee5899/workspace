import React from 'react'

export const OrderDetail = ({order}) => {
  return (
    <>
      <div>
        <table className='detail-table'>
          <colgroup>
          <col width={'20%'}/>
          <col width={'30%'}/>
          <col width={'20%'}/>
          <col width={'30%'}/>
          </colgroup>
          <tbody>
            <tr>
              <td>상품번호</td>
              <td>{order.itemNumber}</td>
              <td>상품명</td>
              <td>{order.itemName}</td>
            </tr>
            <tr>
              <td>가격</td>
              <td>{order.price}</td>
              <td>수량</td>
              <td>{order.count}</td>
            </tr>
            <tr>
              <td>주문자ID</td>
              <td>{order.id}</td>
              <td>구매금액</td>
              <td>{order.price*order.count}</td>
            </tr>
          </tbody>
        </table>
     </div>
    </>
  )
}
export default OrderDetail