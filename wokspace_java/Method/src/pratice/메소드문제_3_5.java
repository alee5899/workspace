
package pratice;

import java.util.Arrays;

public class 메소드문제_3_5 {
  public static void main(String[] args) {
    //5. 정수형 배열을 매개변수로 받아 배열의 모든 요소를 출력하는 메소드를 만들고 호출하세요
    int[] a = {5, 1, 7, 10};
    System.out.println(Arrays.toString(test5(a)));
  }

  public static int[] test5(int[] arr) {
    int[] k = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      k[i] = arr[i];
    }
    return k;
  }
}

