 // 12. 1부터 누적해서 합을 구하다 300이 최초로 넘었을 때 for문을 멈추고 그때까지의 합과마지막으로 더해진 값을 각각 출력하여라
public class 반복문__12 {
  public static void main(String[] args) {
    int sum = 0;
    for (int i = 1; i <= 301; i++){
      sum = sum + i;
    }
    System.out.println(sum);
  }
}
