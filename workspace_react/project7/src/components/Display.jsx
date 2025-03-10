import React from 'react'

export const Display = (props) => {
  console.log(props.cnt);
  return (
    <>
   <div>
      <p>현재카운트 : </p>
      <h2>{props.cnt}</h2>
   </div>
    </>
  )
}

export default Display