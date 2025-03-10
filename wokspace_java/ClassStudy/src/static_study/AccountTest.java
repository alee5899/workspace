package static_study;

public class AccountTest {
  public static void main(String[] args) {
    Acconunt a1 = new Acconunt("김자바");
    Acconunt a2 = new Acconunt("박자바");
    Acconunt a3 = new Acconunt("최자바");

    Acconunt.iyul = 10.0;
    System.out.println(a1.iyul);
  }
}
