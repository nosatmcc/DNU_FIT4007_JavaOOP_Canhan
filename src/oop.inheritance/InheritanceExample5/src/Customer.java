import java.util.Scanner;

public class Customer extends User {
    private String shippingAddress;

    public Customer() {}

    public Customer(String userId, String username, String password, String email, String shippingAddress) {
        super(userId, username, password, email);
        this.shippingAddress = shippingAddress;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Shipping Address: ");
        shippingAddress = sc.nextLine();
    }

    public String toString() {
        return super.toString() + ", Shipping Address: " + shippingAddress;
    }
}
