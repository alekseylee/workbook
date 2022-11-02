package be.intecbrussel.classwerk14.oefening1;

public class MainApp {
    public static void main(String[] args) {

        Chest chest01 = new Chest(1);
        chest01.lock();
        chest01.showInfo();

        chest01.unlock();
        chest01.showInfo();
    }
}
