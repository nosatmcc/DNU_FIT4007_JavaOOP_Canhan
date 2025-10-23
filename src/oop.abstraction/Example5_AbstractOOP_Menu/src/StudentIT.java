import java.util.Scanner;

public class StudentIT extends Student {
    private float scoreCpp;
    private float scoreJava;

    public StudentIT() {}

    public StudentIT(String masv, String name, int age, float scoreCpp, float scoreJava) {
        super(masv, name, age);
        this.scoreCpp = scoreCpp;
        this.scoreJava = scoreJava;
    }

    public float getScoreCpp() {
        return scoreCpp;
    }

    public void setScoreCpp(float scoreCpp) {
        this.scoreCpp = scoreCpp;
    }

    public float getScoreJava() {
        return scoreJava;
    }

    public void setScoreJava(float scoreJava) {
        this.scoreJava = scoreJava;
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter C++ score: ");
        scoreCpp = sc.nextFloat();
        System.out.print("Enter Java score: ");
        scoreJava = sc.nextFloat();
        sc.nextLine();
    }

    @Override
    public float calculateAverage() {
        return (scoreCpp + scoreJava) / 2;
    }

    @Override
    public String toString() {
        return "StudentIT{" +
                "masv='" + masv + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", scoreCpp=" + scoreCpp +
                ", scoreJava=" + scoreJava +
                ", avg=" + calculateAverage() +
                '}';
    }
}
