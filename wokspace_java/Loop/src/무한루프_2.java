import java.util.Scanner;

public class 무한루프_2 {
  public static void main(String[] args) {
    //무한루프 언제 사용?무한루프가 특정숫자다 될때까지
    //국어점수(0~100)를 입력받으세요~

    //0~100잠 사이의 점수를 입력할대 동안 계속 입력 시킨다.
    Scanner sc = new Scanner(System.in);
    int score;

    while (true){
      System.out.println("국어 점수 입력(0~100) : ");
      score = sc.nextInt();

      //입력받은 점수가 0~100사이라면 반복문을 종료한다.
      if (score >= 0 && score <= 100){
        break;
      }
    }
  }
}
