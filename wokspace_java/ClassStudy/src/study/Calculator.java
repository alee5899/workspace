package study;

public class Calculator {
  private int a;
  private int b;

  //생성자
  public Calculator(int a, int b){
    this.a = a;
    this.b = b;

  }
  public void setA(int a){
    this.a = a;
  }

  public void setB(int b){
    this.b = b;
  }
  //더하기 기능
  //더한 결과를 리턴하는 기능

  public int getSum(){
    return a + b;
  }
  //빼기 기능
  public int getSub(){
    return a - b ;
  }
  //곱하기 기능
  public int getMulti(){
    return a * b;
  }
  //나누기 기능
  public double getDiv(){
    return a / (double)b;
  }

}
