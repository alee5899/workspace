import java.util.Scanner;

public class 성적연습 {
  public static void main(String[] args) {
    int aScore;
    int bScore;
    int cScore;
    int dScore;
    int eScore;
    int total;
    int avg;
    Scanner sc = new Scanner(System.in);

    System.out.println("점수입력: ");
    aScore = sc.nextInt();

    System.out.println("점수입력: ");
    bScore = sc.nextInt();

    System.out.println("점수입력: ");
    cScore = sc.nextInt();

    System.out.println("점수입력: ");
    dScore = sc.nextInt();

    System.out.println("점수입력: ");
    eScore = sc.nextInt();

    total = aScore + bScore + cScore + dScore + eScore;
    avg = total/5;

    System.out.println("a=" + aScore);
    System.out.println("B=" + bScore);
    System.out.println("C=" + cScore);
    System.out.println("D=" + dScore);
    System.out.println("E=" + eScore);
    System.out.println("총합은 = " + total);
    System.out.println("평균은 = " + avg);

  }
}
