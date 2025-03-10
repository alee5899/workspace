const foodList = [
  {
    name : '김치찌개',
    price : 12000,
    type : '한식',
    material : ['김치','두부', '돼지고기']
  }, 
  {
    name : '짜장면',
    price : 8000,
    type : '중식',
    material : ['춘장','밀가루', '양파', '오이']
  }, 
  {
    name : '불고기',
    price : 15000,
    type : '한식',
    material : ['소고기','양파', '대파']
  }, 
  {
    name : '탕수육',
    price : 25000,
    type : '중식',
    material : ['돼지고기','밀가루']
  }
];
const aaa = [];//변수명

const bbb = {};//객체명

console.log(foodList);


//1. 매개변수로 foodList가 전달되면 모든 음식의 이름을 출력하는 함수를 화살표함수로 구현하고 호출하세요.

const test1 = (food) => {
  for(let i = 0; i < food.length ; i++){
    console.log(food[i].name);
  }
}

test1(foodList)  //test1();함수 호출-함수명(변수명/객체명);

///////////////////////////////////////////////////////////////////////////////////////////////////////////////

//2. 매개변수로 foodList가 전달되면 모든 음식의 이름을 출력하는 함수를 화살표함수로 구현하고 호출하세요.
const test2 = function(){
  let sum = 0;
  //자료형(js에서 let이서서 자료형 안넣음)  저장할곳 of 뭐로  반복할지 
  for(let food of foodList){  
    if(food.type === '한식'){
      food.price;
      sum = sum + food.price;
    }
  }
  console.log(`한식 가격의 합은 ${sum}원 입니다`)
}

test2(foodList);

/////////////////////////////////////////////////////////////////
//4. 첫번째 매개변수로 foodList, 두번째 매개변수로 음식명이 전달되면 전달된 음식명의 모든 요리재료를 출력하는 함수를 화살표함수로 구현하고 호출하세요. 만약, 두번째 매개변수로 전달된 음식명이 없다면 '정보없음'을 출력하세요.

//const 함수명 = (매개변수(이름은 내가 하고싶은거 적어도 됨))
const test4 = (list,foodName) => {

  for(let i = 0; i < list.length; i++){
    if(list[i].name === foodName){
      console.log(list[i].material);
      return;
    }
  }


}
test4(foodList, '김치찌개');

//매개변수로 5보다 큰 숫자가 들어올때만 안녕 출력
function aaaa(num){
  if(num > 5){
    console.log('안녕')
  }
}

//매개변수로 5보다 큰 숫자가 들어올때만 안녕 출력
//리턴 키워드 작성후 데이터를 작성하지 않으면 return을 만나면 함수 종료
function bbbb(sum){
  if(num > 5){
    return;
  }
  console.log('안녕')
}