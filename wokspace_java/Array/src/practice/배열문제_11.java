package practice;

import java.util.Arrays;
import java.util.Scanner;

//간단한 성적처리 시스템을 만들어보자.
// 국어, 영어, 수학점수를 입력받아 각 과목에
//대한 점수 및 총점, 평균을 출력하는 프로그램을 만들어보자.
// 반드시 배열을 사용하도록 한다
public class 배열문제_11 {
  public static void main(String[] args) {
    //-------------------변수------------------//
    //변수
    Scanner sc = new Scanner(System.in);
    //과목명을 저장하고 있는 배열
    String[] subjects = {"국어","영어","수학"};
    //0:국어 1:영어 2:수학 3:총점
    int[] scores = new int[subjects.length];
    //평균
    double avg;

    //------------------ 점수입력------------------//
    //0~100점 사이의 값을 입력받을때까지 반복(과목수)
    for (int i = 0; i < scores.length;   i++){
      while (true){
        System.out.print(subjects[i] + "점수 입력 : ");
        scores[i] = sc.nextInt();

        //입력받은 점수가 0~100사이면 반복문 벗어남
        if (scores[i] >= 0 && scores[i] <=100){
          break;//가장 가까운 반복문을 벗어난다
        }
      }
    }

    //-------------------총점,평균 계산------------------------
    //scores[3]
    //과목수만큼 반복해서 총점을 계산
    int sum = 0;
    for (int i = 0; i < scores.length; i++){
      sum += scores[i];
    }

    //평균(총점 / 과목수)
    avg = sum / (double)subjects.length;

    //-------------------결과출력------------------------
    System.out.println();
    System.out.println("****** 입력하신 정보로 점수 정보를 출력합니다******");

    //각 과목의 점수 및 출력
     for(int i = 0; i < scores.length; i++){
      System.out.println(subjects[i] + "점수 = " + scores[i]);
    }
    //총점
    System.out.println("총점 = " +sum);

    System.out.println("평균 : " + avg);
  }
}
