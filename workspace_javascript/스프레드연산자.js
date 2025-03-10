
const arr1 = [1,2,3];
const arr2 = [4,5];

const arr4 = [1, ...arr2,2,3]

const arr3 = [1,2,3, ...arr2];

//[1,2,3,4,5]
//arr1[3] = arr2; //[1,2,3,4,5]
//arr1.push(6);//[1.2.3.4.5, 6]
// arr1.push(arr2);
console.log(arr1);


const person = {
  name : 'kim',
  age :20
};

const Score = {
  korScore : 80,
  mathScore : 100
};

const student = {
  ...person,
  ...Score
}

const student1 = {
  person,
  Score
}


