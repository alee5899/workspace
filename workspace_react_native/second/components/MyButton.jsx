import { Pressable, StyleSheet, Text, View } from 'react-native'
import React from 'react'
import { COLOR } from '../constants/colors'

const MyButton = ({size = 'normal',onPress,title = '버튼'}) => {
  return (
    <Pressable style={e => {
      console.log(e)
      return [styles.btnContainer,styles[size],e.pressed && styles.pressed]
    }}
    onPress={()=>{onPress()}}
    >
    {/* <Pressable style={[styles.btnContainer, styles[size]]}> */}
      <Text style={styles.btn}>{title}</Text>
    </Pressable>
  
  )
}

export default MyButton

const styles = StyleSheet.create({
  btnContainer :{
    height : 34,
    borderRadius : 6,
    backgroundColor : COLOR.BTN_BACKGROUND_COLOR,
    justifyContent : 'center',
    alignItems : 'center',
    paddingVertical : 2,  //상하
    paddingHorizontal : 4  //좌우
  },
  btn : {
    color : 'white'
  },
  normal : {
    width : '30%'
  },
  large : {
    width : '100%'
  },
  pressed : {
    opacity : 0.8
  }
})
//