import { createSlice } from "@reduxjs/toolkit";

// const [name,setName] = useState('hong')
const nameSlice = createSlice({
  name : 'name',
  initialState:'hong',
  reducers : {
    changeName : (state,action)=>{
      // return state + action.payload;
      state.data += action.payload; 
    }
  }
});

export default nameSlice;