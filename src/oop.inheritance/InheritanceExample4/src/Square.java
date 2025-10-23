import java.util.Scanner;

public class Square extends Rectangle {
    public Square() {}

    public Square(float side) {
        super(side, side);
    }

    public void setSide(float side) {
        setWidth(side);
        setHeight(side);
    }

    public float getSide() {
        return getWidth();
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Side: ");
        float side = sc.nextFloat();
        setSide(side);
    }

    public String toString() {
        return "Side: " + getSide();
    }
}
