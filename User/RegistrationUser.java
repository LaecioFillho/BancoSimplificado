package User;

import java.util.Date;
import java.util.UUID;
import ConnectionBD.DAO;

public class RegistrationUser {

    private UUID id;
    private String name;
    private String email;
    private Date birth;
    private String password;

    public RegistrationUser(String name, String email, Date birth, String password){

        this.name = name;
        this.email = email;
        this.birth = birth;
        this.password = password;

        new DAO().registrationUsers(this.name, this.email, this.password);

    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setbirth(Date birth) {
        this.birth = birth;
    }

    public Date getbirth() {
        return birth;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }


}