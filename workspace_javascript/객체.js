
//객체 : key와 value한 쌍의 데이터로 이루어진 데이터의 집합

//객체 선언
const obj1 = {}; //빈 객체 생성
const person = {
  //key : value
  name : 'kim', 
  age : 20, 
  addr: '울산',
  age : 30//key가 중복이면 마지막으로 넣은 데이터만 유효000
};

//'kim' 문자열 출력
console.log(person['name']);
console.log(person.name);

//새로운 데이터 추가 방법
person.hobby = '공부'
person.age = 50;
console.log(person);