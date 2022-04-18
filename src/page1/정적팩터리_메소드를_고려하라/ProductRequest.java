package page1.정적팩터리_메소드를_고려하라;

public class ProductRequest {

    private Long id;

    private String item_id;

    private String code;

    private String extraParam;

//    public ProductRequest(Long id, String item_id, String code, String extraParam) {
//        this.id = id;
//        this.item_id = item_id;
//        this.code = code;
//        this.extraParam = extraParam;
//    }

    private ProductRequest() {
    }

    public static ProductRequest createPointProductRequest(Long id, String item_id, String code) {
//        return new ProductRequest(id, item_id, code, "POINT_PRODUCT");
        ProductRequest productRequest = new ProductRequest();
        productRequest.id = id;
        productRequest.item_id = item_id;
        productRequest.code = code;
        productRequest.extraParam = "POINT_PRODUCT";
        return productRequest;
    }

    public static ProductRequest createCashProductRequest(Long id, String item_id, String code) {
//        return new ProductRequest(id, item_id, code, "CASH_PRODUCT");
        ProductRequest productRequest = new ProductRequest();
        productRequest.id = id;
        productRequest.item_id = item_id;
        productRequest.code = code;
        productRequest.extraParam = "CASH_PRODUCT";
        return productRequest;
    }

    @Override
    public String toString() {
        return "ProductRequest{" +
                "id=" + id +
                ", item_id='" + item_id + '\'' +
                ", code='" + code + '\'' +
                ", extraParam='" + extraParam + '\'' +
                '}';
    }
}
