import java.util.Scanner;

public class 심화문제_3 {
  public static void main(String[] args) {
    //1~99사이의 정수를 키보드로 입력!
    //박수짝, 박수짝짝
    Scanner sc = new Scanner(System.in);
    int num;
    System.out.println("1~99 사이의 정수를 입력하세오>>");
    num = sc.nextInt();
    int clapCnt = 0; // 박수의 갯수

    //입력받은 정수를 1의 자리와 10의 자리 수로 분리
    //십의 자리
    int tens = num / 10;//몫
    //일의 자리
    int ones = num % 10;//나머지

    //만약 십의 자리 수가 3,6,9면 박수 수를 1증가
    if (tens == 3 || tens == 6 || tens == 9){
      ++clapCnt;

//      clapCnt = clapCnt + 1;
//      clapCnt + = 1;
//      ++clapCnt;

      }
    if (ones == 3 || ones == 6 || ones == 9){
      //만약 일의 자리 수가 3,6,9면 박수 수를 1증가
      ++clapCnt;
    }
    //clapCnt = 0,1,2
    //0이면 박수없음
    //1이면 박수짝
    //2면 박수짝짝

    switch (clapCnt){
    case 0:
        System.out.println("박수없음");
        break;
    case 1:
        System.out.println("박수 짝");
        break;
    case 2:
        System.out.println("박수 짝짝");

    }
  }
}
