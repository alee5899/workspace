package pratice;

public class 메서드문제_2_3 {
  public static void main(String[] args) {
    // 3. 두 정수를 매개변수로 받아, 두 정수 중 큰 숫자를 리턴하는 메소드를 선언하고 사용해보세요

  int sum  = test3(3,5);
    System.out.println(sum);

  }
  public static int test3(int a, int b){

    return a > b ? a : b;

  }
}
