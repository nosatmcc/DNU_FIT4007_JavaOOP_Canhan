import pA.B;
import pB.C;

public class MainEncapsulation3 {
    public static void main(String[] args) {
        B bObj = new B();
        bObj.display();

        C cObj = new C(5);
        cObj.displaySquare();
    }
}
