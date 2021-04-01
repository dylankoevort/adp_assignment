package za.ac.cput.adp3_GitAssignment;

/**
 *      @author Dylan Koevort - 218088159
 *      Class that initialises a userPassword object
 */

public class UserPassword {
    private String username;
    private String password;

    public UserPassword(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserPassword{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
