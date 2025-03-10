import React, { useState } from 'react'
import './Lotto.css'
import axios from 'axios';
import LottoNum from './LottoNum';

export const Lotte = () => {
  const[lotto,setLotto] = useState([0,0,0,0,0,0]);

  

  return (
    <>
      <h2>로또 자동 번호 생성기</h2>
      <div className='lotto'>
        {
          lotto.map((num,i)=>{
            return(
             <LottoNum key={i} num={num} 
             lotto = {lotto} 
             setLotto = {setLotto}
             i={i}
             />
            )
          })
        }
      </div>
    </>
  )
}
export default Lotte
