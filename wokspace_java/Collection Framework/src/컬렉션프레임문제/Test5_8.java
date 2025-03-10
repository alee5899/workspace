package 컬렉션프레임문제;

import java.util.ArrayList;
import java.util.List;

public class Test5_8 {
  public static void main(String[] args) {
    // 6. TestMember클래스에 main메소드를 만들어 위에서 만든 Member클래스의 객체를 저장할 수 있는리스트를 만들어라.
    // 그리고 3개의 Member객체를 저장하고 저장된 객체의 정보를 모두 출력하는 프로그램을 만드세요
    List<Member>memberList = new ArrayList<>();
    //3개의 Member 객체를 리스트에 저장
    //Member 객체를 3개 생성
    Member m1 = new Member("java1","1111","김자바",20);
    Member m2 = new Member("java2","2222","이자바",30);
    Member m3 = new Member("java3","3333","홍자바",40);

    //생성한 3개 객체를 리스트에 저장
    memberList.add(m1);
    memberList.add(m2);
    memberList.add(m3);

    //저장된 객체의 정보를 모두 출력
    //리스트에 저장된 객체 수만큼 반복...
    for (int i = 0; i < memberList.size(); i++){
      //출력문 안에 객체(명)이 있다면 투스링() 메서드 호출
      System.out.println(memberList.get(i).toString());
    }

    /// ////////////////////////////////////////////////////////////////////
    // 7. List에 저장된 모든 회원의 나이의 합을 출력하여라
    int ageSum = 0;
    for (Member member : memberList){
      ageSum = ageSum + member.getAge();
    }
    System.out.println("나이의 합 : " + ageSum);

    /// //////////////////////////////////////////////////////////////////
    //8. List 에 저장된 회원 중 id가 java 인 회원을 지우는 코드를 작성하세요
    //list에 저장된 데이터 하나하나에 접근하여 id가 "java"인지 확인
    for (int i = 0; i <memberList.size(); i++){
      if (memberList.get(i).getId().equals("java")){
        //가장가까운 반복문 벗어난다
        break;
      }
    }
  }
}
/*    for (Member member: memberList){
      if (member.getId().equals("java"));
      //리스트 객체명.remove(index);
      memberList.remove(2);
    }*/
