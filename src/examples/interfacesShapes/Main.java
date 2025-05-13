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
        System.out.println("*** SORT NUMBERS EXAMPLE ***");

        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println("");

        List<ISurface> surfaces = new ArrayList<>();

        // Step 1 Adapt the classes to be able to fill this list with some rectangles and circles

        System.out.println("***** DISPLAY SHAPES *****");
        for (ISurface iSurface : surfaces) {
            iSurface.display();
        }

        // Step 2 implement the Comparable interface (compare by area) note that this interface exists in the java.lang package

        // Step 3 sort the list of shapes using the Collections.sort() method we want to sort the shapes by area

    }
}
