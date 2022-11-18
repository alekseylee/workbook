package be.intecbrussel.LambdaTest2;

public class ScoreInfo {

    public ScoreInfo (int score, Student student) {
        this.score = score;
        this.student = new Student();
    }

    public int score;
    public Student student;
}
