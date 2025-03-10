public class 반복문__7 {
  public static void main(String[] args) {
    //7. 1 ~ 100까지의 숫자 중 5의 배수인 수를 모두 출력하고, 5의 배수인 수의 개수도 출력해보세요
    int sum = 0;
    for (int i  = 1; i  <= 100; i++){
      if (i % 5 == 0){
        sum++;
        System.out.println(i);
      }
    }

    System.out.println(sum);
  }
}
