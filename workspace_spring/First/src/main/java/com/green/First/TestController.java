package com.green.First;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TestController {

  //localhost:8080/t1
  //anotation 어노테이션
  @GetMapping("/t1")
  public String test1(){
    return  "java";
  }
//http://localhost:8080/t2
  @GetMapping("/t2")
  public int test2(){
    return 10;
  }


  @GetMapping("/t3")
  public Person  test3(){
    //person 클래스에 대하 객체를 하나 생성!
    //클래스명 객체명 = new 생성자호출;
    Person p = new Person("kim",20,"울산시");
    return p;
  }


  @GetMapping("/t4")
  public  List<Person>    test4(){
    //person 클래스에 대한 객체를 다수 저장할 수 있는 리스트 생성
    //자료형 변수명
    List<Person> list = new ArrayList<>();

    Person p1 = new Person("kim",20,"울산시");
    Person p2 = new Person("LEE",30,"부산시");
    Person p3 = new Person("HONG",40,"대구시");

    list.add(p1);
    list.add(p2);
    list.add(p3);

    return list;
  }

  @GetMapping("/t5")
  public List<Student> test5(){



    List<Student> a1 = new ArrayList<>();

    Student s1 = new Student("kim", 70, 80, 80);
    Student s2 = new Student("LEE", 80, 50, 10);
    Student s3 = new Student("HONG", 60, 20, 90);
    Student s4 = new Student("PARK", 30, 60, 60);
    Student s5 = new Student("GIM", 10, 40, 40);

    a1.add(s1);
    a1.add(s2);
    a1.add(s3);
    a1.add(s4);
    a1.add(s5);

    return a1;
  }

  //react에서 전달하는 데이터를 자바에서 받는 문법은 2가지 존재
  //1. 클래스를 활용하는 방법
  //react에서 전달하는 객체의 key와
  //자바에서 데이터를 받기위해 매개변수에 선언한 클래스의 변수명이
  //동일하면 데이터를 자동으로 받아옵니다
  //2. Collection Framewok의 Map을 활용하는 방법
@PostMapping("/t6")
  public void test6(@RequestBody Student student){
  System.out.println(student.toString());

}

@PostMapping("/t7")
public  void  test7(@RequestBody PhoneDTO phoneDTO){
  System.out.println(phoneDTO.toString());

}

@PostMapping("/t8")
public int  test8(@ RequestBody Student student){
    int sum = student.getKorScore() + student.getEngScore() + student.getMathScore();
    return sum;
}
@PostMapping("/t9")
public  void  test9(@RequestBody OrderDTO orderDTO) {
  System.out.println(orderDTO.toString());

}

//@GetMapping("/t10")
//public  int  test10(){
//    int lotto =(int)(Math.random()* 45 + 1);
//    return lotto;
//}

  @GetMapping("/getLottoNum")
  public int getLottoNum() {
    int num = (int) (Math.random() * 45 + 1);
    return num;

  }

//  @GetMapping("/t11")
//  public List<Board> boardList(){
//    Board b1 = new Board(1,3,"제목입니다1","김자바","안녕하세요1");
//    Board b2 = new Board(2,5,"제목입니다1","이자바","안녕하세요2");
//    Board b3 = new Board(3,3,"제목입니다1","박자바","안녕하세요3");
//    Board b4 = new Board(4,4,"제목입니다1","최자바","안녕하세요8");
//    Board b5 = new Board(5, 9, "제목입니다1", "강자바", "안녕하세요4");
//
//    List<Board> bList = new ArrayList<>();
  
//    bList.add(b1);
//    bList.add(b2);
//    bList.add(b3);
//    bList.add(b4);
//    bList.add(b5);
//
//    return bList;
//  }
  @GetMapping("/getBoardList")
  public List<Board> sendBoardList(){
    List<Board> boardList = new ArrayList<>();
    boardList.add(new Board(1,"제목1","김자바",5,"제목 1 내용입니다"));
    boardList.add(new Board(2,"제목2","김자바",8,"제목 2 내용입니다"));
    boardList.add(new Board(3,"제목3","김자바",3,"제목 3 내용입니다"));
    boardList.add(new Board(4,"제목4","김자바",4,"제목 4 내용입니다"));
    boardList.add(new Board(5,"제목5","김자바",1,"제목 5 내용입니다"));

    return boardList;
  }

  @GetMapping("/getOrderList")
  public List<Order> testOrderList(){
    List<Order> orderList = new ArrayList<>();
    orderList.add(new Order(101,"데님 청바지",15000,2,"a"));
    orderList.add(new Order(102,"맨투맨 반팔",10000,3,"b"));
    orderList.add(new Order(103,"오버핏 니트",25000,2,"c"));
    orderList.add(new Order(104,"롱 패딩",55000,1,"d"));
    orderList.add(new Order(105,"맨투맨 긴팔 티셔츠",12000,3,"e"));

    return orderList;
    }
}
