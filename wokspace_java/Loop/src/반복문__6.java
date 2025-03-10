public class 반복문__6 {
  public static void main(String[] args) {
    // 6. 1 ~ 100까지 숫자 중 3의 배수인 수의 개수를 구하세요.
    int sum = 0;
    for (int i = 0; i <=100; i++){
      if (i % 3 == 0) {
        sum++;
      }
    }
    System.out.println(sum);
  }
}
