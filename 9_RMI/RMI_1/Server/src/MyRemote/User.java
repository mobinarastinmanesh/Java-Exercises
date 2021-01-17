package MyRemote;

import java.io.Serializable;

/**
 * Created by Asus on 11/28/2019.
 */
public class User implements Serializable {

    private String username;
    private String userpassword;

    public User() {}

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }
}
