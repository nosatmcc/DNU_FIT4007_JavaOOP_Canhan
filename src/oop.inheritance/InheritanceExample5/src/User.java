import java.util.Scanner;

public class User {
    private String userId;
    private String username;
    private String password;
    private String email;

    public User() {}

    public User(String userId, String username, String password, String email) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("User ID: ");
        userId = sc.nextLine();
        System.out.print("Username: ");
        username = sc.nextLine();
        System.out.print("Password: ");
        password = sc.nextLine();
        System.out.print("Email: ");
        email = sc.nextLine();
    }

    public String toString() {
        return "UserID: " + userId + ", Username: " + username + ", Email: " + email;
    }
}
