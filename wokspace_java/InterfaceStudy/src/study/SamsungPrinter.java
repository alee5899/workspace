package study;

//Print 인터페이스를 구현하여 smasungPrinter클래스를 만들거
public class SamsungPrinter implements  Print{
  @Override
  public void Print() {
    System.out.println("흑백 출력 실행");
  }

  @Override
  public void colorPrint() {
    System.out.println("컬러 출력 실행");
  }
}
