public class StudentMain {
    public static void main(String[] args) {
        Student s = new Student("SV001", "Nguyen Van A", 20);
        System.out.println(s);
        System.out.println("Year of birth: " + s.getYearOfBirth());
        System.out.println("Uppercase name: " + s.getUpperName());
    }
}
