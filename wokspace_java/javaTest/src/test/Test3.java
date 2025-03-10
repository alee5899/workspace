package test;

import java.util.Scanner;

public class Test3 {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int num;
    int one = 0, ten = 0, oneHundred = 0;
    int cnt = 0;

    System.out.print("1~999사이의 숫자를 입력하세요>> ");
    num = scan.nextInt();

    one= (num % 100) % 10;
    ten = (num % 100) / 10;
    oneHundred = num / 100;


    if (oneHundred == 0) {
      oneHundred= 1;
    }
    if (ten == 0) {
      ten = 1;
    }
    if (one == 0) {
      one = 1;
    }

    if (oneHundred % 3 == 0)
      cnt++;
    if (ten % 3 == 0)
      cnt++;
    if (one % 3 == 0)
      cnt++;

    if (cnt == 3)
      System.out.println("박수 짝짝짝");
    if (cnt == 2)
      System.out.println("박수 짝짝");
    if (cnt == 1)
      System.out.println("박수 짝");
  }
}
