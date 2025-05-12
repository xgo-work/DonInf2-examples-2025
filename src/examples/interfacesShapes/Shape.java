package examples.interfacesShapes;

public abstract class Shape implements ISurface {
    // Abstract method to calculate the area of the shape
    public abstract double area();

    // Abstract method to calculate the perimeter of the shape
    public abstract double perimeter();

    // display the shape's information
    public abstract void display();

    public int compareTo(ISurface other) {
        if(this.area() > other.area()){
            return 1;
        }else if(this.area() < other.area()){
            return -1;
        }else {
            return 0;
        }

    }

}