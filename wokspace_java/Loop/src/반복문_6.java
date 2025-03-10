public class 반복문_6 {
  public static void main(String[] args) {
    //1~100의 수 중 3의 배수의 수의 개수!
    int i = 1;
    int cnt = 0;//결과를 저장할 변수

    while (i < 101){
      if (i % 3 == 0){
        cnt++;
      }
      i++;
    }
    System.out.println("3의 배수의 갯수 : " +  cnt);
  }
}
