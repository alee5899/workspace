package pratice;

import java.util.Scanner;

public class 메서드문제_9 {
  public static void main(String[] args) {

    // 9. scanner로 정수 두 개를 입력받아, 입력받은 두 수를 매개변수로 사용하여
    // 두 수의 합을 출력하는 메소드를 선언하고, 호출해보세요.
    Scanner sc = new Scanner(System.in);

    System.out.println("정수입력 : " );
    int num1 = sc.nextInt();
    System.out.println("정수입력 : " );
    int num2 = sc.nextInt();
    sum(num1,num2);


  }
  public static void sum(int num1, int num2){
    System.out.println(num1 + num2);

  }
}
