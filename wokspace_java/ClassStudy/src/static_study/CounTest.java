package static_study;

public class CounTest {
  public static void main(String[] args) {
    Count count1 = new Count();
    Count count2 = new Count();
    Count count3 = new Count();

    System.out.println(count1.cnt);
    count2.cnt = 10;
    System.out.println(count1.cnt);

    //static 변수는 클래스명.변수명;
    System.out.println(Count.cnt);

    System.out.println(Math.PI);
  }
}
