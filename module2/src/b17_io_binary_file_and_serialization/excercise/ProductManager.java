package b17_io_binary_file_and_serialization.excercise;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    //dùng static
    private static List<Product> products = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    private static File file = new File("D:\\codegym_final\\module2\\src\\b17_io_binary_file_and_serialization\\excercise\\product.txt");

    public static void writeToFile(List<Product> products) {
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Product>  readDataFromFile() {
        List<Product> products = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            products = (List<Product>) ois.readObject();//ép kiểu
            fis.close();
            ois.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return products;
    }

    public void addProduct() {
        System.out.println("Enter id product");
        int id = scanner.nextInt();
        System.out.println("Enter name product");
        String name = scanner.next();
        System.out.println("Enter branch name product");
        String branchName = scanner.next();
        System.out.println("Enter the price product ");
        double priceProduct = scanner.nextDouble();
        System.out.println("Enter information");
        String information = scanner.nextLine();
        Product product = new Product(id, name, branchName, priceProduct, information);
        if(file.length() > 0) {
            products = readDataFromFile();
        }
        products.add(product);
        writeToFile(products);
    }

    public void showProduct() {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public void findProduct (){
        System.out.println("Enter name product");
        String nameProduct = scanner.next();
        for (Product product :products) {
            //dùng equals vì string
            if(nameProduct.equals(product.getNameProduct())){
                System.out.println(product);
            }
        }
    }


}
