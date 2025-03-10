package study;
/*
* 메서드(method) : 반복 사용되는 기능을 하나의 기능상자로 표현 한 것
* 이러한 것을 대부분의 언어에서는 함수(function)라고 표현 함.
*
* 메서드사용 방법
* 1. 메서드를 정의(하고 싶은 기능을 정의)
*  - 메서드의 정의는 클래스 안 그리고 또다른 메서드 밖에 작성
*  - 메서드의 정의 문법
*  접근 제한자 [static] 리턴타입 메서드명(매개변수들){
*     메서드의 내용...
*    }
*
*  접근제한자는 무조건 public 으로 사용!
*  접근제한자 뒤에는 static 키워드를 사용!
*  메서드명은 소문자로 작성
*  메서드는 필요한 만큼 다 수 정의 가능
* 메서드명은 중복 불가!!!
* 한 번 정의한 메서드는 여러번 호출 가능!!
*
* * 2. 정의된 메서드를 호출(사용)
*   정의된 메서드를 사용하기 위해서는 메서드 호출을 해야되는데,
*  호출을 할려면 정의한 메서드명과 동일해야하고
* 동시에 매개변수 정보(매개변수의 자료형,매개변수의 개수)가 동일해야함
* 호출은 '메서드명()' 로 작성하다
*
* */

public class Method_1 {

  public static void main(String[] args) {
    System.out.println("프로그램 시작");

    //printHello()메서드 호출
    printHello();
    printHello();
    printHello();

    System.out.println("프로그램 종료");
  }

  //'안녕하세요' 를 출력하는 메서드의 정의
  public static void printHello(){
    System.out.println("반갑!!!");
  }
}
