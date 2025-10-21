public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student(); // default
        s1.setMasv("SV001");
        s1.setName("Alice");
        s1.setAge(20);

        Student s2 = new Student("SV002", "Bob", 21); // parameterized

        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
}
