import { configureStore } from "@reduxjs/toolkit";
import counterSclice from "./counterSlice";
import nameSlice from "./nameSlice";
import memberSlice from "./memberSlice";
import carListSlice from "./cartListSlice";

// slice들을 관리할 공용 저장소
export const store = configureStore({
  reducer : {
    counter : counterSclice.reducer,
    myName : nameSlice.reducer,
    member : memberSlice.reducer,
    cartList : carListSlice.reducer
  }
})