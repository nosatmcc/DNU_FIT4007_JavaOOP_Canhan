public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        StudentIT it = new StudentIT("IT01", "Sơn", 20, 8, 9);
        StudentBA ba = new StudentBA("BA01", "Linh", 21, 7, 8);
        StudentIT it2 = new StudentIT("IT02", "Hà", 22, 6, 7);

        manager.addStudent(it);
        manager.addStudent(ba);
        manager.addStudent(it2);

        System.out.println("=== All Students ===");
        manager.displayAllStudents();

        System.out.println("\n=== Sort by Age ===");
        manager.sortByAge();
        manager.displayAllStudents();

        System.out.println("\n=== Sort by Average Score ===");
        manager.sortByScore();
        manager.displayAllStudents();

        System.out.println("\n=== Find Student by ID (IT01) ===");
        System.out.println(manager.findStudent("IT01"));
    }
}
