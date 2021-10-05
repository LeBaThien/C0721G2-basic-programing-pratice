package case_study.services;

import case_study.models.Customer;

import java.util.*;

public class CustomerServiceImpl implements CustomerService {
    protected static List<Customer> customerList = new LinkedList<>();
    protected static Scanner scanner = new Scanner(System.in);

    static {
        Customer customer1 = new Customer("jose", "12/7/1990", "Female", 12321, 1237,
                "jose@gmail.com", 12, Customer.DIAMOND, "dn");
        Customer customer2 = new Customer("thomas", "5/7/1999", "Female", 12761, 20017,
                "thomas@gmail.com", 10, Customer.GOLD, "qn");
        //Viet truc tiep
        customerList.add(new Customer("Grace", "4/7/1995", "male", 88021, 347137,
                "grace@gmail.com", 8, Customer.MEMBER, "uk"));
        customerList.add(new Customer("jordan", "4/7/1995", "male", 88021, 347137,
                "jordan@gmail.com", 15, Customer.MEMBER, "uk"));
        customerList.add(customer1);
        customerList.add(customer2);

    }

    public static Customer getIndexCustomer(int idCustomer) {
        for (Customer customer : customerList) {
                if (customer.getIdCustomer() == idCustomer) {
//                int index  = customerList.indexOf(customer);
                    return customer;
                }
            }
            return null;
    }

    @Override
    public void add() {
        System.out.print("Enter customer name: ");
        String nameCustomer = scanner.next();
        System.out.print("Enter customer date birth: ");
        String dateBirth = scanner.next();
        System.out.print("Enter customer sex: ");
        String sex = scanner.next();
        System.out.print("Enter customer identification: ");
        int identification = scanner.nextInt();
        System.out.print("Enter customer phone number: ");
        int numberPhone = scanner.nextInt();
        System.out.print("Enter customer email: ");
        String email = scanner.next();
        System.out.print("Enter customer id: ");
        int idCustomer = scanner.nextInt();
        System.out.print("Enter type of customer: ");
        String typeOfCustomer = scanner.next();
        System.out.print("Enter customer address: ");
        String addressCustomer = scanner.next();
        Customer customer = new Customer(nameCustomer, dateBirth, sex, identification, numberPhone, email, idCustomer,
                typeOfCustomer, addressCustomer);
        customerList.add(customer);
    }

    @Override
    public void display() {
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
    }

    @Override
    public void edit(int id) {
        for (Customer customer : customerList) {
            if (customer.getIdCustomer() == id) {
                System.out.println("==Chose letter your want to edit ");
                System.out.println("a. Edit name\n" + "b. Edit date birth\n"
                        + "c. Edit gender\n" + "d. Edit identification\n"
                        + "e. Edit phone number\n" + "f. Edit email\n"
                        + "g. Edit id Customer\n" + "h. Edit type of customer\n"
                        + "i. Edit address\n" + "o. Exit edit");
                String letter = scanner.next();
                switch (letter) {
                    case "a": {
                        System.out.print("Enter new name: ");
                        String name = scanner.next();
                        customer.setName(name);
                        break;
                    }
                    case "b": {
                        System.out.print("Enter new date birth: ");
                        String dateBirth = scanner.next();
                        customer.setDateBirth(dateBirth);
                        break;
                    }
                    case "c": {
                        System.out.print("Enter new gender: ");
                        String sex = scanner.next();
                        customer.setSex(sex);
                        break;
                    }
                    case "d": {
                        System.out.print("Enter new identification: ");
                        int identification = scanner.nextInt();
                        customer.setIdentification(identification);
                        break;
                    }
                    case "e": {
                        System.out.print("Enter new phone number: ");
                        int numberPhone = scanner.nextInt();
                        customer.setPhoneNumber(numberPhone);
                        break;
                    }
                    case "f": {
                        System.out.print("Enter new email: ");
                        String email = scanner.next();
                        customer.setEmail(email);
                        break;
                    }
                    case "g": {
                        System.out.print("Enter new Id: ");
                        int idEmployee = scanner.nextInt();
                        customer.setIdentification(idEmployee);
                        break;
                    }
                    case "h": {
                        System.out.print("Enter new type of customer: ");
                        String degree = scanner.next();
                        customer.setTypeOfCustomer(degree);
                        break;
                    }
                    case "i": {
                        System.out.print("Enter new address: ");
                        String address = scanner.next();
                        customer.setAddressCustomer(address);
                        break;
                    }
                    case "o": {
                        return;
                    }
                    default: {
                        System.out.println("Please check your 'letter'");
                        break;
                    }
                }
            }
        }
    }

    @Override
    public void delete() {
    //cap nhat sau
    }


}
