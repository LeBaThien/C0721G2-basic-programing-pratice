package form_register.demo.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotEmpty(message = "Khong dc de trong")
    @Pattern(regexp = "^[a-zA-s]{5,}$",message = "toi thieu la 5 ky tu, va toi da la 45")
    @Size(min=5, max = 45, message = "5 den 45 ky tu")
    private String firstName;

    @NotEmpty(message = "Khong dc de trong")
    @Pattern(regexp = "^[a-zA-s]{5,}$", message = "toi thieu la 5 ky tu, va toi da la 45")
    @Size(min=5, max = 45, message = "5 den 45 ky tu")
    private String lastName;

    @NotEmpty(message = "Khong dc de trong")
//    @Size(min = 10, max =10, message = "so dien thoai gom 10 chu so")
    @Pattern(regexp = "^(0?)(3[2-9]|5[6|8|9]|7[0|6-9]|8[0-6|8|9]|9[0-4|6-9])[0-9]{7}$", message = "so dien gom 10 chu so, bat dau bang 0")
    private String number;

    @NotEmpty(message = "Khong dc de trong")
    @Min(value = 18, message = "tuoi phai >=18 va <=120")
    @Max(120)
    private String age;
//    neu dung kieu so thi phai la not null

    @NotEmpty(message = "Khong dc de trong")
    @Email
    private String email;

    public User(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
