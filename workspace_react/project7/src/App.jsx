import './App.css'
import { Counter } from './components/Counter'
import Header from './components/Header'
import Lotte from './components/Lotte'
import LottoNum from './components/LottoNum'
import Score from './components/Score'
// import './Score.css'
// 구조분해 할당(배열,객체)
// const arr =[1,2,3]
// const [a1,b2,b3]
// const person = {
//   name : 'kim',
//   age : 20,
//   addr : '울산'
// };
// function aaa({age,name}){
//   console.log(name);
//   console.log(age);
// }
// let major = '회계'
function App() {
  return (
    <>
     {/* <Header hobby = {'react'} age = {20} major = {major}/>
     <div className={'sss'}>
      react</div> */}
      {/* <Counter/> */}
      {/* <Score/> */}
      <Lotte/>

    </>
  )
}

export default App
