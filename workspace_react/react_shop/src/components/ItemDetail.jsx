import React from 'react'
import styles from './ItemDetail.module.css'
import dayjs from 'dayjs'
const ItemDetail = ({itemDetail}) => {
  return (
    <>
      <h3>상품 상세 정보</h3>
            <table className={styles.detail_table}>
              <tbody>
                <tr>
                  <td>상품번호</td>
                  <td><input type="text"  className='my-input wide'value={itemDetail.itemNum}/></td>
                </tr>
                <tr>
                  <td>상품명</td>
                  <td><input type="text"  className='my-input wide' value={itemDetail.itemName}/></td>
                </tr>
                <tr>
                  <td>상품가격</td>
                  <td><input type="text" className='my-input wide'value={itemDetail.itemPrice} /></td>
                </tr>
                <tr>
                  <td>판매자</td>
                  <td><input type="text" className='my-input wide'value={itemDetail.seller} /></td>
                </tr>
                <tr>
                  <td>상품등록일</td>
                  <td><input type="text"  className='my-input wide' value={itemDetail.regDate ? dayjs().format('YYYY-MM-DD HH:mm:ss') : ''}/></td>
                </tr>
                <tr>
                  <td>상품설명</td>
                  <td><textarea  className='my-input wide'value={itemDetail.itemIntro}></textarea></td>
                </tr>
              </tbody>
            </table>
            <div>
              <button type="button" className='btn btn-large'>수정</button>
            </div>
    </>
   
  )
}

export default ItemDetail