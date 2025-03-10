package study;

public class SamsungTV implements TV {


  @Override
  public void turnon() {
    System.out.println("삼성티비- 전원 켬");
  }

  @Override
  public void turnOff() {
    System.out.println("삼성티비- 끔");
  }

  @Override
  public void volumeUp() {
    System.out.println("삼성소리업");

  }

  @Override
  public void volumeDown() {
    System.out.println("삼성소리 다운");
  }
}
