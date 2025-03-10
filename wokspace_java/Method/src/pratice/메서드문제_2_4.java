package pratice;

public class 메서드문제_2_4 {
  public static void main(String[] args) {
    // 4. 두 문자열을 매개변수로 받아, 두 문자열의 나열결과를 리턴하는 메소드를 선언하고 사용해보세요

    String sum = test4("안녕","반가워");
    System.out.println(sum);
  }
  public static String test4(String  a, String b){
    return a + b;
  }
}
