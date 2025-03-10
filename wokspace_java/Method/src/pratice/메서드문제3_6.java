package pratice;
//6. 정수형 배열을 매개변수로 받아 배열의 모든 요소 중 최대값을 리턴하는 메소드를 만들고 호출해보세요
public class 메서드문제3_6 {
  public static void main(String[] args) {
    int[] arr = {1,10,100,5,2};
    int maxData = test6(arr);
    System.out.println(maxData);

  }
  public static int test6(int[]arr){//[1 5 7 3]   max=1
    int max = arr[0];
    for (int i = 0; i < arr.length; i++){
      if (max < arr[i]){
        max = arr[i];
      }
    }
    return max;
  }
}
