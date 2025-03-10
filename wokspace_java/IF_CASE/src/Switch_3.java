import javax.naming.BinaryRefAddr;

public class Switch_3 {
  public static void main(String[] args) {
    /*
    * 0~100사이의 임이의 정수를 변수에 저장하고
    * 90<= X <=100   ->문자열 'A' 출력
    * 90<= X <=89   ->문자열 'A' 출력
    * 90<= X <=79  ->문자열 'A' 출력
    * X < = 69 -> 문자열 'D' 출력
    * switch case break
    *
    *
    * */
    int X = 77;

    switch (X / 10){
    case 10:
    case 9:
        System.out.println("A");
        break;
    case 8:
      System.out.println("B");
      break;
    case 7:
    System.out.println("C");
    break;

    default:
      System.out.println("D");



    }
  }
}
