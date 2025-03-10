package pratice;

public class 메서드문제_14 {
  public static void main(String[] args) {
    //14. 두 정수를 매개변수로 받아, 두 정수 사이의 5의 배수의 개수를 출력하는 메소드를 선언하고
    // 호출해보세요.

    test14(5, 30);
  }


  public static void test14(int num1, int num2) {
    int cnt = 0;
    for (int i = num1 + 1; i < num2; i++) {
      if (i % 5 == 0) {
        cnt++;
      }
      System.out.println(i);
    }
    System.out.println(cnt);
  }
}