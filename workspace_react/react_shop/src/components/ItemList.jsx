  import axios from 'axios'
import React, { useState } from 'react'
import { useNavigate, useParams } from 'react-router-dom';
import styles from './ItemList.module.css'
  
  const ItemList = () => {
    const  nav = useNavigate();
    const[itemList,setItemList] = useState([]);
    useState(()=>{
      axios.get('/api/items')
            .then((res)=>{
              console.log(res.data)
              setItemList(res.data)
            })
            .catch((error)=>{
              console.log(error)
            })
    },[])
    return (
      <>
        <div className={styles.item_container}>
          <h3>상품목록</h3>
          <table className={styles.item_table}>
            <thead>
              <tr>
                <td>NO</td>
                <td>상품명</td>
                <td>상품가격</td>
                <td>판매자</td>
              </tr>
            </thead>
            <tbody>
            {
            itemList.map((item,i)=>{
                return(
                  <tr key={i}>
                    <td>
                      {itemList.length-i}</td>
                    <td>
                      <span onClick={e =>{nav(`/detail/${item.itemNum}`)}}>{item.itemName}</span>
                      </td>
                    <td>{item.itemPrice}</td>
                    <td>{item.seller}</td>
                  </tr>
                )
              }
            )}
          </tbody>
          </table>  
        </div>
      </>
    )
  }
  
  export default ItemList