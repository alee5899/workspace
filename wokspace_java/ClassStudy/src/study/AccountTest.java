package study;

public class AccountTest {
  public static void main(String[] args) {
    //계좌생성
    //객체 생성 문법 :: 클래스명 객체명 = new 생성자 호출
    Account acc1 = new Account();
    acc1.printAccInfo();

  }
}

//계좌 정보 초기값 세팅
//    acc1.initAcc("111-222",10000,"김자바");
//    acc1.printAccInfo();
