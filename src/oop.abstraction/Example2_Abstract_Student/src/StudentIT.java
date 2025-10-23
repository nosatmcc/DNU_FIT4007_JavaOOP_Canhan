import java.util.Scanner;

public class StudentIT extends Student {
    private float scoreCpp;
    private float scoreJava;

    public StudentIT() {}

    public StudentIT(String masv, String name, int age, float scoreCpp, float scoreJava) {
        super(masv, name, age);
        this.scoreCpp = validScore(scoreCpp);
        this.scoreJava = validScore(scoreJava);
    }

    public float getScoreCpp() {
        return scoreCpp;
    }

    public void setScoreCpp(float scoreCpp) {
        this.scoreCpp = validScore(scoreCpp);
    }

    public float getScoreJava() {
        return scoreJava;
    }

    public void setScoreJava(float scoreJava) {
        this.scoreJava = validScore(scoreJava);
    }

    private float validScore(float score) {
        return (score >= 0 && score <= 10) ? score : 0;
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập điểm C++: ");
        scoreCpp = validScore(sc.nextFloat());
        System.out.print("Nhập điểm Java: ");
        scoreJava = validScore(sc.nextFloat());
    }

    @Override
    public float calculateAverage() {
        return (scoreCpp + scoreJava) / 2;
    }

    @Override
    public String toString() {
        return "StudentIT [Mã SV=" + masv + ", Tên=" + name + ", Tuổi=" + age +
                ", C++=" + scoreCpp + ", Java=" + scoreJava +
                ", TB=" + calculateAverage() + "]";
    }
}
