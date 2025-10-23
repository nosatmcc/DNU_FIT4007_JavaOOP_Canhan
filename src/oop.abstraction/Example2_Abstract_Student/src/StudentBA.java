import java.util.Scanner;

public class StudentBA extends Student {
    private float scorePm;
    private float scoreBA;

    public StudentBA() {}

    public StudentBA(String masv, String name, int age, float scorePm, float scoreBA) {
        super(masv, name, age);
        this.scorePm = validScore(scorePm);
        this.scoreBA = validScore(scoreBA);
    }

    public float getScorePm() {
        return scorePm;
    }

    public void setScorePm(float scorePm) {
        this.scorePm = validScore(scorePm);
    }

    public float getScoreBA() {
        return scoreBA;
    }

    public void setScoreBA(float scoreBA) {
        this.scoreBA = validScore(scoreBA);
    }

    private float validScore(float score) {
        return (score >= 0 && score <= 10) ? score : 0;
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập điểm Quản lý dự án: ");
        scorePm = validScore(sc.nextFloat());
        System.out.print("Nhập điểm Phân tích kinh doanh: ");
        scoreBA = validScore(sc.nextFloat());
    }

    @Override
    public float calculateAverage() {
        return (scorePm + scoreBA) / 2;
    }

    @Override
    public String toString() {
        return "StudentBA [Mã SV=" + masv + ", Tên=" + name + ", Tuổi=" + age +
                ", QLDA=" + scorePm + ", PTKD=" + scoreBA +
                ", TB=" + calculateAverage() + "]";
    }
}
