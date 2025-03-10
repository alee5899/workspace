package study;

public class ManTest2 {
  public static void main(String[] args) {
    Man m1 = new Man();
    m1.intiMember("홍길동", 30 , "울산시");

    Man m2 = new Man();
    m2. intiMember("유관순",20,"서울시");

    //setter -> 각각의 데이터 변경 시 사용
    //getter -> 각각의 데이터를 읽어올대 사용
    //m1과 m2 중 나이가 많은 사람의 이름을 출력

    if (m1. getAge() > m2.getAge()){
      System.out.println(m1.getName());
    }
    else {
      System.out.println(m2.getName());

      //m1 객체의 나이가 30이면
      //m1 객체의 이름을 "이순신"으로 변경하세요
      //리턴 -> 결과 데이터를 컴퓨터가 나한테 돌려준다.
      //저의 입장 -> 컴퓨터한테서 데이터를 받는다.
      if (m1.getAge() == 30){
        m1.setName("이순신");

      }
    }
  }
}
