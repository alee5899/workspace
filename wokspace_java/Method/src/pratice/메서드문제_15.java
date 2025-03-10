package pratice;

public class 메서드문제_15 {
  public static void main(String[] args) {
    test15("java",5);
    // 15. 한 문자열과 정수를 매개변수로 받아,
    // 매개변수로 받은 문자열을 매개변수로 받은 숫자만큼 반복 출력하는 메소드를 선언하고 호출해보세요
  }
  public static void test15(String str, int num){
    for(int i = 0; i < num ; i++){
      System.out.println(str);

    }

  }
}
