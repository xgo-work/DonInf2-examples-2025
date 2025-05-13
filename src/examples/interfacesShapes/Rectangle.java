package examples.interfacesShapes;

public class Rectangle extends Shape{

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = height;
        this.height = width;
    }

    @Override
    public double area() {
        return this.height * this.width;
    }

    @Override
    public double perimeter() {
        return 2* this.height * this.width;
    }

    @Override
    public void display() {
        System.out.println(String.format("Rectangle: width = %f, height = %f area = %f", this.width, this.height, this.area()));
    }
}
