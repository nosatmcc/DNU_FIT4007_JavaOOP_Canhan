import java.util.Scanner;

public class Student extends Person {
    private String studentId;
    private String nameSchool;

    public Student() {}

    public Student(String name, int age, String address, String studentId, String nameSchool) {
        super(name, age, address);
        this.studentId = studentId;
        this.nameSchool = nameSchool;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getNameSchool() {
        return nameSchool;
    }

    public void setNameSchool(String nameSchool) {
        this.nameSchool = nameSchool;
    }

    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Student ID: ");
        studentId = sc.nextLine();
        System.out.print("School: ");
        nameSchool = sc.nextLine();
    }

    public boolean checkStudentId() {
        return studentId.startsWith("23IT");
    }

    public String toString() {
        return super.toString() + ", Student ID: " + studentId + ", School: " + nameSchool;
    }
}
