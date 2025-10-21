public class AnimalMain {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.setName("Cat");
        a1.setColor("Black");
        a1.setAge(3);

        Animal a2 = new Animal("Dog", "Brown", 5);

        System.out.println(a1.toString());
        System.out.println(a2.toString());
    }
}
