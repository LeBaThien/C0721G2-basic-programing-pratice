package b12_java_collection_framework.excercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ManageProduct {
    private final ArrayList<Product> productArrayList;

    //constructor ManagerProduct
    public ManageProduct() {
        this.productArrayList = new ArrayList<Product>();
    }

    public void addProduct(Product product) {
        this.productArrayList.add(product);
    }

    public void editProduct(int idProduct) {


        for (Product product : productArrayList) {
            if (product.getId() == idProduct) {
                while (true){
                    System.out.println("Enter number your want to edit");
                    System.out.println("1. Edit id");
                    System.out.println("2. Edit name product");
                    System.out.println("3. Edit Price");
                    System.out.println("4. Exit edit");
                    Scanner sc = new Scanner(System.in);
                    int selection = sc.nextInt();
                    switch (selection) {
                        case 1:
                            System.out.println("Enter new id product");
                            product.setId(sc.nextInt());
                            break;
                        case 2:
                            System.out.println("Enter new name product");
                            product.setNameProduct(sc.next());
                            break;
                        case 3:
                            System.out.println("Enter new price product");
                            product.setPriceProduct(sc.nextDouble());
                            break;
                        case 4:
                            return ;
                        default:
                            System.out.println("Please check your number");
                            break;
                    }
                }

//                } while (selection != 0);
            } else {
                System.out.println("Please check your Id, It maybe wrong ");
            }
        }

    }

    public void deleteProduct(int id) {
        boolean flag = false;
        for(Product product1: productArrayList){
           if(product1.getId() == id){
               this.productArrayList.remove(product1);
               flag = true;
               break;
           }
        }
        if(!flag) {
            System.out.println("Please check your id!!!");
        }
    }

    public void displayProduct() {
        for (Product product : productArrayList) {
            System.out.println(product);
        }
    }

    public boolean searchProduct(String name){
        for(Product product: productArrayList) {
            if(product.getNameProduct().equals(name)) {
                System.out.println(product);
                return true;
            }
        }
        return false;
    }

    public void sortIncreaseProduct (){
        Collections.sort(productArrayList, new ComparatorSortIncrease());
    }
    public void sortDecreaseProduct (){
        Collections.sort(productArrayList, new ComparatorSortDecrease());
    }


}
