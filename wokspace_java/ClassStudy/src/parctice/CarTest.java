package parctice;

import java.util.Scanner;

public class CarTest {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.nextInt();

    System.out.println("첫 번째수 : ");
    int num1 = sc.nextInt();
    System.out.println("두 번째수 : ");
    int num2 = sc.nextInt();
    System.out.println("연산자 : ");
    String oper = sc.next();

    switch (oper){
      case "+":
        Add add = new Add();
        add.setValue(num1, num2);
        System.out.println(num1 + oper +  num2 + "=" + add.calculate());
        break;
      case "-":
        Sub sub = new Sub();
        sub.setValue(num1,num2);
        System.out.println(num1 + oper +  num2 + "=" + sub.calculate());
        break;
      case "*":
        Mul mul = new Mul();
        mul.setValue(num1,num2);
        System.out.println(num1 + oper +  num2 + "=" + mul.calculate());
        break;
      case "/":
        break;
      default:
        System.out.println("연산자를 잘못 입력하였습니다");
    }
  }
}
