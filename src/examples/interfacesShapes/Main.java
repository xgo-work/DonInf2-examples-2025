package examples.interfacesShapes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5, 3, 8, 1, 2);

        // perform a sorting operation
        java.util.Collections.sort(numbers);

        // Print the sorted array
        System.out.println("*** SORT NUMBERS ***");

        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println("");

        List<ISurface> surfaces = new ArrayList<>();

        // Step 1 Adapt the classes to fill this list with some rectangles and circles
        // Correction
        // A. Shape implements the ISurface interface
        // B. Circle and Rectangle extend Shape
        // C. implementation of the concrete methods area, perimeter and display in Circle and Rectangle
        // D. now we can add circles and rectangles objects to an ISurface list
        surfaces.add(new Circle(5));
        surfaces.add(new Rectangle(12, 3));
        surfaces.add(new Rectangle(2, 3));
        surfaces.add(new Circle(2));

        System.out.println("***** DISPLAY SHAPES *****");
        for (ISurface iSurface : surfaces) {
            iSurface.display();
        }

        // Step 2 implement the Comparable interface (compare by area)
        // Correction
        // A. The ISurface interface extends Comparable<ISurface>
        // B. this requires to implement a compareTo(ISurface other) method
        // it could be implemented in Circle and Rectangle but as we compare
        // by area and that all Shapes have an area we can directly implement
        // the compareTo method in our Shape class.

        // Step 3 sort the list of shapes using the Collections.sort() method
        // Correction
        // Now that our ISurfaces are comparable we can simply call the sort algorithm
        // provided by java util.
        java.util.Collections.sort(surfaces);

        System.out.println("** DISPLAY SORTED SHAPES **");
        for (ISurface iSurface : surfaces) {
            iSurface.display();
        }

    }
}
