import React, { useState } from 'react'

const ObjectTest = () => {
  const[monitor, setMonitor] =  useState({
      brand : 'samsung',
      price : 10000,
      color : 'black'
    });

  return (
    <>
    <div>object</div>
    브랜드 : {monitor.brand} <br />
    가격 : {monitor.price} <br />
    색상 : {monitor.color} <br />
    <button type='button' onClick={() => {
      //새로운 객체 생성
      // const copyMonitor = {...monitor}
      // copyMonitor.brand = 'Lg'
      // setMonitor(setMonitor);

      setMonitor({
        ...monitor,
        brand : 'Lg'
      });
      setMonitor();
    }}>버튼</button>
    </>
  );
};

export default ObjectTest 