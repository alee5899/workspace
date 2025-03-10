package pratice;

public class 메서드문제3_2 {
  public static void main(String[] args) {
    test2(5);
    // 2. 정수 하나를 매개변수로 받아, 1 ~ 100까지의 수 중에서 매개변수로 받은 수의 배수를 출력하는 메소드를 만들고 호출해보세요.
  }
  public static void test2(int num){
    for (int i = 1; i < 101; i++ ){
      if (i % num == 0){
        System.out.print(i + " ");

      }

    }
  }
}

