package b17_io_binary_file_and_serialization.excercise;

import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
//        products.add(new Product(1,"iphone","Apple",1200,"new 100%"));
//        products.add(new Product(2,"galaxyS","samsung",1200,"new 100%"));
//        products.add(new Product(3,"sonyA","Sony",1200,"new 100%"));
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("===Menu===");
            System.out.println("1. Add a new product");
            System.out.println("2. Show product list");
            System.out.println("3. Find product");
            System.out.println("4. Exit");
            int selection = scanner.nextInt();
            switch (selection){
                case 1: {
                    productManager.addProduct();
                    break;
                }
                case 2: {
                    productManager.showProduct();
                    break;
                }
                case 3:{
                    productManager.findProduct();
                    break;
                }
                case 4: {
                    return;
                }
                default:{
                    System.out.println("Invalid");
                }
            }

        }

    }
}
