import { Route, Routes } from 'react-router-dom'
import './App.css'
import './Common.css'
import InputTest from './components/InputTest'
import ItemList from './components/ItemList'
import ItemDetail from './components/ItemDetail'
import Header from './components/Header'
import ItemInsert from './components/ItemInsert'
import ItemInfo from './components/ItemInfo'
import OrderList from './components/OrderList'
import Oreder from './components/Oreder'
function App() {

  return (
    <>
    <div className='container'>
      <Header/>
     {/* <InputTest/> */}
     <Routes>
      {/* 상품정보 페이지 */}
      <Route path='' element={<ItemInfo/>}/>
      {/* 상품등록 페이지 */}
      <Route path='/reg-item' element={<ItemInsert/>}/>
      {/* 주문하기 페이지 */}
      <Route path='/order' element={<Oreder/>}/>
      {/* 주문등록 */}
      <Route path='/order-list' element={<OrderList/>}/>

      {/* <Route path='' element={<ItemList/>}/> */}
      {/* <Route path='/detail/:itemNum' element={<ItemDetail/>}/> */}
     </Routes>
      </div>
    </>
  )
}

export default App
