import java.util.Scanner;

public class 심화문제_2_2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int xPos, yPos;

    System.out.println("점 (x, y)의 좌표를 입력하세요");
    xPos = sc.nextInt();
    yPos = sc.nextInt();

    System.out.println();
    System.out.println();

    if (xPos >= 50 && xPos <= 100 && yPos >= 50 && yPos <= 100) {
      System.out.println("사각형 안에 점이 있습니다");

    }
  }
}

