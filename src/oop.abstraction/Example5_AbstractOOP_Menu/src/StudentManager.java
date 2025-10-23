import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentManager implements IManager {
    private ArrayList<Student> students;

    public StudentManager() {
        students = new ArrayList<>();
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    @Override
    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public void editStudent(String masv, Student student) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getMasv().equalsIgnoreCase(masv)) {
                students.set(i, student);
                return;
            }
        }
        System.out.println("Student with ID " + masv + " not found.");
    }

    @Override
    public void removeStudent(String masv) {
        students.removeIf(s -> s.getMasv().equalsIgnoreCase(masv));
    }

    @Override
    public Student findStudent(String masv) {
        for (Student s : students) {
            if (s.getMasv().equalsIgnoreCase(masv)) {
                return s;
            }
        }
        return null;
    }

    @Override
    public void sortByAge() {
        Collections.sort(students, Comparator.comparingInt(Student::getAge));
    }

    @Override
    public void sortByScore() {
        Collections.sort(students, Comparator.comparingDouble(Student::calculateAverage));
    }

    @Override
    public ArrayList<Student> findStudent(int age) {
        ArrayList<Student> result = new ArrayList<>();
        for (Student s : students) {
            if (s.getAge() == age) {
                result.add(s);
            }
        }
        return result;
    }

    @Override
    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students in the list.");
        } else {
            for (Student s : students) {
                System.out.println(s);
            }
        }
    }
}
