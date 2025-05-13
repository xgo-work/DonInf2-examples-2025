package examples.interfacesShapes;

public class Circle{

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void display() {
        System.out.println(String.format("Circle: radius = %f", this.radius));
    }

}
