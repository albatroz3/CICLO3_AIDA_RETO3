package AIDACICLO3.Reto3.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "admin")
public class Admin implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdAdmin;
    private String email;
    private String name;
    private String password;

    public Integer getIdAdmin() {
        return IdAdmin;
    }

    public void setIdAdmin(Integer idAdmin) {
        IdAdmin = idAdmin;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
