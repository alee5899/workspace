// 7. 문자열 배열을 매개변수로 받아 배열에 저장된 모든 문자열을 나열하여 리턴하는 메소드를 만들고호출해보세요.
package pratice;

public class 메서드문제3_7 {
  public static void main(String[] args) {
    String[] c = {"집에" ,"보내줘","!!"};
    String t = test7(c);
    System.out.println(t);
  }
  public static String test7(String[] arr){//["aa","bb","cc"}
    String result = "";
    for (int i = 0; i < arr.length; i++){
      result = result + arr[i] ;

    }
    return result;

  }
}
