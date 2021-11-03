package repository.impl;

import bean.customer.Customer;
import bean.customer.CustomerType;
import repository.ConnectionSQL;
import repository.ICustomerRepository;
import service.ICustomerService;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {

//    private static final String SELECT_ALL = "SELECT customer.customer_id, customer.customer_name, customer.customer_birthday, customer.customer_gender, customer.customer_phone," +
//            "customer.customer_email, customer.customer_address, customer_type.customer_type_name" +
//            " FROM customer" +
//            " join customer_type" +
//            " on customer_type.customer_type_id = customer.customer_type_id;";

    private static final String SELECT_ALL = "SELECT *FROM customer join customer_type " +
            " on customer_type.customer_type_id = customer.customer_type_id;";
    private static final String INSERT_CUSTOMER = "";

    @Override
    public List<Customer> showList() {
        List<Customer> customersList = new ArrayList<>();
        try{Connection connectionSQL = new ConnectionSQL().getConnection();
            PreparedStatement statement =  connectionSQL.prepareStatement(SELECT_ALL);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()){
                int id = resultSet.getInt("customer_id");
                String name = resultSet.getString("customer_name");
                String birthday = resultSet.getString("customer_birthday");
                String gender =  resultSet.getInt("customer_gender") +"";
                String idCard = resultSet.getString("customer_id_card");
                String phone = resultSet.getString("customer_phone");
                String email = resultSet.getString("customer_email");
                String address = resultSet.getString("customer_address");
                int customerTypeId = Integer.parseInt(resultSet.getString("customer_type_id"));
                String customerTypeName = resultSet.getString("customer_type_name");
                customersList.add( new Customer(id,name,birthday,gender,idCard, phone, address,
                        new CustomerType(customerTypeId, customerTypeName)));

            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            ConnectionSQL.close();
        }
        return customersList;
    }

    @Override
    public void insert(Customer customer) {
//        try (Connection connection = new ConnectionSQL().getConnection();
//             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_SQL)) {
//            preparedStatement.setString(1, customer.getName());
//            preparedStatement.setString(2, customer.getIdCard());
//            preparedStatement.setString(3, customer.getPhone());
//            preparedStatement.setInt(4, customer.getCustomerType().getId());
//            System.out.println(preparedStatement);
//            preparedStatement.executeUpdate();
//        } catch (SQLException ignored) {
//            printSQLException(ignored);
//        } finally {
//            ConnectionSQL.close();
//        }
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void update(Customer customer) {

    }

    @Override
    public Customer findById(int id) {
        return null;
    }
}
