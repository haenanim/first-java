package chapter07;

public class DaoExample {
  public static void main(String[] args) {
    dbWork(new OracleDao());
    dbWork(new MySqlDao());
  }
  public static void dbWork(DataAccessObejct dao) {
    dao.select();
    dao.insert();
    dao.update();
    dao.delete();
  }
}
interface DataAccessObejct{
  void select();
  void insert();
  void update();
  void delete();
}

class OracleDao implements DataAccessObejct {
  String kind = "Oracle";
  @Override
  public void select() {
    System.out.println(kind+"DB에서 검색");
  }

  @Override
  public void insert() {
    System.out.println(kind+"DB에 삽입");

  }

  @Override
  public void update() {
    System.out.println(kind+"DB를 수정");

  }

  @Override
  public void delete() {
    System.out.println(kind+"DB에서 삭제");

  }
}

class MySqlDao implements DataAccessObejct {
  String kind = "MySql";
  @Override
  public void select() {
    System.out.println(kind+"DB에서 검색");

  }

  @Override
  public void insert() {
    System.out.println(kind+"DB에서 삽입");

  }

  @Override
  public void update() {
    System.out.println(kind+"DB에서 수정");

  }

  @Override
  public void delete() {
    System.out.println(kind+"DB에서 삭제");

  }
}