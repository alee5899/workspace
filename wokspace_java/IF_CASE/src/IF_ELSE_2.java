import java.util.Scanner;

public class IF_ELSE_2 {
  public static void main(String[] args) {
    //키보드로 하나의 정수를 입력받아,
    //그 수가 3의 배수이면 '3의 배수가 아닙니다' 를 출력

    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

    System.out.print("정수입력: ");

    if (num % 3  ==0){
      System.out.println("3의 배수입니다 ");
    }
    else {
      System.out.println("3의 배수가 아닙니다");

    }
  }
}
