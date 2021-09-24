package b17_io_binary_file_and_serialization.excercise;

import java.io.Serializable;

public class Product implements Serializable {
    private int idProduct;
    private String nameProduct;
    private String branchName;
    private double priceProduct;
    private String information;
//    private List<Product> list;

    public Product(int idProduct, String nameProduct, String branchName, double priceProduct, String information) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.branchName = branchName;
        this.priceProduct = priceProduct;
        this.information = information;
    }

//    public void List (List<Product> list){
//        this.list = new ArrayList<>();
//    }


    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public double getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(double priceProduct) {
        this.priceProduct = priceProduct;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

//    public void addProduct (Product product){
//        this.list.add(product);
//    }


    @Override
    public String toString() {
        return "Product{" +
                "idProduct=" + idProduct +
                ", nameProduct='" + nameProduct + '\'' +
                ", branchName='" + branchName + '\'' +
                ", priceProduct=" + priceProduct +
                ", information='" + information + '\'' +
                '}';
    }
}
