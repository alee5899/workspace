import java.util.Scanner;

public class 문제3_2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String gender;
//    String a = sc.nextInt();

    System.out.println("성별입력 :");
    gender = sc.next();

    switch (gender){
      case "남":
        System.out.println("남자입니다");
        break;
      case "여":
        System.out.println("여자입니다");
        break;
      default:
        System.out.println("다시입력하세요");
//    switch (a){
//      case "남" :
//        System.out.println("남자");
//        break;
//
//      case "여":
//        System.out.println("여자");
//        break;
//
//      default:
//        System.out.println("다시 입력하세요");

    }
  }
}
