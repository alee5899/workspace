package study;

public class LGTV implements  TV {

  @Override
  public void turnon() {
    System.out.println("엘지 킴");

  }

  @Override
  public void turnOff() {
    System.out.println("엘지 끔");

  }

  @Override
  public void volumeUp() {
    System.out.println("엘지 소리업");
  }

  @Override
  public void volumeDown() {
    System.out.println("엘지 소리다운");

  }
}
