import java.util.Scanner;

public class 문제1_5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int score;
    String grade;

    System.out.println("정수 입력 :");
    score = sc.nextInt();
    // 변수 초기화: 처음으로 변수에 데이터를 저장해주는것(값을 넣어주는것)

    if(score > 90 && score <= 100){
        grade = "A";
      }
      else if (score > 80 ){
        grade = "B";
      }
      else {
        grade = "C";
      }

      System.out.println("학점은 " + grade + "입니다");
      }
  }
