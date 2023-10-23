package User;

import java.util.Date;

public class RegistrationUser {

    private String name;
    private String email;
    private Date birth;
    private String password;

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