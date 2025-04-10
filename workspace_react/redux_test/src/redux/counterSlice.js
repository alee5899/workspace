import { createSlice } from "@reduxjs/toolkit"

// 숫자를 저장하고 있는state 변수를 만듬
// const [counter,setCounter] = useState(5)
const counterSclice = createSlice({
  name : 'counter',
  //초기값
  initialState : 5,
  //상태를 변경하는 함수
  reducers : {
    increase : (state) => { // state : state변수의 값
      return state + 1; // return되는 데이터로 state값을 변경
    },
    decrease : (state) => {
      return state - 1 ;
    },
    //매개변수로 들어온 데이터만큼 counter값을 증가
    handleCounter : (state,actions)=>{
        return state + actions.payload;
    }
  }
});


export const {increase,decrease,handleCounter} = counterSclice.actions; 

export default counterSclice;