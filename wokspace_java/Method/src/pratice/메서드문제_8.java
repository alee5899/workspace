package pratice;

import java.util.Scanner;

public class 메서드문제_8 {
  public static void main(String[] args) {
    // 8. 키보드로 입력받은 정수를 매수변수로 받아, 해당 정수를 출력하는 메소드를 선언, 호출해보세요.
    Scanner sc = new Scanner(System.in);
    System.out.println("정수입력 : ");
    int num = sc.nextInt();
    sum(num);
  }
  public static void sum(int num){
    System.out.println(num);//int num = num1

  }
}
