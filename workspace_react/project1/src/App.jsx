import './App.css'
import Footer from './components/Footer'
import { SideMenu } from './components/SideMenu'
import StateTest from './components/StateTest'

function Header(){
  return(
    <div>
      <div>header</div>
    </div>
  )
}

//작성내용은 앱 컴포넌트에 작성해야한다
function App() {
  let title = '오늘의 제목'
  let arr = [1,2,3];
  let person = {
    name : 'kim',
    age : 2,
  };

  //num의 값이 3이상이면 div보이게
  let num = 5;
  return (
   <>
     <StateTest/>
   {
    num > 3   ? <div>3이상입니다</div> : ''
   }
     <Header></Header>
     <Header />
     <div className='title'>{title}</div>
     <div>{10 +20}</div>
     <div>{arr}</div>
     <div>{person.name}</div>
     <SideMenu />
     <Footer/>
     <img/>
   </>
  )
}

export default App
