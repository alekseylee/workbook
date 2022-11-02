package be.intecbrussel.classwerk14.interfacesDeel3Demo;

public interface Horn {

    default void makeSound(){
        System.out.println("Tuut Tuut!");
    }
}
