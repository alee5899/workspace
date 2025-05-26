import { StyleSheet, Text, TextInput, View } from 'react-native'
import React, { useState } from 'react'
import CustomInput from '../../components/common/CustomInput'
import CustomButton from '../../components/common/CustomButton'
import { api_join } from '../../apis/memberApi'

const JoinScreen = () => {
  const [joinData,setJoinData] = useState({
    memEmail:'',
    memPw:'',
    memName:'',
  })
  const handleJoinData = (text,name) => {
    setJoinData({
      ...joinData,
      [name]: text
    })
  }


  const join = () =>{
    console.log(joinData)

    api_join(joinData)
    .then(res => alert(성공))
    .catch(error => console.log(error))
  }
    
  return (
    <View>
      <View>
        <TextInput onChangeText={(text)=>{handleJoinData(text,'memEmail')}}/>
        <CustomInput 
        lable={'아이디'}
        //label은 자식태그인 props로 값을 전달해준다는 의미 
        value={joinData.memEmail}
        onChangeText={text =>{handleJoinData(text,'memEmail')}}/>
        {/* text -> input태그에 입력한 글자 */}
      </View>
      <View>

        
        <CustomInput lable={'비밀번호'} isPw={true}
        value={joinData.memPw}
        onChangeText={text =>{handleJoinData(text,'memPw')}}
        />
      </View>
      <View>
        <CustomInput lable={'이름'}
        value={joinData.memName}
        onChangeText={text =>{handleJoinData(text,'memName')}}/>
      </View>
      <View>
        <CustomButton lable={'회원가입'} 
        size='large'
        onPress={()=>join()}
        />
      </View>
    </View>
  )
}

export default JoinScreen

const styles = StyleSheet.create({})