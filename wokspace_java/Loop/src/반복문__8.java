import java.util.Scanner;

public class 반복문__8 {
  public static void main(String[] args) {
    // 8. 키보드로 정수를 입력받아 1부터 입력받은 수까지 중 짝수의 개수를 구하세요.
    Scanner sc = new Scanner(System.in);
    int cnt = 0;
    System.out.println("입력 : ");
    int sum = sc.nextInt();
    for (int i = 0; i < sum; i++  ){
      if (i % 2 ==0){
        cnt++;
      }
    }
    System.out.println(cnt);
  }
}
