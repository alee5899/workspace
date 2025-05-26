import { Pressable, StyleSheet, Text, View } from 'react-native'
import React from 'react'
import { useLocalSearchParams, useRouter } from 'expo-router'

const DetailScreen = () => {
  const router = useRouter()

   //router이동 시 전달되는 데이터 받기 
   const {id,age} = useLocalSearchParams();
  return (
    <View>
      <Text>디테일 스크린입니다 데이터 받음 : {id} / {age}</Text>

      <Pressable onPress={() => {router.push('/mypage')}}>
        <Text>마이페이지로 이동</Text>
      </Pressable>

      <Pressable onPress={() => {router.replace('/mypage')}}>
        <Text>마이페이지로 이동 replace</Text>
      </Pressable>
    </View>
  )
}

export default DetailScreen

const styles = StyleSheet.create({})