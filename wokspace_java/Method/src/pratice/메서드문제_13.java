package pratice;

public class 메서드문제_13 {
  public static void main(String[] args) {
    // 13. 두 정수를 매개변수로 받아, 두 정수 사이의 숫자를 출력하는 메소드를 선언 및 호출해보세요.
    int a = 5;
    int b = 15;
    test13(a,b);
  }

  public static void test13(int first, int second){//num1=1, num2=20  2-19
    for (int i = first +1; i < second; i++  ){
      // 두 수 중 큰 수, 작은 수를 구분
//          int max = first > second ? first : second;
//          int min = first < second ? first : second;
//
//
//          for (int i = min +1; i < max; i++  ){
      System.out.print(i);

    }

  }
}
