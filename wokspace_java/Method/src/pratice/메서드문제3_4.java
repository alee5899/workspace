package pratice;
// 4. 정수 하나를 매개변수로 받아, 매개변수가 짝수면 true, 홀수면 false를 리턴하는 메소드를 만들
//고 활용해보자
public class 메서드문제3_4 {
  public static void main(String[] args) {
   boolean result =  isEven(6);
    if(result) {

    }
  }
  public static boolean isEven(int num){
    return num % 2 == 0;

  }

}
