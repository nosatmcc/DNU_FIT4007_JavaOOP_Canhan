import java.util.ArrayList;
import java.util.Scanner;

public class MainExample5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();
        int choice;

        do {
            System.out.println("\n===== STUDENT MANAGEMENT MENU =====");
            System.out.println("1. Display all students");
            System.out.println("2. Add student");
            System.out.println("3. Find student");
            System.out.println("4. Remove student");
            System.out.println("5. Sort students");
            System.out.println("6. Edit student info");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    manager.displayAllStudents();
                    break;
                case 2:
                    System.out.println("2.1. Add IT student");
                    System.out.println("2.2. Add BA student");
                    System.out.print("Select type: ");
                    int type = sc.nextInt();
                    sc.nextLine();
                    if (type == 1) {
                        StudentIT it = new StudentIT();
                        it.input();
                        manager.addStudent(it);
                    } else if (type == 2) {
                        StudentBA ba = new StudentBA();
                        ba.input();
                        manager.addStudent(ba);
                    } else {
                        System.out.println("Invalid choice.");
                    }
                    break;
                case 3:
                    System.out.println("3.1. Find by ID");
                    System.out.println("3.2. Find by age");
                    System.out.print("Select type: ");
                    int findType = sc.nextInt();
                    sc.nextLine();
                    if (findType == 1) {
                        System.out.print("Enter Student ID: ");
                        String id = sc.nextLine();
                        Student s = manager.findStudent(id);
                        System.out.println(s == null ? "Not found" : s);
                    } else if (findType == 2) {
                        System.out.print("Enter age: ");
                        int age = sc.nextInt();
                        ArrayList<Student> found = manager.findStudent(age);
                        if (found.isEmpty()) {
                            System.out.println("No students found.");
                        } else {
                            for (Student st : found) {
                                System.out.println(st);
                            }
                        }
                    }
                    break;
                case 4:
                    System.out.print("Enter ID to remove: ");
                    String idRemove = sc.nextLine();
                    manager.removeStudent(idRemove);
                    System.out.println("Removed successfully (if existed).");
                    break;
                case 5:
                    System.out.println("5.1. Sort by age");
                    System.out.println("5.2. Sort by average score");
                    System.out.print("Select type: ");
                    int sortType = sc.nextInt();
                    sc.nextLine();
                    if (sortType == 1) {
                        manager.sortByAge();
                    } else if (sortType == 2) {
                        manager.sortByScore();
                    } else {
                        System.out.println("Invalid choice.");
                    }
                    break;
                case 6:
                    System.out.print("Enter ID to edit: ");
                    String idEdit = sc.nextLine();
                    Student old = manager.findStudent(idEdit);
                    if (old == null) {
                        System.out.println("Student not found!");
                    } else {
                        System.out.println("Select new type (1-IT, 2-BA): ");
                        int newType = sc.nextInt();
                        sc.nextLine();
                        Student newStudent;
                        if (newType == 1) {
                            newStudent = new StudentIT();
                        } else {
                            newStudent = new StudentBA();
                        }
                        newStudent.input();
                        manager.editStudent(idEdit, newStudent);
                    }
                    break;
                case 7:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        } while (choice != 7);
    }
}
