package pratice;

public class 메서드문제_6 {
  public static void main(String[] args) {
    //6. 두 정수를 매개변수로 받아, 두 정수의 나눗셈 몫과 나머지를 출력하는 메소드를 선언하고
    // 호출해 보세요.
    sum(6,3);
  }

  public static void sum(int num1, int num2){

    System.out.println(num1/num2);
    System.out.println(num1%num2);
  }
}
