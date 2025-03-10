package study;

//메소드 오버라이딩이란 :
//1.상속 관계에 있는 두 클래스에서
//자식클래스에서 부모클래스의 메소드명과
//매개변수 정보를 동일하게 작성해도 메소드 선언을 허용
//오버라이딩을 하면 부모클래스에서 정의한 메서드를 덮어써버리기 때문에
//부모클래스에서 정의한 메서드 호출불가!!
public class Chef {
  public void  makeCook(){
    System.out.println("쉐프가 요리합니다");
  }
}

class MasterCher extends  Chef{
  public void  makeCook(){
    System.out.println("마스터가 요리합니다.");
  }

  public void giveOrder(){
    System.out.println("후임에게 지시합니다");
  }
}
