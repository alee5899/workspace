import { Pressable, StyleSheet, Text, View } from "react-native";
import React from "react";
import { colors } from "../../constants/colorConstant";

const CustomButton = ({lable= '버튼',size='large', ...props}) => {  // lable로 들어오면 이름을 버튼으로 설정
  return (
    <Pressable style={({pressed})=> [
      styles.container,
      styles[size],
      pressed && styles.pressed // pressed는 눌렀을때 스타일
      ]}
      {...props}>  
      {/*스타일 여러개 주는법 -> 배열 형태로 주면 스타일 여러개 가능*/}
      <Text>{lable}</Text>
    </Pressable>
  );
};

export default CustomButton;

const styles = StyleSheet.create({
  container:{
    borderRadius: 8,
    justifyContent: "center",
    alignItems: "center",
    backgroundColor:colors.ORANGE_600
  },
  large:{
    width:'100%',
    height: 44
  },
  nomal:{
    width:'70%',
    height: 44
  }
  ,pressed:{
    opacity:0.8
  }
});
