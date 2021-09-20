package b12_java_collection_framework.excercise;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ManageProduct manageProduct = new ManageProduct();
        manageProduct.addProduct(new Product(1, "iphone", 1300));
        manageProduct.addProduct(new Product(2, "samsung", 1200));
        manageProduct.addProduct(new Product(3, "sonny", 1100));
        manageProduct.addProduct(new Product(4, "nokia", 1000));

        int selection = 0;
        do {
            System.out.println("======= Manager Product =====");
            System.out.println("1. Add Product");
            System.out.println("2. Edit Product");
            System.out.println("3. Delete Product");
            System.out.println("4. Show Product List");
            System.out.println("5. Search Product List");
            System.out.println("6. Ordering a->z Product List");
            System.out.println("7. Ordering z->a Product List");
            System.out.println("0. Exit");
            selection = sc.nextInt();

            switch (selection) {
                case 1:{
                    System.out.print("Adding id product: ");
                    int idProduct = sc.nextInt();
                    System.out.print("Adding name product: ");
                    String nameProduct = sc.next();
                    System.out.print("Adding price product: ");
                    double priceProduct = sc.nextDouble();
                    Product product = new Product(idProduct, nameProduct, priceProduct);
                    manageProduct.addProduct(product);
                    break;
                }
                case 2: {
                    System.out.println("Enter your id product, that you want to edit");
                    int idProduct1 = sc.nextInt();
                    manageProduct.editProduct(idProduct1);
                    break;
                }
                case 3: {
                    System.out.println("Enter your id product, that you want to delete");
                    int idProduct2 = sc.nextInt();
                    manageProduct.deleteProduct(idProduct2);
                    break;
                }

                case 4: {
                    manageProduct.displayProduct();
                    break;
                }
                case 5: {
                    System.out.println("Enter your name product, that you want to find");
                    String name = sc.next();
                    manageProduct.searchProduct(name);
                    break;
                }
                case 6:
                    System.out.println("Ordering a->z Product List");
                    manageProduct.sortIncreaseProduct();
                    manageProduct.displayProduct();
                    break;
                case 7:
                    System.out.println("Ordering z->a Product List");
                    manageProduct.sortDecreaseProduct();
                    manageProduct.displayProduct();
                    break;
            }

        } while (selection != 0);
    }
}
