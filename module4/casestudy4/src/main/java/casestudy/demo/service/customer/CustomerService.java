package casestudy.demo.service.customer;

import casestudy.demo.model.customer.Customer;
import casestudy.demo.repository.customer_repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CustomerService implements ICustomerService {
    @Autowired
    private ICustomerRepository customerRepository;

    @Override
    public Iterable<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Optional<Customer> findById(int id) {
        return customerRepository.findById(id);
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void remove(int id) {
        customerRepository.deleteById(id);
    }

    @Override
    public Page<Customer> findCustomerByCustomerPhone(String phone, Pageable pageable) {
        return customerRepository.findCustomerByCustomerPhone(phone, pageable);
    }

    @Override
    public Page<Customer> findAllCustomer(Pageable pageable) {
        return customerRepository.findAll(pageable);
    }

    @Override
    public int countByCustomerId() {
        List<Customer> customerList = (List<Customer>) customerRepository.findAll();
        return customerList.size();
    }

//    @Override
//    public String countByCustomerId() {
//        return null;
//    }

    @Override
    public Page<Customer> findCustomerByCustomerTypeId(int id, Pageable pageable) {
        return customerRepository.findCustomerByCustomerTypeId(id,pageable);
    }


}
