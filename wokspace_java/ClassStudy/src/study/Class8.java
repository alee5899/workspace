package study;
//휴대폰의 모든 데이터를 출력하는 메소드를 만들고, 새로운 클래스를 만들어 7,8번에서 만든 메소
//드가 잘 동작되는지 확인하세요
public class Class8 {
  public static void main(String[] args) {

    Pone p2 = new Pone();

    System.out.println(p2.brand);
    System.out.println(p2.name);
    System.out.println(p2.color);
    System.out.println(p2.number);
    p2.printInfo();


    Pone p3 = new Pone();

    System.out.println(p3.brand);
    System.out.println(p3.name);
    System.out.println(p3.color);
    System.out.println(p3.number);
    p3.printInfo();
  }

}
