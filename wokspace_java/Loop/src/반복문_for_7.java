public class 반복문_for_7 {
  public static void main(String[] args) {
    // 1 ~ 100까지의 숫자 중 5의 배수인 수를 모두 출력하고, 5의 배수인 수의 개수도 출력해
    //보세요
    int cnt = 0;

    for (int i = 1; i< 101; i++){
      if (i % 5 == 0){
        cnt++;
        System.out.println(i + " ");

      }
    }
    System.out.println();
    System.out.println(cnt);
  }

}
