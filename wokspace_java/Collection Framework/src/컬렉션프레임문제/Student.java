package 컬렉션프레임문제;

import java.util.ArrayList;
import java.util.List;

// Student는 학생에 대한 정보가 들어있는 클래스이다. 해당 클래스는 학생이름, 국어점수, 영어점수, 총점
//데이터를 가지고 있다. 각 필드를 선언하고 setter와 getter를 만들어보자. 추가적으로 모든 정보를 출력하는
//기능을 toString()메소드를 오버라이딩하여 작성한다
public class Student {
  //정보 선언
  private  String name;
  private  int koreascore;
  private  int englishscore;
  private  int TotalScore;

  //생성자
  Student(String name,int koreascore, int englishscore){
    this.name = name;
    this.koreascore = koreascore;
    this.englishscore = englishscore;
    this.TotalScore = koreascore + englishscore;
  }

  //setter
  public void setName(String name){
    this.name = name;
  }

  public void setKoreascore(int koreascore){
    this.koreascore = koreascore;
  }

  public void setEnglishscore(int englishscore){
    this.englishscore = englishscore;
  }

  public void setSum(int totalScore){
    this.TotalScore = TotalScore;
  }

  //getter
  public String getName(){
    return name;
  }

  public int getKoreascore(){
    return koreascore;
  }

  public int getEnglishscore(){
    return englishscore;
  }
  public int getTotalScore(){
    return TotalScore;

  }

  @Override
  public String toString() {
    return "Student{" +
            "name='" + name + '\'' +
            ", koreascore=" + koreascore +
            ", englishscore=" + englishscore +
            ", TotalScore=" + TotalScore +
            '}';
  }
}