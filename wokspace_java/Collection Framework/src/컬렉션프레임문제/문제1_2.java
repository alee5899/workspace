package 컬렉션프레임문제;


import java.util.*;

public class 문제1_2  {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    //정수를 저장할 수 있는 리스트
    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < 5; i++){//5반복
      System.out.println(i + 1 + "번째 정수 입력 : ");
      int num1 = sc.nextInt();
      list.add(num1);
    }
    //list 에 저장된 모든 데이터의 합
    int sum = 0;
    for (int i = 0; i < list.size(); i++){
      sum = sum + list.get(i);
    }

    System.out.println("sum = " + sum);

  }
}
