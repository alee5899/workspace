import java.util.Scanner;

public class 정수입력받기 {
  public static void main(String[] args) {
    //키보드 입력을 받기 위한 변수(복사해서 사용!)
      Scanner sc = new Scanner(System.in);

      //정수 입력 출력
      System.out.println("정수 입력: ");
      int a = sc.nextInt();
      System.out.println("입력받은 정수 : " + a);
    }
  }
