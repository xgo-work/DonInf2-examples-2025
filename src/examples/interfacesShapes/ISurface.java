package examples.interfacesShapes;

public interface ISurface extends Comparable<ISurface> {
    double area();
    double perimeter();
    void display();
}
