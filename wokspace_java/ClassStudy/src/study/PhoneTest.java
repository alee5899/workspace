package study;

import javax.swing.plaf.synth.SynthTextAreaUI;

public class PhoneTest {
  public static void main(String[] args) {
    //객체생성
    Phone p1 = new  Phone();

    //객체의 모든 정보 변경
    p1.setBrand("samssung");
    p1.setModelName("S25");
    p1.setColor("RED");
    p1.setPrice(1000);
    p1.setTel("010-1111-5522");

    //객체의 모든 내용 출력

p1.showInfo();
  }
}
