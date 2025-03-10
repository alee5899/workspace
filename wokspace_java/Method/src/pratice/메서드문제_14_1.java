package pratice;

public class 메서드문제_14_1 {
  public static void main(String[] args) {
    test14(17,2);

  }
  public static void test14(int a, int b){
    int max = a > b ? a: b;
    int min = a < b ? a: b;
    int cnt = 0;

    for (int i = min + 1  ; i < max ; i++){
      if (i % 5 == 0){
        cnt++;
      }
    }
    System.out.println(cnt);
  }
}
