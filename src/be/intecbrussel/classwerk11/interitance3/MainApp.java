package be.intecbrussel.classwerk11.interitance3;

public class MainApp {
    public static void main(String[] args) {

        Person doctor = new Doctor("Bob", "Brussel", "Doctor", 46);
        Person student = new Student("Brain", "Paris", "Student", 20);
        Person worker = new Worker("Steven", "Brugge", "Worker", 40);
        Person teacher = new Teacher("Paul", "Antwerpen", "Teacher", 46);

        info(doctor);
        info(student);
        info(worker);
        info(teacher);

    }
    public static void info(Person person){
//        if (person.equals() {
//            System.out.println("doctor of the same age as the student - " + ageCompare);
//        } else if (person.equals(Worker)) {
//            System.out.println("doctor of the same age as the worker - " + ageCompare);
//        } else if (Person.equals(Teacher)) {
//            System.out.println("doctor of the same age as the teacher - " + ageCompare);
//        }
        System.out.println(person.toString());

    }


}
