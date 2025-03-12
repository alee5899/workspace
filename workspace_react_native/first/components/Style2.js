import { Pressable, SafeAreaView, StyleSheet, Text, TextInput, View } from 'react-native'
import React, { useState } from 'react'

const Style2 = () => {
  const [id,setId] = useState('');
  return (

    <SafeAreaView style ={styles.container}>
      <View style={styles.content}>
        <View>
          <Text>아이디</Text>
          <TextInput style={styles.input}
          // onChangeText={test=>{setId(test)}}
          onChange={(e)=>{
            console.log(e.nativeEvent.text)
          }}
          />
        </View>
        <View>
        <Text>비밀번호</Text>
        <TextInput style={styles.input}/>
        </View>
        <View style={styles.btnView}>
          <Pressable
            style={styles.btnContainer} 
            onPress={()=>{}}
          >
            <Text style={styles.btn}>로그인</Text>
          </Pressable>
        </View>
      </View>
    </SafeAreaView>
  )
}

export default Style2

const styles = StyleSheet.create({
  container : {
    flex : 1,
    justifyContent : 'center',
    padding : 20
  },
  content :{
    gap : 20
  },
  input : {
    borderWidth : 1,
    borderRadius : 4
  },
  btnContainer : {
    width : '50%',
    height:34,
    borderRadius:6,
    backgroundColor : 'blue',
    justifyContent : 'center',
    alignItems : 'center'
  },
  btn:{
  color : 'white'
  },
  btnView : {
    alignItems : 'center'
  }
})





  {/* //  <SafeAreaView>
  //     <View>
  //       <Text>아이디</Text>
  //       <TextInput style = {styles.v1}></TextInput>
  //     </View>
  //     <View>
  //       <Text>비밀번호</Text>
  //       <TextInput style = {styles.v1}></TextInput>
  //     </View>
  //     <View>
  //       <Pressable onPress={()=>{
  //         console.log("끝")
  //         }}>
  //       <Text>로그인</Text>
  //       </Pressable>
       
  //     </View>
  //  </SafeAreaView> */}