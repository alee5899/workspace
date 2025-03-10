package com.green.First;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

public class Student {
  private String name;
  private  int korScore;
  private  int engScore;
  private  int mathScore;

  public Student(String name, int korScore, int engScore, int mathScore) {
    this.name = name;
    this.korScore = korScore;
    this.engScore = engScore;
    this.mathScore = mathScore;


  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getKorScore() {
    return korScore;
  }

  public void setKorScore(int korScore) {
    this.korScore = korScore;
  }

  public int getEngScore() {
    return engScore;
  }

  public void setEngScore(int engScore) {
    this.engScore = engScore;
  }

  public int getMathScore() {
    return mathScore;
  }

  public void setMathScore(int mathScore) {
    this.mathScore = mathScore;
  }

  @GetMapping("/t5")
  public List<Student> test5(){
    List<Student> studentList = new ArrayList<>();

    studentList.add(new Student("gim",80,70,65));
    studentList.add(new Student("kim",80,80,15));
    studentList.add(new Student("lee",80,90,25));
    studentList.add(new Student("park",80,30,45));
    studentList.add(new Student("choi",80,20,55));

    return studentList;

  }

  @Override
  public String toString() {
    return "Student{" +
            "name='" + name + '\'' +
            ", korScore=" + korScore +
            ", engScore=" + engScore +
            ", mathScore=" + mathScore +
            '}';
  }
}
