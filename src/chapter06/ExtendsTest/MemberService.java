package chapter06.ExtendsTest;

public class MemberService {
  boolean login(String id, String password) {
    if(id.equals("hong") && password.equals("12345")){
      return true;
    }
    return false;

  }
  boolean logout(String id) {
    if(id.equals("hong")){
      System.out.println(id + "님이 로그아웃 되었습니다.");
      return true;
    } else {
      return false;
    }
  }
}
