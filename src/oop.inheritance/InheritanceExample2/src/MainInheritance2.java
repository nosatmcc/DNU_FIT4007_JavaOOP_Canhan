public class MainInheritance2 {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        Cat c2 = new Cat();
        System.out.println("Cat 1:");
        c1.input();
        System.out.println("Cat 2:");
        c2.input();
        System.out.println(c1);
        System.out.println(c2);
        System.out.println("Year of birth of Cat 2: " + c2.getYearOfBirth());
        System.out.println("Same breed: " + c1.equalBreed(c2));
    }
}
