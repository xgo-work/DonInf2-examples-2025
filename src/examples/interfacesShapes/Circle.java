package examples.interfacesShapes;

public class Circle extends Shape{

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return this.radius * this.radius * Math.PI;
    }

    @Override
    public double perimeter() {
        return 2 * this.radius * Math.PI;
    }

    @Override
    public void display() {
        System.out.println(String.format("Circle: radius = %f area = %f", this.radius, this.area()));
    }


}
