import { StyleSheet, Text, TextInput, View } from 'react-native'
import React, { useState } from 'react'
import { SafeAreaView } from 'react-native'
import MyTextInput from './MyTextInput'
import MyButton from './MyButton'

const Login = () => {

  const [data,setData] = useState({
    id : '',
    pw : ''
  });

  const changeData = (text,name) =>{
    setData({
      ...data,
      [name] : text
    })
  }
  const printHello = () =>{
    console.log('안녕하세요')
  }

  return (
    <View>
      <Text>Login</Text>

      {/* <TextInput 
      value={data.id} 
      onChangeText={text=>setId(text)}/>
      <TextInput 
      value={data.pw}
      onChangeText={text=>setPw(text)}/>
      <TextInput/> */}

      <MyTextInput placeholder={'aaa'}
      onChangeText={text => changeData(text,'id')}
      value={data.id}/>
      <MyTextInput placeholder={'bbb'}
      onChangeText={text => changeData(text,'pw')}
      value={data.pw}
      />


      {/* alert으로 안녕하세요 */}
      <MyButton  onPress={()=>{alert('안녕하세요')}}/>

      {/* console에 안녕하세요 */}
      <MyButton  size = 'large' onPress= {()=>{printHello()}}/>

        <MyButton 
        title='데이터 확인' 
        onPress={()=>{
          alert(`id = ${data.id},pw = ${data.pw}`)
        }}/>
    </View>
  )
}

export default Login

const styles = StyleSheet.create({})