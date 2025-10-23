import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainInheritance5 {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Add User");
            System.out.println("2. Show All Users");
            System.out.println("3. Sort Users (Admins first)");
            System.out.println("4. Login");
            System.out.println("0. Exit");
            System.out.print("Choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("1. Add Customer");
                    System.out.println("2. Add Admin");
                    int type = sc.nextInt();
                    sc.nextLine();
                    if (type == 1) {
                        Customer c = new Customer();
                        c.input();
                        users.add(c);
                    } else if (type == 2) {
                        Admin a = new Admin();
                        a.input();
                        users.add(a);
                    }
                    break;
                case 2:
                    for (User u : users) System.out.println(u);
                    break;
                case 3:
                    Collections.sort(users, new Comparator<User>() {
                        public int compare(User u1, User u2) {
                            if (u1 instanceof Admin && u2 instanceof Customer) return -1;
                            if (u1 instanceof Customer && u2 instanceof Admin) return 1;
                            return 0;
                        }
                    });
                    break;
                case 4:
                    System.out.print("Username: ");
                    String username = sc.nextLine();
                    System.out.print("Password: ");
                    String password = sc.nextLine();
                    boolean found = false;
                    for (User u : users) {
                        if (u.getUsername().equals(username) && u.getPassword().equals(password)) {
                            System.out.println("Logged in as: " + u);
                            found = true;
                            break;
                        }
                    }
                    if (!found) System.out.println("Invalid credentials");
                    break;
            }
        } while (choice != 0);
    }
}
