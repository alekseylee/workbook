package be.intecbrussel.classwerk14.oefening1;

public class Chest implements Interface{

private int id;

    public Chest(int id) {
        this.id = id;
    }


   public void lock(){
       System.out.println("Chest is locked");
   }

   public void unlock() {
       System.out.println("Chest is unlocked");
   }

    public void showInfo() {
    }
}







