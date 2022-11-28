package be.intecbrussel.MapDemo.students;

import java.util.*;

public class StudentApp {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Bob", "JAVA"));
        students.add(new Student("John", "JAVA"));
        students.add(new Student("Robert", "JAVA"));
        students.add(new Student("Luc", "C#"));
        students.add(new Student("Claude", "C#"));
        students.add(new Student("Julien", "SUPPORT"));
        students.add(new Student("Marie-Jeanne", "C#"));

        students.forEach(student -> System.out.println(student.getCourse()));
        for (Student student : students) {
            System.out.println(student.getName() + " follows " + student.getCourse());

        }
        Collections.sort(students, (students1, students2) -> students1.getName().compareTo(students2.getName()));
//        System.out.println(students);

//        System.out.println(students.get(4));

        Map<String, Student> studentMap = new HashMap<>();
        studentMap.put("Bob", new Student("Bob", "JAVA"));
        studentMap.put("John", new Student("John", "JAVA"));
        studentMap.put("Robert", new Student("Robert", "JAVA"));
        studentMap.put("Luc", new Student("Luc", "C#"));
        studentMap.put("Claude", new Student("Claude", "C#"));
        studentMap.put("Julien", new Student("Julien", "SUPPORT"));
        studentMap.put("Marie-Jeanne", new Student("Marie-Jeanne", "C#"));

//        System.out.println(studentMap);
//        System.out.println(studentMap.get("Luc"));

//        studentMap.forEach((name, student) -> System.out.println(name + " follows " + student.getCourse()));
//        for (String name : studentMap.keySet()) {
//            System.out.println(name);
//        }
//        for (Student student : studentMap.values()) {
//            System.out.println(student);
//        }

        for (Map.Entry<String, Student> stringStudentEntry : studentMap.entrySet()) {
//            System.out.println(stringStudentEntry.getKey() + " = " + stringStudentEntry.getValue().getCourse());
        }

        boolean isLucHere = studentMap.containsKey("Luc");
        studentMap.replace("dsadsad", new Student("21312jjj", "jjppp"));
        System.out.println(studentMap);
//        System.out.println(isLucHere);


    }
}
