package pratice;

public class 메서드문제_2_5 {
  public static void main(String[] args) {
    //5. 임의의 정수를 매개변수로 받아, 만약 매개변수로 받은 정수가 90 이상이면 ‘A’, 70 이상이면‘B’,
    // 그 외의 수가 들어오면 ‘C’를 리턴하는 메소드를 선언하고 사용해보세요.
    String sum = test5(80);
    System.out.println(sum);
  }
  public static String test5(int num){
    if (num >= 90){
      return"A";
    }
    else if (num >= 70){
      return"B";
    }
    else {
      return"C";

  }
}
}
