public class Test2 {
  public static void main(String[] args) {
    int[] lotto = new int[1];

    for (int i = 0; i < lotto.length; i++){
      lotto[i] = (int)(Math.random() * 45 + 1);
    }

    for (int i = 0;  i< lotto.length; i++){
      System.out.println(lotto[i] + "");

    }
  }
}
