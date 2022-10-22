package be.intecbrussel.classwerk11.inheritance2;

public class MainApp {
    public static void main(String[] args) {

        Doctor doctor = new Doctor("John", 50, "Therapist");
        Worker worker = new Worker("William", 40, "Electrician");
        Student student = new Student("Terry", 20, "Intec Student");
        Teacher teacher = new Teacher("Barry", 35, "Intec teacher");

        System.out.println("Name of person: " + doctor.getName());
        System.out.println("Profession of person: " + doctor.getProfession());
        System.out.println("Age of person: " + doctor.getAge());
        System.out.println();
        doctor.eat();
        doctor.sleep();
        doctor.work();
        System.out.println();

        System.out.println("Name of person: " + worker.getName());
        System.out.println("Profession of person: " + worker.getProfession());
        System.out.println("Age of person: " + worker.getAge());
        System.out.println();
        worker.eat();
        worker.sleep();
        worker.work();

    }
}
