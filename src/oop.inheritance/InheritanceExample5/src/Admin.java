import java.util.ArrayList;
import java.util.Scanner;

public class Admin extends User {
    private ArrayList<String> permissions = new ArrayList<>();

    public Admin() {}

    public Admin(String userId, String username, String password, String email, ArrayList<String> permissions) {
        super(userId, username, password, email);
        this.permissions = permissions;
    }

    public ArrayList<String> getPermissions() {
        return permissions;
    }

    public void setPermissions(ArrayList<String> permissions) {
        this.permissions = permissions;
    }

    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of permissions: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("Permission " + (i + 1) + ": ");
            permissions.add(sc.nextLine());
        }
    }

    public String toString() {
        return super.toString() + ", Permissions: " + permissions;
    }
}
