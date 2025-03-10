import java.util.Scanner;

public class IF_3 {
  public static void main(String[] args) {
    //키보드로 정수 두 개를 입력받아,
    //입력 받은 두 수의 합이 10 이상이라면서
    //짝수는 아닐 경우에만 "참" 이라는 문자열을 출력

    //변수선언
    Scanner sc = new Scanner(System.in);
    //int num1 = sc.nextInt();
    //int num2 = sc.nextInt();
    int num1, num2;

    //값 입력받기
    System.out.print("첫번째수 : ");
    num1 = sc.nextInt();

    System.out.print("두번째수 : ");
    num2 = sc.nextInt();

    //결과 출력
    //이상,촤과,이하,미만
    if (num1 + num2 >= 10 && (num1 + num2) % 2 != 0){
      System.out.println("참");

    }


  }
}