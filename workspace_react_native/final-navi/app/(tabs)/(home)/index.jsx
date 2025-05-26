import { FlatList, Pressable, StyleSheet, Text, View } from 'react-native'
import React from 'react'
import Octicons from '@expo/vector-icons/Octicons';
import MaterialCommunityIcons from '@expo/vector-icons/MaterialCommunityIcons';
import {colors} from '@/constants/colorConstant';
import FeedItem from '../../../components/common/FeedItem';
import { dummyDate } from '../../../apis/dummyDate';
import Ionicons from '@expo/vector-icons/Ionicons';


const HomeScreen = () => {
  const data = dummyDate;
  return (
    <View style={styles.container}>
      <FlatList 
        data={data} //반복 돌릴 데이터
        renderItem={({item})=> {return <FeedItem item={item} />}} // 데이터마다 진행할 코드
        keyExtractor={(item)=> item.id}
        contentContainerStyle={styles.listContainer} // FlatList 디자인
      />
      <Pressable style={styles.writerBtn}>
        <Ionicons name="pencil-outline" size={24} color="white" />
      </Pressable>
    </View>
  )
}

export default HomeScreen

const styles = StyleSheet.create({  
  container: {
    flex: 1,
    backgroundColor:'white',
  },
  listContainer:{
    backgroundColor : colors.GRAY_200,
    gap:10,
    paddingVertical : 14,
    backgroundColor:colors.GRAY_200
  },
  writerBtn:{
    position:'absolute',
    width:50,
    height:50,
    backgroundColor : colors.ORANGE_600,
    borderRadius : 50,
    justifyContent : 'center',
    alignItems: 'center',
    bottom : 20,
    right:10
  }
  
})