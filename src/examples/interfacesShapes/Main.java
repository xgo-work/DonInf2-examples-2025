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
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        List<ISurface> shapes = new ArrayList<>();

        // Step 1 Adapt the classes to fill this list with some rectangles and circles
        // you will have to adapt the classes

        // Step 2 implement the Comparable interface (compare by area)

        // Step 3 sort the list of shapes using the Collections.sort() method

    }
}
