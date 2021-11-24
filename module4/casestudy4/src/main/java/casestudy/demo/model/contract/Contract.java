package casestudy.demo.model.contract;

import casestudy.demo.model.customer.Customer;
import casestudy.demo.model.employee.Employee;
import casestudy.demo.model.service.Service;
import org.hibernate.service.spi.ServiceException;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int contractId;
    private String startDate;
    private String endDate;
    private String deposit;
    private String totalMoney;

    @ManyToOne(targetEntity = Employee.class)
    private Employee employee;

    @ManyToOne(targetEntity = Customer.class)
    private Customer customer;

    @ManyToOne(targetEntity = Service.class)
    private Service service;

    @OneToMany(mappedBy = "contract")
    List<ContractDetail> contractDetails;



    private Contract(){

    }


}
