package practice;

import study.Array_5;

import java.util.Arrays;

public class 배열문제_19 {
  public static void main(String[] args) {
    //정수 10개를 담을 수 있는 배열을 생성하고,
    // Math.random()함수를 사용하여 1 ~ 100의 정수를 배열
    // 각 요소에 저장하자.
    // 배열에 저장된 모든 정수 및 최소값, 최대값을 출력해라.
    int[] arr = new int[10];

    //배열의 각 요소에 데이터를 저장
    for (int i = 0; i < arr.length; i++){
      //0.0 <= x <=100.0 실수
      arr[i] = (int) (Math.random() * 100 + 1);
    }

    //배열 데이터 확인을 위한출력
    System.out.println(Arrays.toString(arr));

    int max = arr[0]; //0번재 요소를 가장 큰 값으로 가정
    int min = arr[0]; //0번재 요소를 가장 작은 값으로 가정

    for (int  i = 0; i < arr.length; i++){
      if (max < arr[i]){
        max = arr[i];
      }
      if (min > arr[i]){
        min = arr[i];

      }
    }
    System.out.println("최댓값 : " +  max);
    System.out.println("최소값 : " +  min);


  }
}
