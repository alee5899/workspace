package 컬렉션프레임문제;

import java.util.ArrayList;
import java.util.List;

public class StudentTest {
  public static void main(String[] args) {
    //Student의 클래스의 객체가 다수 저장될 수 있는 리스트 생성
    //리스트 선언
    List<Student>studentList = new ArrayList<>();
    //리스트에 Student 객체 3개저장
    //데이터 선언
    studentList.add(new Student("강",80,80));
    studentList.add(new Student("이",90,80));
    studentList.add(new Student("박",30,80));
//    Student s1 = new Student("김",10,20);
//    Student s2 = new Student("이",80,80);
//    Student s3 = new Student("강",10,50);
//
//    //데이터 저장
//    studentList.add(s1);
//    studentList.add(s2);
//    studentList.add(s3);

    //1.리스트에 저장된 모든 정보 출력
    for (int i = 0; i < studentList.size(); i++){
      System.out.println(studentList.get(i));
      }

    System.out.println();
    /// //////////////////////////////////////
    //총점이 150점이상이 애들출력
    for (Student student : studentList){
      if(student.getTotalScore() >= 150)
      System.out.println(student);
    }
    /// //////////////////////////////////////////////
    //3.모든 학생에 대한 총점에 대한 평균점수
    //모든 학생의 총점을 가져와 합한 후 3으로 나눈다.
    int sum = 0;
    for (int i =0; i<studentList.size(); i++){
      sum += studentList.get(i).getTotalScore();
    }
    double avg = (double) sum / studentList.size();
    System.out.println("학생들의 평균 : " + avg);
    System.out.println();
    /// ///////////////////////////////////////////////////////
    //4.총점이 1등인 학생의 모든 정보를 출력
    //총점이 가장 높은 학생의 index를 구해야 함.
    int maxIndex = 0;
    for (int i = 0; i <studentList.size(); i++){
      if (studentList.get(i).getTotalScore() > studentList.get(maxIndex).getTotalScore()){
        maxIndex = i;
      }
    }
    System.out.println(studentList.get(maxIndex));
    }
  }


