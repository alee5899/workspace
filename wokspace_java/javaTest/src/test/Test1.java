package test;

import java.util.Scanner;
//큰수부터 나열하는 프로그램
public class Test1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1,num2 ,num3;
    System.out.println("첫번째수");
    num1 = sc.nextInt();

    System.out.println("두번째수");
    num2 = sc.nextInt();

    System.out.println("세번째수");
    num3 = sc.nextInt();

    int max = 0;
    int mid = 0;
    int min = 0;

    if (num1 > num2 && num1 > num3){
      max = num1;
      if (num2>num3){
        mid = num2;
        min = num3;
      }
      else {
        mid = num3;
        mid = num2;

      }
    } else if (num2 > num1 && num2 > num3) {
      max = num2;
      if (num1 > num3){
        mid = num1;
        min = num3;

      }
      else {
        mid = num3;
        min = num1;

      }
    }
    else {
      max = num3;
      if (num1 > num2) {
        mid = num1;
        mid = num2;
      }
      else {
        mid= num2;
        min = num1;
      }
    }
    System.out.println(max + " > " + mid + " > " + min);
  }
}
