package study;
//다형성: 부모클래스로 자식클래스의 객체 생성가능

//클래스가 명시작으로 상속을 받고 있지 않으면
//자동으로 object 클래스를 상속 받습니다
//결론, 모든 클래스는 object 클래스를 상속받고 있음
//모든 클래스의 객체는 object로 다 받을수 있다
public class Tv {
  int name;
  String num;
  public  void turnOn(){
    System.out.println("TV전원 켬");
  }

  //object 클래스의 toString() 메서드 오버러이딩
  //@Override : 메서드가 오버라이딩 문법에 맞는 확인!

  @Override
  public String toString() {
    return "Tv{" +
            "name=" + name +
            ", num='" + num + '\'' +
            '}';
  }
}
