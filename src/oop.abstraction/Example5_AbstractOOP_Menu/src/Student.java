import java.util.Scanner;

public abstract class Student {
    protected String masv;
    protected String name;
    protected int age;

    public Student() {}

    public Student(String masv, String name, int age) {
        this.masv = masv;
        this.name = name;
        this.age = age;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
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

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student ID: ");
        masv = sc.nextLine();
        System.out.print("Enter Student Name: ");
        name = sc.nextLine();
        System.out.print("Enter Student Age: ");
        age = sc.nextInt();
        sc.nextLine();
    }

    public abstract float calculateAverage();
    public abstract String toString();
}
