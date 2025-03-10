import java.util.Scanner;

public class Test3 {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int num;
    int one = 0, ten = 0, oneHundred = 0;
    int cnt = 0;

    System.out.print("1~999사이의 숫자를 입력하세요>> ");
    num = scan.nextInt();

    if (num < 0 || num > 999) {
      System.out.print("숫자 범위를 넘었어요. 다시 입력해주세요>> ");
      num = scan.nextInt();
    }

    one= (num % 100) % 10;  //1의 자리 숫자 구하는 식
    ten = (num % 100) / 10;  //10의 자리 숫자 구하는 식
    oneHundred = num / 100;      //100의 자리 숫자 구하는 식

    //3,6,9를 제외한 10보다 작은 수를 입력 했을 때 else문으로 감
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
      System.out.println("박수 짝짝짝!");
    if (cnt == 2)
      System.out.println("박수 짝짝!");
    if (cnt == 1)
      System.out.println("박수 짝!");
  }
}
