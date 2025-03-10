package study;

public class Man {
  String name;
  int age;
  String address;

  //멤버변수의 모든 값을 초기화 할 수 있는 메소드
  public void intiMember(String name, int age, String adress) {
    this.name = name;
    this.age = age;
    this.address = adress;
  }
  //멤버변수 각각의 값을 변경하는 메소드
  //setter 만드세요~~
  //setter -> 멤버변수 하나의 값을 변경시키는 메서드
  //       -> setter 메서드는 이름이 정해져 있음(set멤버변수명)
  //       -> 메서드 이름 : get 변수명

  //name 값을 변경하는 setter 메서드 정의

  public void setName(String name) {
    this.name = name;
  }

  //age 값을 변경하는 setter 정의

  public void setAge(int age) {
    this.age = age;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  //각 멤버변수의 값을 리턴하는 메소드
  //name 을  리턴하는 메소드
  //getter -> 멤버변수 하나의 값을 리턴하는 메서드

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public String getAddress() {
    return address;
  }

  public void printInfo(){
    System.out.println(" 이름 : " + name);
    System.out.println(" 나이 : " + age);
    System.out.println(" 주소 : " + address );

  }
  }
