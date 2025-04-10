import { createSlice } from "@reduxjs/toolkit";

const memberSlice =  createSlice({
  name : 'mamber',
  initialState : {
    memId : 'hong',
    memAge : 20
  },
  reducers : {
    handeleMemberId : (state,action) =>{
      // return{...state, memId : 'java'}
      state.memId = action.payload;
    }
  }
})

export const {handeleMemberId} = memberSlice.actions;
export default memberSlice;