public class MainInheritance3 {
    public static void main(String[] args) {
        Student s = new Student();
        s.input();
        System.out.println(s);
        System.out.println("Enough 18 years: " + s.checkAge(18));
        System.out.println("Upper name: " + s.getUpperName());
        System.out.println("Valid student ID: " + s.checkStudentId());
    }
}
