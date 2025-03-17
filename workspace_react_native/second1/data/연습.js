const cartList = [
  {id : 1, item : '계란'},
  {id : 2, item : '세제'},
  {id : 3, item : '라면'}
]

//carList에서 id가 2인 데이터 찾기
//e : 배열에 있는 데이터 하나 하나
//find : return에 작성한 조건문과 일치하는 데이터만
const aaa1 = cartList.find((e)=>{return e. id ===2});
const aaa2 = cartList.find(e=> e. id === 2);
//retutn은 중갈호 삭제 가능


// filter : 리턴문에 작성한 조건과 일치하는 데이터는 걸러낸다
 
cartList.map((e,i)=>{});

//carList에서 id가 2인 데이터 찾기
  for(const e of cartList){
    if(e.id === 2){
      //찾음
    }
  }