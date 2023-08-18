package chapter06.ExtendsTest;

public class ShopService {
  private static ShopService instance = new ShopService();
  private ShopService() {}
  public static ShopService getInstance() {
    return instance;
  }
}
