package study;

public class Pone {
  String brand;
  String name;
  String color;
  String number;

  public void All(String brand1, String name1, String color1, String number1) {
    brand = brand1;
    name = name1;
    color = color1;
    number = number1;

  }

  public void printInfo() {
    System.out.println("제조사 : " + brand);
    System.out.println("모델명 : " + name);
    System.out.println("색상 : " + color);
    System.out.println("휴대폰 번호 : " + number);

  }
}