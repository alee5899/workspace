import java.util.Scanner;

public class 문제3_1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String gender;

    System.out.println("성별 :");
    gender = sc.next();

    if (gender.equals("남")) {
      System.out.println("남자입니다");
    }

    else if (gender.equals("여")){

    }
    else {
      System.out.println("다시입력하세요");
    }
  }
}
