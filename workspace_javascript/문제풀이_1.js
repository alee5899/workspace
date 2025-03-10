//1. 정수 열에서 짝수만 출력하는 함수를 선언하고 호출하세요.

function test1 (arr){
  for(let i = 0; i < arr.length; i++){
    if(arr[i] % 2 === 0){
      console.log(arr[i])
    }
  }
}

const test_data = [1,2,3,4,5];
test1(test_data)