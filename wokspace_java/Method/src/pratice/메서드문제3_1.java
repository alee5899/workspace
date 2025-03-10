package pratice;

public class 메서드문제3_1 {
  public static void main(String[] args) {
    //1. 정수 하나를 매개변수로 받아 해당 정수의 구구단을 출력하는 메소드를 만들고 호출해보세요
    test1(7 );

  }
  public static void test1(int num){
    for (int i = 1 ; i < 10; i++){
      System.out.println(num + " * " +  i + " = " + num * i);
    }
  }
}
