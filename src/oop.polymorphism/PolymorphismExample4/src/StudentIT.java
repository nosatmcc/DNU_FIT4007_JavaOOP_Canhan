import java.util.Scanner;

public class StudentIT extends Student {
    private float scoreCPP;
    private float scoreJava;

    public StudentIT() {}

    public StudentIT(String id, String name, int age, float scoreCPP, float scoreJava) {
        super(id, name, age);
        this.scoreCPP = validate(scoreCPP);
        this.scoreJava = validate(scoreJava);
    }

    private float validate(float s) {
        return (s >= 0 && s <= 10) ? s : 0;
    }

    public float getScoreCPP() {
        return scoreCPP;
    }

    public void setScoreCPP(float scoreCPP) {
        this.scoreCPP = validate(scoreCPP);
    }

    public float getScoreJava() {
        return scoreJava;
    }

    public void setScoreJava(float scoreJava) {
        this.scoreJava = validate(scoreJava);
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.print("Enter score CPP: ");
        scoreCPP = validate(sc.nextFloat());
        System.out.print("Enter score Java: ");
        scoreJava = validate(sc.nextFloat());
    }

    public float calculateAverage() {
        return (scoreCPP + scoreJava) / 2;
    }

    @Override
    public String toString() {
        return super.toString() + ", scoreCPP=" + scoreCPP + ", scoreJava=" + scoreJava +
                ", avg=" + calculateAverage();
    }

    @Override
    public StudentIT copyObject() {
        return new StudentIT(getStudentID(), getName(), getAge(), scoreCPP, scoreJava);
    }
}
