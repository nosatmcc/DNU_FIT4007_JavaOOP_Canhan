import java.util.Scanner;
import java.time.Year;

public class Person {
    private String name;
    private int age;
    private String address;

    public Person() {}

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        name = sc.nextLine();
        System.out.print("Age: ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.print("Address: ");
        address = sc.nextLine();
    }

    public int getYearOfBirth() {
        return Year.now().getValue() - age;
    }

    public String getUpperName() {
        return name.toUpperCase();
    }

    public boolean checkAge(int n) {
        return age >= n;
    }

    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Address: " + address;
    }
}
