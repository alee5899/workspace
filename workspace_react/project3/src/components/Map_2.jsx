import React from 'react'

export const Map_2 = () => {
  const arr = ['짜장면','짬뽕','탕수육']
  return (
    <>
    <ul>
      {
        //반복적으로 그릴대 map
        arr.map((food,i) => {
          return(
            <li key={i}>{food}</li>
          )
        })
      }
    </ul>
    </>
  )
}

export default Map_2
