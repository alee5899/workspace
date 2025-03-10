package pratice;

public class 메서드문제_2_9 {
  public static void main(String[] args) {
    //9. 한 정수를 매개변수로 받아, 1부터 매개변수로 받은 수까지 중 홀수의 합을 리턴하는 메소드를 선언하고 사용해보세요
    System.out.println(test9(3));
  }

  public static int test9(int num){
    int cnt = 0;
    for (int i =1; i <= num; i++){
      if (i % 2 !=0 ){
        cnt += i;
      }
    }
    return cnt;
  }
}
