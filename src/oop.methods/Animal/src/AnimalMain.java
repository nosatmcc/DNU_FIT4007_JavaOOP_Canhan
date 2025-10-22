public class AnimalMain {
    public static void main(String[] args) {
        Animal a = new Animal("Dog", 5);
        System.out.println(a);
        a.makeSound();
        System.out.println("Human age equivalent: " + a.getHumanAgeEquivalent());
    }
}
