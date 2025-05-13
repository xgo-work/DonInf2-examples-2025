package examples.interfacesShapes;

public class Rectangle {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = height;
        this.height = width;
    }

    public void display() {
        System.out.println(String.format("Rectangle: width = %f, height = %f", this.width, this.height));
    }
}
