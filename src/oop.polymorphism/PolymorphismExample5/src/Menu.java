import java.util.Scanner;

public class Menu {
    private StudentManager manager = new StudentManager();
    private Scanner sc = new Scanner(System.in);

    public int choiceMenu() {
        System.out.println("\n===== MENU =====");
        System.out.println("1. Add Student");
        System.out.println("2. Show Students");
        System.out.println("3. Search by ID");
        System.out.println("4. Delete by ID");
        System.out.println("5. Sort Students");
        System.out.println("6. Exit");
        System.out.print("Your choice: ");
        return sc.nextInt();
    }

    public void run() {
        int choice;
        do {
            choice = choiceMenu();
            switch (choice) {
                case 1 -> addMenu();
                case 2 -> manager.showStudents();
                case 3 -> searchMenu();
                case 4 -> deleteMenu();
                case 5 -> sortMenu();
            }
        } while (choice != 6);
    }

    private void addMenu() {
        System.out.println("1. Add Student IT");
        System.out.println("2. Add Student BA");
        int ch = sc.nextInt();
        if (ch == 1) {
            StudentIT it = new StudentIT();
            it.input();
            manager.addStudent(it);
        } else if (ch == 2) {
            StudentBA ba = new StudentBA();
            ba.input();
            manager.addStudent(ba);
        }
    }

    private void searchMenu() {
        sc.nextLine();
        System.out.print("Enter ID to search: ");
        String id = sc.nextLine();
        Student s = manager.searchStudent(id);
        System.out.println(s != null ? s : "Not found");
    }

    private void deleteMenu() {
        sc.nextLine();
        System.out.print("Enter ID to delete: ");
        String id = sc.nextLine();
        manager.deleteStudent(id);
    }

    private void sortMenu() {
        manager.sortByScore();
        manager.showStudents();
    }

    public static void main(String[] args) {
        new Menu().run();
    }
}
