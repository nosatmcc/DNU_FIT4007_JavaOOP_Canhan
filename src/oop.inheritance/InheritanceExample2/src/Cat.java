import java.util.Scanner;

public class Cat extends Animal {
    private String color;
    private String breed;

    public Cat() {}

    public Cat(String name, int age, String color, String breed) {
        super(name, age);
        this.color = color;
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Color: ");
        color = sc.nextLine();
        System.out.print("Breed: ");
        breed = sc.nextLine();
    }

    public boolean equalBreed(Cat c) {
        return this.breed.equalsIgnoreCase(c.getBreed());
    }

    public String toString() {
        return super.toString() + ", Color: " + color + ", Breed: " + breed;
    }
}
