package examples.interfacesShapes;

public abstract class Shape implements ISurface {

    // compute the area of the shape
    public abstract double area();

    // compute the perimeter of the shape
    public abstract double perimeter();

    // display the shape's information
    public abstract void display();

    public int compareTo(ISurface other) {
        // if this shape has a larger area than the other shape, return 1
        // else if this shape has a smaller area than the other shape, return -1
        // else both shapes have the same area, return 0
        if(this.area() > other.area()){
            return 1;
        }else if(this.area() < other.area()){
            return -1;
        }else {
            return 0;
        }
    }

}