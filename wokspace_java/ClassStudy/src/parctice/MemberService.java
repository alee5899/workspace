package parctice;

public class MemberService {
  public boolean login(String id, String password){
    //id : "hong",password:"21345" -> true;
    if (id.equals("hong")&& password.equals("12345")){
      return true;
    }
    else {
      return false;
    }
    //return id.equals("hong")&& password.equals("12345") ? true :false;

  }

  public  void  logout(String id){
    System.out.println("로그아웃되었습니다");
  }


  }

