package com.example.demo.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;

@Entity
@Table(name = "customer")
//@SQLDelete(sql = "UPDATE customer SET deleted = true WHERE id=?")
//@Where(clause = "deleted=false")
//Custom quyền xem cho tất cả record(đã xóa) cho admin
//<strong>@FilterDef(name = "deletedProductFilter", parameters = @ParamDef(name = "isDeleted", type = "boolean"))
//@Filter(name = "deletedProductFilter", condition = "deleted = :isDeleted")</strong>
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(nullable = false, updatable = false)
    private Long id;
    private String customerCode;
    private String customerName;
    private String dateOfBirth;
    private String customerAddress;
    private String customerPhone;
    private String email;

    @ManyToOne(targetEntity = CustomerType.class)
    private CustomerType customerType;

    private Boolean deleted = Boolean.FALSE;

    public Customer(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
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

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}
