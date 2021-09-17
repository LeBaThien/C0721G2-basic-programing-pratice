package b12_java_collection_framework.excercise;
//Comparable<Product>
public class Product {
    private int id;
    private String nameProduct;
    private double priceProduct;

    public Product(){

    }

    public Product(int id, String nameProduct, double priceProduct) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(double priceProduct) {
        this.priceProduct = priceProduct;
    }

    @Override
    public String toString() {
        return "Product{ "
                + "idProduct: "
                + getId()
                +", product name: "
                + getNameProduct()
                +", price: "
                + getPriceProduct()
                + " }";
    }

//    @Override
//    public int compareTo(Product o) {
//        // 20, 10, 30 40
//        return this.getNameProduct().compareTo(o.getNameProduct());
//    }
}
