//1. 이름, 부서, 직급, 급여의 네 개의 데이터를 갖는 객체 emp를 생성해보세요. 각 데이터의 값은 임의의 값으로 설정하면 됩니다.

//객체
const emp = {
  name : 'kim',
  dept : '개발부',
  jop : '대리',
  salary : 10000
}

// 2. 5번에서 만든 emp 객체 하나를 매개변수로 받아, 전달받은 객체의 부서가 '개발부'라면 해당 객체의 급여를 출력하고, '개발부'가 아니라면 '부서가 잘못되었습니다'를 출력하는 함수를 화살표함수로 구현하고 호출하세요.

const test1 = (emp) => {
  // if(emp.dept === '개발부'){
  //   console.log(emp.salary);
    
  // }
  // else{
  //   console.log('부서가 잘못되었습니다.');
  // }

  console.log(emp.dept == '개발부' ? emp.salary : '부서잘못!')
};


//밑에꺼하고 똑같다
// test1({
//   name : 'kim',
//   dept : '개발부',
//   jop : '대리',
//   salary : 10000
// });
test1(emp);


