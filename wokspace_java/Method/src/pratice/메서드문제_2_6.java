package pratice;

public class 메서드문제_2_6 {
  public static void main(String[] args) {
    // 6. 매개변수로 정수를 입력받아, 입력받은 정수를 문자열로 리턴하는 메소드를 선언하고 사용해보세요
    System.out.println(test6(6));
  }
  public static String test6(int num){

    //숫자 -> 문자열
    String a = String.valueOf(10);

    //문자열-> 정자
    int b = Integer.parseInt("10");

    return String.valueOf(num);
//    return num + "";

  }
}
