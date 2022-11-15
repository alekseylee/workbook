package be.intecbrussel.LambdaOefening.Opdracht2;

public class MainApp {
    public static void main(String[] args) {
        User user1 = new User(17);
        User user2 = new User(19);

        AgeChecker ageChecker = (User c) -> {

            if (c.getAge() <= 17) {
                System.out.println("How old are you?");
                System.out.println(user1.getAge());
                System.out.println("You are so young");
                return true;
            } else if (c.getAge() >= 18) {
                System.out.println("How old are you?");
                System.out.println(user2.getAge());
                System.out.println("You are so old");
                return true;
            }
            return false;
        };

        ageChecker.checkAge(user1);
        ageChecker.checkAge(user2);


    }
}
