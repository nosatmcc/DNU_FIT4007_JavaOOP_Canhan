import java.util.Scanner;

public class StudentBA extends Student {
    private float scorePM;
    private float scoreBA;

    public StudentBA() {}

    public StudentBA(String id, String name, int age, float scorePM, float scoreBA) {
        super(id, name, age);
        this.scorePM = validate(scorePM);
        this.scoreBA = validate(scoreBA);
    }

    private float validate(float s) {
        return (s >= 0 && s <= 10) ? s : 0;
    }

    public float getScorePM() {
        return scorePM;
    }

    public void setScorePM(float scorePM) {
        this.scorePM = validate(scorePM);
    }

    public float getScoreBA() {
        return scoreBA;
    }

    public void setScoreBA(float scoreBA) {
        this.scoreBA = validate(scoreBA);
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.print("Enter score Project Management: ");
        scorePM = validate(sc.nextFloat());
        System.out.print("Enter score Business Analysis: ");
        scoreBA = validate(sc.nextFloat());
    }

    public float calculateAverage() {
        return (scorePM + scoreBA) / 2;
    }

    @Override
    public String toString() {
        return super.toString() + ", scorePM=" + scorePM + ", scoreBA=" + scoreBA +
                ", avg=" + calculateAverage();
    }

    @Override
    public StudentBA copyObject() {
        return new StudentBA(getStudentID(), getName(), getAge(), scorePM, scoreBA);
    }
}
