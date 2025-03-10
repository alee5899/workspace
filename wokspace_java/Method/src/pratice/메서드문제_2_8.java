package pratice;

public class 메서드문제_2_8 {
  public static void main(String[] args) {
    // 8. 세 정수를 매개변수로 받아, 세 정수의 평균을 리턴하는 메소드를 선언하고 사용해보세요.
    double sum = test8(20,20,20);
    System.out.println(sum);
  }
  public static double test8(int a, int b, int c){
    return (a + b + c) / 3;

  }
}
