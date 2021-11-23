package casestudy.demo.model.contract;

import casestudy.demo.model.customer.Customer;
import casestudy.demo.model.employee.Employee;
import org.hibernate.service.spi.ServiceException;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.List;

@Entity
public class Contract {
    @Id
    @ManyToOne()
    private int contractId;
    private String startDate;
    private String endDate;
    private String deposit;
    private String totalMoney;
    private Employee employee;
    private Customer customer;
    private Service service;



    private Contract(){

    }


}
