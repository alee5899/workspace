import { createSlice } from "@reduxjs/toolkit";
import { carList } from "./data";

const carListSlice = createSlice({
  name: "cartList",
  initialState: carList,
  reducers: {
    addCart: (state, actions) => {
      // return[...state,actions.payload]
      state.push(actions.payload);
    },
  },
});

export const { addCart } = carListSlice.actions;
export default carListSlice;
