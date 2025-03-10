package practice;

 //1, 2, 3, 4, 5, 6 ,7 ,8 로 초기화된 배열을 만들고,
// 배열의 요소 중 짝수의 개수를 구하는 프로그램을 만들어라.
public class 배열문제_10 {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6 ,7 ,8};
    int evenCnt = 0;
    //for -each문 사용
    for (int e: arr){
      if (e % 2 ==0){
        evenCnt++;
      }

    }

    //기본for문 사용
    for (int i = 0; i <arr.length; i++){
      if (arr[i] % 2 == 0){
        evenCnt++;

      }
    }
    System.out.println(evenCnt);

  }
}
