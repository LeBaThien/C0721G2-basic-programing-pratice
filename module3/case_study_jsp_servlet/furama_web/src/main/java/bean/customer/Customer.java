package bean.customer;

public class Customer {
    private Integer customerId;
    private String customerName;
    private String customerBirthDay;
    private String customerGender;
    private String customerIdCard;
    private String customerPhone;
    private String customerAddress;
    private CustomerType customerType;

    public Customer(Integer customerId, String customerName, String customerBirthDay, String customerGender,
                    String customerIdCard, String customerPhone, String customerAddress) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerBirthDay = customerBirthDay;
        this.customerGender = customerGender;
        this.customerIdCard = customerIdCard;
        this.customerPhone = customerPhone;
        this.customerAddress = customerAddress;
    }

    public Customer(Integer customerId, String customerName, String customerBirthDay, String customerGender,
                    String customerIdCard, String customerPhone, String customerAddress, CustomerType customerType) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerBirthDay = customerBirthDay;
        this.customerGender = customerGender;
        this.customerIdCard = customerIdCard;
        this.customerPhone = customerPhone;
        this.customerAddress = customerAddress;
        this.customerType = customerType;
    }

//    public Customer(String name, String birthDay, String gender, String idCard,
//                    String phone, String address, CustomerType customerType) {
//    }


    public Customer(String customerName, String customerBirthDay, String customerGender, String customerIdCard,
                    String customerPhone, String customerAddress, CustomerType customerType) {
        this.customerName = customerName;
        this.customerBirthDay = customerBirthDay;
        this.customerGender = customerGender;
        this.customerIdCard = customerIdCard;
        this.customerPhone = customerPhone;
        this.customerAddress = customerAddress;
        this.customerType = customerType;
    }

    public Customer(){

    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerBirthDay() {
        return customerBirthDay;
    }

    public void setCustomerBirthDay(String customerBirthDay) {
        this.customerBirthDay = customerBirthDay;
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

//    @Override
//    public String toString() {
//        return "Customer{" +
//                "customerId=" + customerId +
//                ", customerName='" + customerName + '\'' +
//                ", customerBirthDay='" + customerBirthDay + '\'' +
//                ", customerGender='" + customerGender + '\'' +
//                ", customerIdCard='" + customerIdCard + '\'' +
//                ", customerPhone='" + customerPhone + '\'' +
//                ", customerAddress='" + customerAddress + '\'' +
//                ", customerType=" + customerType +
//                '}';
//    }
}
