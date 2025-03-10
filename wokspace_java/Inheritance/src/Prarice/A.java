package Prarice;

public class A {
  private  int n;
  public  int getN(){
    return n;
  }
  public  void setN(int i){
    n = i;
  }
}


class B extends A {
  public String s;
  public int m;
  private char c;

  public void setC(char ch) {
    c = ch;
  }

  public char getC() {
    return c;
  }

}

  class   C extends B{
    public  double d;
}

//public > default > protected > private
//protected : private + 해당 클래스의 자식클래스는 접근 허용
