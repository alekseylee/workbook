package be.intecbrussel.classwerk3;

public class Square {
    private double side;

    public Square() {
        messageCreation();
    }
    public Square(double side) {
        this.side = side;
    }

// getters and setters

    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    }


    // eigen methods
    public void messageCreation() {
        System.out.println("Square created");
    }

    public double getPerimetr() {
        return side * 4;
    }
    public double getArea() {
        return side * side;
    }
}





