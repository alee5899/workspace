package study;

public class Member_ {
  private String name;
  private String id;
  private String pw;

  Member_(){}

  public Member_(String name, String ID, String PW){
    this.name = name;
    this.id = id;
    this.pw = pw;
  }

  public void setName(String name){
    this.name = name;
  }

  public void setID(String ID){
    this.id = id;
  }

  public void setPW(String PW){
    this.pw = pw;
  }

  public String getName(){
    return name;
  }
  public String getID(){
    return id;
  }
  public String getPW(){
    return pw;
  }

  public void displayInfo(){
    System.out.println("이름 : " +  name);
    System.out.println("아이디 : " + id);
    System.out.println("비밀번호 : " + pw);
  }

}
