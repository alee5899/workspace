import java.util.SimpleTimeZone;

public class 반복문__5 {
  public static void main(String[] args) {
    //5. 반복문을 사용하여 1 ~ 10까지의 합을 구하세요
    int sum = 0;
    for (int i = 1; i <= 5; i++ ){
      sum = sum + i;
    }
    System.out.print(sum);
  }
}
