package be.intecbrussel.classwerk4;

public class Rectangle {

        // properties
        private double width;
        private double length;
        private static int counter = 0;
        // constructors
        public Rectangle() {
        counter++;
        }

        public Rectangle(double width, double length) {
            this.width = width;
            this.length = length;
            counter++;
            messageCreation();
        }
        // getters and setters


    public static int getCounter() {
        return counter;
    }

    public double getWidth() {
            return width;
        }

        public void setWidth(double width) {
            if (width <= 0 || width == length) {
                System.out.println("This is not possible");
                System.exit(-1);
            } else {
                this.width = width;
            }

        }
        public double getLength() {
            return length;
        }
        public void setLength(double length) {
            if (length <= 0 || length == width) {
                System.out.println("This is not possible");
                System.exit(-1);
            } else {
                this.length = length;
            }
        }
        // eigen methods
        public void messageCreation() {
            System.out.println("Rectangle created");
        }
        public double getArea() {
            return length * width;
        }

        public static int counter() {
            return counter = counter;
        }

}
