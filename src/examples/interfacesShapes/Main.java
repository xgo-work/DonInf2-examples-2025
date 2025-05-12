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
        System.out.println("******************* end of example");

        List<ISurface> surfaces = new ArrayList<>();
        surfaces.add(new Circle(5));
        surfaces.add(new Rectangle(12, 3));
        surfaces.add(new Rectangle(2, 3));
        surfaces.add(new Circle(2));

        for (ISurface iSurface : surfaces) {
            System.out.println(iSurface.area());
        }

        System.out.println("*******************");

        // sort
        java.util.Collections.sort(surfaces);

        for (ISurface iSurface : surfaces) {
            System.out.println(iSurface.area());
        }

        // Step 1 Adapt the classes to fill this list with some rectangles and circles
        // you will have to adapt the classes

        // Step 2 implement the Comparable interface (compare by area)
        // Comparable is an existing interface in java

        // Step 3 sort the list of shapes using the Collections.sort() method

    }
}
