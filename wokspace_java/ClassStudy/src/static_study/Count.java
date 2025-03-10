package static_study;

//static이 붙은 멤버변수는
//객체에 종속적이지 않고,모든 객체가 공유하는 데이터
//static 변수는 생성자에서 초기화 하지 않는다
//static에서 초기화 구문이 따로 존재한다.
//생성자보다 static 초기화가 먼저 진행 된다!
//static 변수는 객체명.멤버변수; 의 문법으로 호출 권장
//static 변수는 클래스명.변수명;
//static 변수 및 메소드에 적용할수 있다
public class Count {
  static int cnt;

  //static 변수 초기화 구문
  static {
    cnt = 0;
  }

  public Count(){
    //cnt = 0; static변수는 생성자에서 초기화x
    System.out.println("생성자 실행~");
    cnt++;
    System.out.println("cnt = " + cnt);

  }
}
