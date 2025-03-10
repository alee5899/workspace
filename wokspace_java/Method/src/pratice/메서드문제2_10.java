package pratice;

public class 메서드문제2_10 {
  public static void main(String[] args) {
    String testString1 = "Hello";
    String testString2 = "World!";

    System.out.println("Is the length of \"" + testString1 + "\" even? " + test10(testString1)); // false
    System.out.println("Is the length of \"" + testString2 + "\" even? " + test10(testString2)); // true
    // 10. 매개변수로 문자열 데이터 하나를 받아, 해당 문자열의 길이가 짝수 일 때는 true를 리턴하고,
    //홀수 일 때는 false를 리턴하는 메서드를 선언하고 사용해보세요

  }
  public static boolean test10(String a){
    return a.length() % 2 == 0;

//    System.out.println(10 > 2);
//    System.out.println(10 == 2);
//    System.out.println(10 % 2==0);

    }
  }
