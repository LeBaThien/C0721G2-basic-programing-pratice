package repository.impl;

import bean.customer.Customer;
import bean.customer.CustomerType;
import repository.ConnectionSQL;
import repository.ICustomerRepository;
import service.ICustomerService;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
    private static final String INSERT_CUSTOMER = "insert into customer (customer_type_id, customer_name, customer_birthday, customer_gender," +
            " customer_id_card, customer_phone,\n " +
            " customer_address)\n" +
            " values(?, ?, ?, ?, ?, ?, ?);";

    private static final String SELECT_CUSTOMER_TYPE = "SELECT *FROM customer_type";
    private static final String UPDATE_CUSTOMER = "Update Customer " +
            " set customer_type_id = ?, customer_name = ?, customer_birthday = ?, customer_gender = ?, customer_id_card = ?, customer_phone = ?,\n" +
            "customer_address = ? " +
            " where id = ?;";

    private static final String SELECT_CUSTOMER_BY_ID = "SELECT * FROM customer join customer_type " +
            " on customer_type.customer_type_id = customer.customer_type_id" +
            " where customer_id = ?;";

    @Override
    public List<Customer> showList() {
        List<Customer> customersList = new ArrayList<>();
        try {
            Connection connectionSQL = new ConnectionSQL().getConnection();
            PreparedStatement statement = connectionSQL.prepareStatement(SELECT_ALL);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("customer_id");
                String name = resultSet.getString("customer_name");
                String birthday = resultSet.getString("customer_birthday");
                String gender = resultSet.getInt("customer_gender") + "";
                String idCard = resultSet.getString("customer_id_card");
                String phone = resultSet.getString("customer_phone");
                String email = resultSet.getString("customer_email");
                String address = resultSet.getString("customer_address");
                int customerTypeId = Integer.parseInt(resultSet.getString("customer_type_id"));
                String customerTypeName = resultSet.getString("customer_type_name");
                customersList.add(new Customer(id, name, birthday, gender, idCard, phone, address,
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
        try (Connection connection = new ConnectionSQL().getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_CUSTOMER)) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date date = simpleDateFormat.parse(customer.getCustomerBirthDay());
            preparedStatement.setString(1, String.valueOf(customer.getCustomerType().getCustomerTypeId()));
            preparedStatement.setString(2, customer.getCustomerName());
            preparedStatement.setDate(3, Date.valueOf(simpleDateFormat.format(date)));

            preparedStatement.setInt(4, Integer.parseInt(customer.getCustomerGender()));
            preparedStatement.setString(5, customer.getCustomerIdCard());
            preparedStatement.setString(6, customer.getCustomerPhone());
            preparedStatement.setString(7, customer.getCustomerAddress());

            System.out.println(preparedStatement);
            preparedStatement.executeUpdate();

        } catch (SQLException | ParseException throwables) {
            throwables.printStackTrace();
        } finally {
            ConnectionSQL.close();
        }
    }


    @Override
    public void delete(int id) {

    }

    @Override
    public boolean update(Customer customer) throws ParseException, SQLException {
        boolean rowUpdate = false;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date date = simpleDateFormat.parse(customer.getCustomerBirthDay());
        try (
        Connection connection = new ConnectionSQL().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_CUSTOMER)) {
            preparedStatement.setString(1, String.valueOf(customer.getCustomerType().getCustomerTypeId()));
            preparedStatement.setString(2, customer.getCustomerName());
            preparedStatement.setDate(3, Date.valueOf(simpleDateFormat.format(date)));
            preparedStatement.setInt(4, Integer.parseInt(customer.getCustomerGender()));
            preparedStatement.setString(5, customer.getCustomerIdCard());
            preparedStatement.setString(6, customer.getCustomerPhone());
            preparedStatement.setString(7, customer.getCustomerAddress());
//            System.out.println(preparedStatement);

            rowUpdate = preparedStatement.executeUpdate() > 0;
        } finally {
            ConnectionSQL.close();
        }
        return rowUpdate;
    }

    @Override
    public Customer findById(int id) {
//        List<Customer> customersList = new ArrayList<>();
        Customer customer = new Customer();
        try {
            Connection connectionSQL = new ConnectionSQL().getConnection();
            PreparedStatement statement = connectionSQL.prepareStatement(SELECT_CUSTOMER_BY_ID);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int id1 = resultSet.getInt("customer_id");
                String name = resultSet.getString("customer_name");
                String birthday = resultSet.getString("customer_birthday");
                String gender = resultSet.getInt("customer_gender") + "";
                String idCard = resultSet.getString("customer_id_card");
                String phone = resultSet.getString("customer_phone");
//                String email = resultSet.getString("customer_email");
                String address = resultSet.getString("customer_address");
                int customerTypeId = Integer.parseInt(resultSet.getString("customer_type_id"));
                String customerTypeName = resultSet.getString("customer_type_name");
              customer = new Customer(id1, name, birthday, gender, idCard, phone, address, new CustomerType(customerTypeId, customerTypeName));

            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            ConnectionSQL.close();
        }
        return customer;
    }

    @Override
    public List<CustomerType> showCustomerType() {
        List<CustomerType> customerTypeList = new ArrayList<>();

        try {
            Connection connectionSQL = new ConnectionSQL().getConnection();
            PreparedStatement statement = connectionSQL.prepareStatement(SELECT_CUSTOMER_TYPE);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int id = Integer.parseInt(resultSet.getString("customer_type_id"));
                String customerTypeName = resultSet.getString("customer_type_name");
                customerTypeList.add(new CustomerType(id, customerTypeName));
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            ConnectionSQL.close();
        }
        return customerTypeList;
    }


}
