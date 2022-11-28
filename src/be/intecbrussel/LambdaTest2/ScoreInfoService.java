package be.intecbrussel.LambdaTest2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class ScoreInfoService {
    ScoreInfo[] scoreData;

    public ScoreInfoService() {
    }

    public void addScoreInfo(ScoreInfo[] scoreInfos) {

    }
    public void calculateAverageScore() {

        Arrays.stream(scoreData)
                .mapToInt(scoreInfo -> scoreInfo.score)
                .average()
                .ifPresent(avg -> System.out.println("Average score is: " +avg));


    }
    public Long filterScore() {
        Stream.of(scoreData)
                .filter(value -> value.score <= 90)
                .forEach(student -> System.out.println("You have mark A: " + student));
        return null;
    }

    public void printFailingStudents() {
        Comparator<Student> studentComparator =
                Comparator.comparing(Student::getName);
                Comparator.comparing(Student::getLastName);
        Arrays.stream(scoreData)
                .filter(value -> value.score < 60)
//                .sorted(Comparator.comparing(Student::getName).reversed())
//                .toArray(ScoreInfo[]::new)
                .forEach(student -> System.out.println("You have failed examen: "+ student.student.getName()));





    }
    private void getDataSortedByLastName() {
    }
    public void getDataSortedByScore(){
    }

    public long numberOfStudents;


}
