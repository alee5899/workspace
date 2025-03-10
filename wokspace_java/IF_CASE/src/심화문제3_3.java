import java.util.Scanner;

public class 심화문제3_3 {
  public static void main(String[] args) {
    int num1, num2;
    String oper; //연산자를 저장할 변수
    Scanner sc = new Scanner(System.in);

    //정보 입력
    System.out.print("첫 번째 수 : ");
    num1 = sc.nextInt();
    System.out.println("두 번재 수 : ");
    num2 = sc.nextInt();
    System.out.println("연산자 : ");
    oper = sc.next();

    if (oper.equals("+")) {
      //num : 3, num2 : 5 , oper:+
      //=> 3+ 5 +8
      System.out.println(num1 + " " + oper + " "+ num2 + " = " + (num1 + num2));
    }
     else if (oper.equals("-")) {
      System.out.println(num1 + " " + oper + " " + num2 + " = " + (num1 - num2));

    }
     else if (oper.equals("*")) {
      System.out.println(num1 + " " + oper + " " + num2 + " = " + (num1 * num2));

    }
     else if (oper.equals("/")) {
      System.out.println(num1 + " " + oper + " " + num2 + " = " + (num1 / (double)num2));

    }
     else{
      System.out.println("연산을 잘못 입력하였습니다");
    }


  }
}