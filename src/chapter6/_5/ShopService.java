package chapter6._5;

public class ShopService {
    private static ShopService service = new ShopService();

    private ShopService() {}

    static ShopService getInstance() {
        return service;
    }
}
