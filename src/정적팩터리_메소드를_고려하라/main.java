package 정적팩터리_메소드를_고려하라;

import java.util.List;

public class main {

    public static void main(String[] args) {

//        ProductRequest request1 = new ProductRequest(1L, "ITEM_1", "M-A-T-01CA", "POINT_PRODUCT");
//        ProductRequest request2 = new ProductRequest(1L, "ITEM_1", "M-A-T-01CA", "CASH_PRODUCT");

        ProductRequest cashRequest = ProductRequest.createCashProductRequest(1L, "ITEM_1", "M-A-T-01CA");
        ProductRequest pointRequest = ProductRequest.createPointProductRequest(1L, "ITEM_1", "M-A-T-01CA");

//        System.out.println("request = " + request1);
//        System.out.println("request = " + request2);
        System.out.println("cashRequest = " + cashRequest);
        System.out.println("pointRequest = " + pointRequest);

        FooImpl fooImpl = Foo.createFooImpl();

        List<TicketSeller> sellers = TicketStore.getSellers();
    }
}
