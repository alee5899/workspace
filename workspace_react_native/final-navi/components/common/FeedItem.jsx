import { Pressable, StyleSheet, Text, View } from "react-native";
import React from "react";
import {colors} from '@/constants/colorConstant';
import Octicons from '@expo/vector-icons/Octicons';
import MaterialCommunityIcons from '@expo/vector-icons/MaterialCommunityIcons';
import Profile from "@/components/Profile";

const FeedItem = ({item}) => {
  const isLike = true;

  return (
    <View style={styles.feedContainer}>
      <Profile writer={item.writer} createDate={item.createDate}/>
      <Text style={styles.title}>{item.title}</Text>
      <Text style={styles.content} numberOfLines={2}>
        {item.contnent}
      </Text>
      <View style={styles.menuContainer}>
        <Pressable style={styles.menu}>
          <Octicons name={isLike ? 'heart-fill' : 'heart'} size={20} color="red" />
          <Text style={isLike && {color : 'red'}}>{item.likeCnt}</Text>
        </Pressable>
        <Pressable style={styles.menu}>
          <Octicons name="comment" size={20} color="black" />
          <Text>{item.replyCny}</Text>
        </Pressable>
        <Pressable style={styles.menu}>
          <MaterialCommunityIcons name="eye-outline" size={20} color="black" />
          <Text>{item.redCnt}</Text>
        </Pressable>
      </View>
    </View>
  );
};

export default FeedItem;

const styles = StyleSheet.create({
  feedContainer:{
    padding:16,
    backgroundColor:'white'
  },
  menuContainer:{
    flexDirection:'row',
    justifyContent:'space-around',
    alignItems:'center',
    borderTopWidth:StyleSheet.hairlineWidth,
    borderTopColor:colors.GRAY_300
  },
  menu:{
    flexDirection:'row',
    alignItems:'center',
    justifyContent:'center',
    paddingVertical:16,
    gap:5,
    // borderWidth:1,
    width:'33.3%',
  },
  title:{
    fontSize:16,
    marginBottom:12,
  },
  content:{
    marginBottom:14,
    fontSize:14,
    Color:colors.GRAY_600,
  }
});
