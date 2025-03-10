package 컬렉션프레임문제;

import java.util.ArrayList;
import java.util.List;

public class 문제1_3 {
  public static void main(String[] args) {
    List<String>list1 = new ArrayList<>();
    //리스트 생성

    //데이터 생성
    list1.add("이길동");
    list1.add("최길동");
    list1.add("홍길동");

    //반복문을 통해 데이터값을 확인
    for (int i = 0; i < list1.size(); i++){
//      System.out.println(list1.get(i));

      //만약 i값중에 홍길동과 같다면
      if (list1.get(i).equals("홍길동")){
        System.out.println("해당이름이 존재합니다");
        }
    }
  }
}
