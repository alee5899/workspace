import com.sun.tools.javac.Main;

//조건문:if문
//조건문: 조건이 맞을 때만 코드를  실행하는 문법
/*
* if(){
*
* }
* */
public  class IF_1{
  public static void main(String[] args) {
    System.out.println("시작");
    int num = 3;
    if(num == 3) {
      System.out.println("aaaa");
      System.out.println("aaaa");
      System.out.println("aaaa");
    }

    //조건에 따른 실행코드가 하나라면 중괄호 생략 가능
    if(num > 5 )
      System.out.println("bbb");
      System.out.println("bbb");




      System.out.println("끝");
    }
    }