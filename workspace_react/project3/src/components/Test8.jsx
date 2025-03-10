import React, { useState } from 'react'
import './Test8.css'

export const Test8 = () => {
  const [isShow, setIsShow] = useState(false);
  return (
    <>
    <div>Test7</div>
      <div className='test8' 
      onMouseEnter={(e)=> {
        setIsShow(true);
      }} 
      onMouseLeave={(e)=> {
        setIsShow(false);
      }}>마우스를 올리면 글자 보임</div>
      {
        isShow ? <div className='test8'>React</div> : null
      }

    </>
  );
};

export default Test8;