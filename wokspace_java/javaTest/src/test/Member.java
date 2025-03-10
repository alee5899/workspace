package test;

public class Member {
  private String id;
  private String pw;
  String name;
  private  int age;

  public  void setInfo(String id, String pw, String name, int age){
    this.id = id;
    this.pw = pw;
    this.name = name;
    this.age = age;
  }
  public void printInfo(){
    System.out.println("아이디 : " + id);
    System.out.println("패스워드 : " + pw);
    System.out.println("이름 : " + name);
    System.out.println("나이 : " + age  );
  }

  public boolean isLogin(String id, String pw){
    if (id.equals("kim")&& pw.equals("123")) {
      return true;
    }
    else {
      return false;
    }
  }
}
