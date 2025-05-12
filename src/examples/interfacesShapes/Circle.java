package examples.interfacesShapes;

public class Circle extends Shape{

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return this.radius * 2 * Math.PI;
    }

    @Override
    public double perimeter() {
        return this.radius * this.radius * Math.PI;
    }

    @Override
    public void display() {
    }


}
