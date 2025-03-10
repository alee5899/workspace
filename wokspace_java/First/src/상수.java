public class 상수 {
  public static void main(String[] args) {
    //상수 : 변하지 않는 값

    //변수는 값을 지속적으로 변경할 수 있음
    int num = 10;
    num = 20;

    //자료형 앞에 final 키워드를 추가하면 상수가 됨.
    //상수는 값을 변경할 수 없음.
    //상수는 대문자로 명명
   final int NUM2 = 10;
   //NUM2 = 20; 상수는 값 변경 시 오류 발생!!

    System.out.println(NUM2);

    final double AA = 1.1;
    //AA = 1.1;
    final String NAMER = "홍";

  }
}
