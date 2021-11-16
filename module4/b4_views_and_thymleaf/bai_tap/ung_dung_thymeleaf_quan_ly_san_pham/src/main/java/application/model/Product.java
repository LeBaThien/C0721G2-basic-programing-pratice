package application.model;

public class Product {
    private int productId;
    private String productName;
    private double productPrice;
    private String productInfo;
    private String brandName;

    public Product(int productId, String productName, double productPrice, String productInfo, String brandName) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productInfo = productInfo;
        this.brandName = brandName;
    }

    public Product(){

    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductInfo() {
        return productInfo;
    }

    public void setProductInfo(String productInfo) {
        this.productInfo = productInfo;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
}
