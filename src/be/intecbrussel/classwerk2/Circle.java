package be.intecbrussel.classwerk2;

public class Circle {
    private double diameter;
    private double radius;


    public Circle() {
        messageCreation();
    }

    public Circle(double diameter) {
        this.diameter = diameter;
        messageCreation();
    }

// getters and setters

    public double getDiameter() {
        return diameter;
    }
    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

// eigen methods
    public void messageCreation() {
        System.out.println("Omtrek cirkel created");
    }
    public double getCircle() {
        return diameter * Math.PI;
    }
    public double getRadius() {
        return diameter / 2;
    }

    public double getAreaCircle() {
        double radius = diameter / 2;
        return ((radius * 2) * Math.PI);
    }

}

