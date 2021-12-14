package casestudy.demo.model.customer;


import casestudy.demo.model.contract.Contract;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import javax.persistence.*;
import java.util.List;

@Entity
public class Customer implements Validator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customerId;
    private String customerName;
    private String customerBirthday;
    private String customerGender;
    private String customerIdCard;
    private String customerPhone;
    private String customerEmail;
    private String customerAddress;
    @ManyToOne(targetEntity = CustomerType.class)
    private CustomerType customerType;

    @OneToMany(mappedBy = "customer")
    private List<Contract> contracts;

    public Customer (){

    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerBirthday() {
        return customerBirthday;
    }

    public void setCustomerBirthday(String customerBirthday) {
        this.customerBirthday = customerBirthday;
    }

    public String getCustomerGender() {
        return customerGender;
    }

    public void setCustomerGender(String customerGender) {
        this.customerGender = customerGender;
    }

    public String getCustomerIdCard() {
        return customerIdCard;
    }

    public void setCustomerIdCard(String customerIdCard) {
        this.customerIdCard = customerIdCard;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        Customer customer = (Customer) target;

        String name = customer.getCustomerName();
        String birthday = customer.getCustomerBirthday();
        String idCard = customer.getCustomerIdCard();
        String phone = customer.getCustomerPhone();
        String email = customer.getCustomerEmail();
        String address = customer.getCustomerAddress();
        ValidationUtils.rejectIfEmpty(errors,"customerAddress", "address.empty");
        ValidationUtils.rejectIfEmpty(errors, "customerBirthday", "birthday.empty");
        ValidationUtils.rejectIfEmpty(errors,"customerIdCard", "idCard.empty");
        ValidationUtils.rejectIfEmpty(errors,"customerPhone", "phone.empty");
        ValidationUtils.rejectIfEmpty(errors,"customerEmail", "email.empty");
        ValidationUtils.rejectIfEmpty(errors,"customerName", "name.empty");

        if( address.length() > 100){
            errors.rejectValue("customerAddress", "address.length");
        }
        if(!email.matches("^[A-Za-z0-9+_.-]+@(.+)$")){
            errors.rejectValue("customerEmail", "customerEmail.matches");
        }
        if(!phone.matches("^(0?)(3[2-9]|5[6|8|9]|7[0|6-9]|8[0-6|8|9]|9[0-4|6-9])[0-9]{7}$")){
            errors.rejectValue("customerPhone", "customerPhone.matches");
        }
    }
}
