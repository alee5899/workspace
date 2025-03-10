package pratice;

import java.util.Scanner;

public class 메서드문제_2_2 {
  public static void main(String[] args) {
    // 2. scanner로 입력받은 두 정수를 매개변수로 받아,
    // 두 정수의 곱을 리턴하는 메소드를 선언하고 호출하여 결과를 호학인해보세요.
    Scanner sc = new Scanner(System.in);


    System.out.println( "정수 입력 : ");
    int a = sc.nextInt();

    System.out.println( "정수 입력 : ");
    int b = sc.nextInt();

    int sum = test2(a, b);
    System.out.println(sum);
  }
  public static int test2(int a,int b){
    return a * b;

  }
}
