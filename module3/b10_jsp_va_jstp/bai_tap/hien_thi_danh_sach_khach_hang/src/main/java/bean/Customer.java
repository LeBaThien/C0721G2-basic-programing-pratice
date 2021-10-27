package bean;

public class Customer {
    private Integer customerId;
    private String nameCustomer;
    private String dateOfBirth;
    private String customerAddress;
    private String customerImage;

    public Customer(Integer customerId, String nameCustomer, String dateOfBirth, String customerAddress, String customerImage) {
        this.customerId = customerId;
        this.nameCustomer = nameCustomer;
        this.dateOfBirth = dateOfBirth;
        this.customerAddress = customerAddress;
        this.customerImage = customerImage;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCustomerImage() {
        return customerImage;
    }

    public void setCustomerImage(String customerImage) {
        this.customerImage = customerImage;
    }
}
