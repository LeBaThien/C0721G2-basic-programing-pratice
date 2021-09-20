package code_f4.collection.hotel_manager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HotelManager {
    private final List<Customer> customers;

    public HotelManager() {
        this.customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        this.customers.add(customer);
    }

    public void showCustomer() {
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }

    public void editCustomer(int id) {
        for ( Customer customer : customers){
            if (customer.getId() == id ){
                while (true) {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter letter that you want to edit");
                    System.out.println("a. Edit ID");
                    System.out.println("b. Edit customer age");
                    System.out.println("c. Edit customer name");
                    System.out.println("d. Exit edit");
                    String type = sc.next();
                    switch (type) {
                        case "a": {
                            System.out.print("Enter new ID customer: ");
                            customer.setId(sc.nextInt());
//                        System.out.println("If you want to continue edit, please enter next letter." +
//                                "If you want to Exit edit, please enter d ");
                            break;
                        }
                        case "b": {
                            System.out.print("Enter new customer age: ");
                            customer.setAge(sc.nextInt());
                            break;
                        }
                        case "c": {
                            System.out.print("Enter new customer name: ");
                            customer.setNameCustomer(sc.next());
                            break;
                        }
                        case "d": {
                            return;
                        }
                        default: {
                            System.out.println("Please check your letter");
                            break;
                        }
                    }
                }

            }else {
                System.out.println("Please check your Id customer!!!");
            }
        }

    }

    public void deleteCustomer (int id){
        boolean flag = false;
        for (Customer customer : customers){
            if(customer.getId() == id){
                this.customers.remove(customer);
                flag = true;
                break;//be careful
            }
        }
        if(!flag){
            System.out.println("Please check your Id!!!");
        }
//        return false;
    }

    public int calculator (int id) {
        Customer customer = this.customers.stream()
                .filter(customer1 -> customer1.getId() == id)
                .findFirst().orElse(null);
        if(customer == null){
            return 0;
        }
        return customer.getRoom().getPrice() * customer.getNumberRent();
    }
}
