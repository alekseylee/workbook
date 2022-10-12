package be.intecbrussel.classwerk;

public class SummaryRectangle {

    // properties
    private double width;
    private double length;
    // constructors
    public SummaryRectangle() {
        messageCreation();
    }
    public SummaryRectangle(double width) {
        this.width = width;
    }
    public SummaryRectangle(double width, double length) {
        this.width = width;
        this.length = length;
        messageCreation();
    }
    // getters and setters
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    // eigen methods
    public void messageCreation() {
        System.out.println("Rectangle created");
    }
    public double getArea() {
        return length * width;
    }
    public int getArea(int width, int length) {
        return length * width;
    }
    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}