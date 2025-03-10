package study;

//직장동료
public class CompFriend extends  Friend{
  private String dept;

  public CompFriend(String name, String tel, String dept) {
    super(name,tel);
    this.dept = dept;
  }

  public void showCompInfo(){
   super. showInfo();
    System.out.println("전공 : " + dept);
  }
}

