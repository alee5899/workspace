import { Image, Keyboard, Pressable, StyleSheet, Text, TextInput, View } from 'react-native'
import React, { useEffect, useState } from 'react'
import { icon } from '../constants/icons'

const Task = ({e,cartList,setCartList}) => {

  //수정 상태 여부
  //각 상품이 수정 상태인지, 수정 상태가 아닌지 판단하는 변수
  //처음은 수정중이 아니니까 false를 사용
  const [isEditing,setIsEditing] = useState(false);

  // 수정을 위해서는 input태그에 입력한 글자,id도 필요
  // 전체 데이터도 필요

  // input태그에 입력한 데이터
  // 주의! props로 전달된 데이터를  state변수의 초기값으로 주면 안됨
  const[newText,setNewText ] = useState('');

  useEffect(()=>{
    setNewText(e.item)
  },[e]) 
  // 마운트 될때만 실행 : 화면 처음띄울때

  // 장바구니 목록 데이터 수정
  const handleCartList= () => {
    // 상품목록에서 현재 수정 중인 상품의 id를 찾아서
    // 찾은 상품의 item 속성값을 input 태그에 입력한
    // 글자로 바꿔준다.

    // 1번 풀이
    // const copyCartList = [...cartList];
    // for(const cart of copyCartList){
    //   if(cart.id === e.id){
    //     cart.item = newTex;
    //   }
    // }
    // setCartList(copyCartList)


    // 2번 풀이
    // find : 조건과 일치하는 데이터만 리턴한다.
    // filter : 조건과 일치하는 데이터만 필터링한다(제외한다)
    const copyCartList = [...cartList]
    //find는 배열 데이터에서  cart라는 변수를 줘서 그중에서 e.id를 하나 골라내는것 e.id란 내가 선택한 id cartlist데이터전체가 아니다
    const findCart = copyCartList.find((cart)=>{return cart.id === e.id});
    findCart.item = newText;
    // console.log(copyCartList)
    setCartList(copyCartList);
    
    //
    // {
    //   cartList.map((car,i)=>{
    //     return(

    //     )
    //   })
    // }
    // cartList;
    // e.id
    // newText;
    // setCartList();
  }
  return (
    
    <View style={styles.container} >
      {
      isEditing 
      ? 
        <>
          <TextInput
          style={styles.input}  
          autoFocus={true} 
          // 포커스 아웃 이벤트 
          onBlur={()=>{
            setIsEditing(false);
            setNewText(e.item)
          }}
          onChangeText={text=>setNewText(text)}
          value={newText}
          onSubmitEditing={()=>{handleCartList()}}
          />
        </>
        : (
        <>
          <Text style={styles.title}>{e.item}</Text>
          <Pressable onPress={() => setIsEditing(true)}>
            <Image source={icon.ICON_EDIT}/>
          </Pressable>
          <Image source={icon.ICON_DELETE} style={styles.img} />
        </>
      )}
    </View>
  );
};


export default Task

const styles = StyleSheet.create({
  container : {
    borderWidth : 1,
    margin : 12,
    backgroundColor : '#eeeeee',
    borderRadius : 4,
    flexDirection : 'row',
    alignItems : 'center',
    padding : 10,
    gap : 8 
  },

  title : {
    flex : 1,
    fontSize : 18,
  },
  img:{
    width:20,
    height:20
  },
  input: {
    borderWidth : 1,
    width : '100%'
  }
})