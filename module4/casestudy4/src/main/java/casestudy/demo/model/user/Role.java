package casestudy.demo.model.user;


import javax.persistence.*;
import java.util.List;

@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private int role_id;
    private String role_name;

//    (fetch = FetchType.EAGER)
//    Khử đệ quy
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name="user_role", joinColumns= @JoinColumn(name="role_id"), inverseJoinColumns = @JoinColumn(name="user_id"))
    private List<User> users;

    public Role(){

    }

    public int getRole_id() {
        return role_id;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }
}
