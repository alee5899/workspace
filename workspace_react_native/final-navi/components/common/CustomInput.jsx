import { StyleSheet, Text, TextInput, View } from "react-native";
import React from "react";
import { colors } from "../../constants/colorConstant";

const CustomInput = ({ lable,isPw=false,...props }) => {
  //props로 부모태그로 부터  값을 받는다는 의미 
  // 이걸 쓴 시점부터 이것은 자식태그 로 값을 받아온다 
  return (
    <View>
      {
        lable && <Text style={styles.lable}>{lable}</Text>
      }
      <View style={styles.container}>
        <TextInput style={styles.input}
        secureTextEntry={isPw}
        {...props} 
         />
        {/* // 비밀번호 입력시 사용 */}
      </View>
    </View>
  );
};

export default CustomInput;

const styles = StyleSheet.create({
  lable: {
    fontSize: 12,
    marginBottom: 6,
    color: colors.GRAY_500
  },
  container: {
    height: 44,
    borderRadius: 8,
    paddingHorizontal: 10,
    justifyContent: "center",
    backgroundColor: colors.GRAY_100,
    borderColor: colors.ORANGE_600,
    borderWidth: 1, // 테두리 두께 ex) 1px
  },
  input:{
    fontSize: 16,
    flex: 1,
  }
});
