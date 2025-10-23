import java.util.ArrayList;

public class MainExample4 {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        // Add demo students
        StudentIT it1 = new StudentIT("SV001", "Alice", 20, 8.5f, 9.0f);
        StudentBA ba1 = new StudentBA("SV002", "Bob", 22, 7.5f, 8.0f);
        StudentIT it2 = new StudentIT("SV003", "Charlie", 19, 6.0f, 7.0f);

        manager.addStudent(it1);
        manager.addStudent(ba1);
        manager.addStudent(it2);

        System.out.println("All students:");
        manager.displayAllStudents();

        System.out.println("\nSorted by score:");
        manager.sortByScore();
        manager.displayAllStudents();

        System.out.println("\nFind student by ID 'SV002':");
        System.out.println(manager.findStudent("SV002"));

        System.out.println("\nFind students aged 20:");
        ArrayList<Student> list = manager.findStudent(20);
        for (Student s : list) {
            System.out.println(s);
        }

        System.out.println("\nRemove student SV001:");
        manager.removeStudent("SV001");
        manager.displayAllStudents();
    }
}
