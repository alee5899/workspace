package study;

public class Student {
  int stuNum; //학번
  String name;

  public Student(int stuNum, String name) {
    this.stuNum = stuNum;
    this.name = name;
  }

  @Override
  public boolean equals(Object obj) {
    Student  Student = (Student)obj;
    if(stuNum == ((Student) obj).stuNum){
      return true;
    }
    else {
      return false;
    }
  }
}
