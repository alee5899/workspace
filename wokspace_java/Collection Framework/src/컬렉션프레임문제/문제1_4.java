package 컬렉션프레임문제;

import java.util.ArrayList;
import java.util.List;

public class 문제1_4 {
  public static void main(String[] args) {
    //정수를 다수 저장할수 있는 리스트 객체 생성
    List<Integer>list = new ArrayList<>();

    //리스트에 1~100까지의 랜덤한 정수를 10개 넣어보자.
    //정수 10개를 써야하니까 for문 을써야한다
    for (int  i = 0; i < 10; i++){
      //1~100까지의 랜덤한 정수 생성
      // 0.0 <= x < 100.0의 실수를 리턴
      list.add ((int)(Math.random() * 100 + 1));
    }
    //문제의 답이 맞는지 확인하기 위해 리스트의 모든 데이터 출력
    for (int e : list){
      System.out.print(e + " ");
    }
    System.out.println();

      //저장된 데이터 중 짝수의 개수와 모든 짝수출력
     //리스트에 저장된 데이터 수만큼 반복하면서 짝수인지 확인
      //리스트에 저장된 데이터 수만큼 반복
      int cnt = 0;//짝수의 갯수를 저장할 변수
      for (int i = 0; i <list.size(); i ++){
        //리스트에 저장된 하나하나의 데이터가 짝수인지 확인
        if (list.get(i) % 2 ==0){
          //모든 짝수 출력
          System.out.print(list.get(i));
          //cnt 값을 1 증가시킨다
          cnt++;
        }
      }
      System.out.println();
      //짝수의 갯수를 출력
      System.out.println("cnt = " + cnt);

  }
}