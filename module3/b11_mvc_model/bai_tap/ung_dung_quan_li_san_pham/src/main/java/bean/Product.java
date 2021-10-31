package bean;

public class Product {
    private Integer productId;
    private String productName;
    private double productPrice;
    private String descriptionProduct;
    private String producer;

    public Product(Integer productId, String productName, double productPrice, String descriptionProduct, String producer) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.descriptionProduct = descriptionProduct;
        this.producer = producer;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
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

    public String getDescriptionProduct() {
        return descriptionProduct;
    }

    public void setDescriptionProduct(String descriptionProduct) {
        this.descriptionProduct = descriptionProduct;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
}
