package study;

public class StudentTest2 {
  public static void main(String[] args) {
    //student 클래스의 객체 stu1 생성
    Student stu1 = new Student();
    stu1.printInfo();

    //학생 객체의 st1의 데이터변경
    stu1.name = "LEE";
    stu1.age = 30;
    stu1.score = 90;
    stu1.printInfo();

    System.out.println();

    //student 객체 stu2 생성
    Student stu2 = new Student();

    //stu2 객체의 데이터 변경
    stu2.setName("Hong");
    stu2.setAge(35);
    stu2.setScore(80);
    stu2.printInfo();

    //Student 클래스의 객체 stu3생성
    Student stu3 = new Student();
    stu3.setAllInfo("김",40,70);
    stu3.printInfo();
  }
}
