package casestudy.demo.model.user;

import casestudy.demo.model.employee.Employee;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int user_id;
    private String password;
//    mapped voi list ben kia
    @OneToMany(mappedBy = "user")
    private List<Employee> employees;

    @ManyToMany(mappedBy = "users")
    private List<Role> roles;

    public User(){

    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
