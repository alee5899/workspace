//3. 문자열로 이루어진 배열이 매개변수로 전달되면 배열 각 요소의 글자 중 길이가 가장 긴 문자열을 리턴하는 함수를 화살표함수로 구현하고 호출해보세요.
//arr = ["aaaa,"bbb","cccc"]
const test3 = (arr) => {
  //배열의 0번째 요소를 가장 긴 문자열이라 가정
  let longest_word = arr[0];
  for(let i = 0; i < arr.length; i++){
    if(arr[i].length > longest_word.length){
      longest_word = arr[i]
    }
  }
return longest_word
};

const result = test3(['java','puthon','c#']);
console.log(result);
