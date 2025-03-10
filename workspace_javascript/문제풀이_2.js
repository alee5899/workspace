//2. 정수로 이루어진 두 배열이 매개변수로 들어오면 두 배열의 모든 요소들의 평균을 리턴하는 함수를 함수표현식으로 구현하고 호출해보세요.

//
//[1,2,3,],[4,5,6]
const test2 = function(arr1,arr2){
  //첫번째 배열의합
const sum1 = getArrSum(arr1)


  //두번째 배열의합
  const sum2 = getArrSum(arr1)

  //두개 더해
  return(sum1 + sum2) / (arr1.length + arr2.length);
};

//배열의 합을 구하는 함수
function getArrSum(arr){
  let sum = 0;
  for(const e of arr){
    sum = sum + e; 
  }
  return sum;
}

const data1 = [1,2,3,4];
const data2 = [5,6];
const result  = test2(data1,data2);
console.log(result);