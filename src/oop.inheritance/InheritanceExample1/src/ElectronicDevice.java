import java.util.Scanner;

public class ElectronicDevice {
    private String manufacturer;
    private long price;

    public ElectronicDevice() {}

    public ElectronicDevice(String manufacturer, long price) {
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Manufacturer: ");
        manufacturer = sc.nextLine();
        System.out.print("Price: ");
        price = sc.nextLong();
    }

    public String toString() {
        return "Manufacturer: " + manufacturer + ", Price: " + price;
    }
}
