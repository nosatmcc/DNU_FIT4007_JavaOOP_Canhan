public class Main4 {
    public static void main(String[] args) {
        StudentManager sm = new StudentManager();

        sm.addStudent(new StudentIT("IT01", "Alice", 20, 8, 9));
        sm.addStudent(new StudentBA("BA01", "Bob", 21, 7, 8));
        sm.addStudent(new StudentIT("IT02", "Charlie", 19, 9, 9));

        System.out.println("Before sort:");
        sm.showStudents();

        sm.sortByScore();
        System.out.println("\nAfter sort by score:");
        sm.showStudents();
    }
}
