import java.util.Scanner;

public class 심화문제2_1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num1,num2,num3;

    System.out.println("첫번째수 :");
    num1 = sc.nextInt();
    System.out.println("두번째수 :");
    num2 = sc.nextInt();
    System.out.println("세번째수 :");
    num3 = sc.nextInt();

    if (num1 + num2 > num3 && num1 + num3 > num2 && num2 + num3> num1 ){
      System.out.println("삼각형 가능");
    }




  }
}
