package pratice;

public class 메서드문제_10 {
  public static void main(String[] args) {
    //10. 한 정수를 매개변수로 받아, 그 정수가 짝수이면 ‘짝수입니다’,
    // 홀수이면 ‘홀수입니다’를 출력하는 메소드를 선언하고 호출해보세요
    //test(10) 메서드의 인자로 5가 전달되었었다
    test_10(8);

  }

  //조건? 참일때 실행 내용: 거짓일때 실행 내용
  public static void test_10(int a){
    System.out.println(a % 2 == 0 ? "짝수입니다" : "홀수입니다");
//    if (a % 2 == 0)
//    System.out.println("짝수입니다");
//
//    else{
//      System.out.println("홀수입니다");



    }
    }
