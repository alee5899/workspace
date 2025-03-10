import React, { useState } from 'react'

export const Input_2 = () => {

  //이름을 입력하는 input 태그에 작성한 내용을 저장할 state 변수
  // const[name,setName] = useState('');
  // const[age,setAge] = useState('');
  // const[addr,setAddr] = useState('');

  //모든 input태그에 입력한 데이터를저장할 state변수

  const[data, setData] = useState({
    name: '',
    age: '',
    addr: ''
  });
  // input태그의 값이 변경되는 실행시킬 함수
  function ChangeData(e){
    setData({
      //스프레드 문법 -객체와 배열만 사용가능
      ...data,
      //스프레드 사용하면 이렇게 된다
      // name: '',
      // age: '',
      // addr: ''
      [e.target.name] : e.target.value
      //변수를 사용할려면 key값 사용
    });
  }

  return (
    <>

      {/*set으로 변수의 값(데이터)을 새로운 값(데이터)로 저장해서 리렌더링한다(재출력) */}
      이름: <input name='name' type="text" value={data.name} onChange={(e) => {
        ChangeData(e);
      }}/>  
      <br />

      나이: <input name = 'age' type="text" value={data.age} onChange={(e) => {
        ChangeData(e);
      }} />  
      <br />

      주소: <input name='addr' type="text" value={data.addr} onChange={(e)=>{
        ChangeData(e);
        // setAddr(e.target.value);
        // setData({
        //   ...data,
        //   addr : e.target.value
        // })
      }}/>  
      <br />

      <div>
        입력받은 이름 :{data.name}
      </div>
      <div>
        입력받은 나이 :{data.age}
      </div>
      <div>
        입력받은 주소 :{data.addr}
      </div>

    </>
   
  )
}
export default Input_2