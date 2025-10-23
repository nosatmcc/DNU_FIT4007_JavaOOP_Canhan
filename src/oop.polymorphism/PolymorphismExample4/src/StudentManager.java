import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentManager {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
    }

    public void addStudent(ArrayList<Student> list) {
        students.addAll(list);
    }

    public void showStudents() {
        for (Student s : students) System.out.println(s);
    }

    public void deleteStudent(String id) {
        students.removeIf(s -> s.getStudentID().equals(id));
    }

    public void updateStudent(String id, Student newS) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentID().equals(id)) {
                students.set(i, newS);
                break;
            }
        }
    }

    public Student searchStudent(String id) {
        for (Student s : students)
            if (s.getStudentID().equals(id))
                return s;
        return null;
    }

    public void sortByScore() {
        Collections.sort(students, Comparator.comparingDouble(s -> {
            if (s instanceof StudentIT) return ((StudentIT) s).calculateAverage();
            else if (s instanceof StudentBA) return ((StudentBA) s).calculateAverage();
            else return 0.0;
        }));
    }

    public void sortByAge() {
        students.sort(Comparator.comparingInt(Student::getAge));
    }

    public void sortByID() {
        students.sort(Comparator.comparing(Student::getStudentID));
    }

    public void sortByType() {
        students.sort((a, b) -> {
            if (a instanceof StudentIT && b instanceof StudentBA) return -1;
            if (a instanceof StudentBA && b instanceof StudentIT) return 1;
            return 0;
        });
    }
}
