package study;

import javax.xml.transform.Result;
import java.net.PortUnreachableException;
import java.util.prefs.BackingStoreException;

public class BankTest {
  public static void main(String[] args) {
    //Bank클래스에 대한 객체를 5개 저장할 수 있는 배열 backArr을 생성
    //bank 클래스에 대한 객체 5개를 만든 코드가 아니다
    //bank 클래스에 대한 객체 5개를 저장할수있는 공간을 5개를 만든거다
    Bank[] bankArr = new Bank[5];

    //bank클래스에 대한 객체를 5객 생성 초기값만 마음대로
    //그 다음 backArr에 객체를 저장
    bankArr[0] = new Bank("김자바",10000,"111-111");
    bankArr[1] = new Bank("김자바",20000,"111-222");
    bankArr[2] = new Bank("김자바",30000,"111-333");
    bankArr[3] = new Bank("김자바",40000,"111-444");
    bankArr[4] = new Bank("김자바",50000,"111-555");

    //backArr 배열에 저장된 모든 계좌의 예금액 합을 출력
    //for
    int sum1 = 0;
    for (int i = 0; i < bankArr.length; i++){
      sum1 = sum1 + bankArr[i].getBalance();
    }
    System.out.println("sum1 = " +  sum1);

    //for-each
    int sum2 = 0;
    for (Bank bank: bankArr){
      sum2 = sum2 + bank.getBalance();
    }
    System.out.println("sum = " + sum2);
    /// /////////////////////////////////////////////

    //2. backArr 에 저장된 모든 계좌정보 중에서
    //계좌주가 "최자바"인 계좌정보를 찾고, 그 정보 중
    //예금액을 20%인상 시키는 코드로 작성

    //for
    for (int i = 0; i < bankArr.length; i++ ){
      if (bankArr[i].getOwner().equals("최자바")){
        //최종금액= 원래금액 * 1.2
        int result = (int)(bankArr[i].getBalance() * 1.2);
        bankArr[i].setBalance(result);

      }

    }

    //for each
    for ( Bank e: bankArr){
      if (e.getOwner().equals("최자바")){
        int result = (int) (e.getBalance() * 1.2);
        e.setBalance(result);
      }
    }
  }
}
