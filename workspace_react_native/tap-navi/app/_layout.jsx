import { StyleSheet, Text, View } from 'react-native'
import React from 'react'
import { Stack } from 'expo-router'

// app/_layout.jsx
const _Layout = () => {
  return (
    <Stack screenOptions={{ headerShown: false }}/>
  )
}

export default _Layout

const styles = StyleSheet.create({})