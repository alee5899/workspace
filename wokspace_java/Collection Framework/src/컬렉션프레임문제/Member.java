package 컬렉션프레임문제;

public class Member {
  //변수 선언
  private String id;
  private String pw;
  private String name;
  private int age;

  //생성자:생성자에서는 멤버변수의 값을 초기화한다
  public Member(String id, String pw, String name, int age){
    this.id = id;
    this.pw = pw;
    this.name = name;
    this.age = age;
  }

  //setter
  public void setId(String id){
    this.id = id;
  }
  public void setPw(String pw){
    this.pw = pw;
  }
  public void setName(String name){
    this.name= name;
  }
  public void setAge(int age){
    this.age = age;
  }


  //getter
  public String getId(){
    return id;
  }
  public String getPw(){
    return pw;
  }
  public String getName(){
    return name;
  }
  public int getAge(){
    return age;
  }

  @Override
  public String toString() {
    return "Member{" +
            "id='" + id + '\'' +
            ", pw='" + pw + '\'' +
            ", name='" + name + '\'' +
            ", age=" + age +
            '}';
  }
}
