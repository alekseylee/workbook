package be.intecbrussel.LambdaTest2;

public class ScoreInfo {

    public ScoreInfo (int score, Student student) {
        this.score = score;
        this.student = student;
    }

    public int score;
    public Student student;

    @Override
    public String toString() {
        return "ScoreInfo{" +
                "score=" + score +
                ", student=" + student +
                '}';
    }
}
