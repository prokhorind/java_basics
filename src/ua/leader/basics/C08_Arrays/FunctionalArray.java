package ua.leader.basics.C08_Arrays;

import java.util.Arrays;
import java.util.List;

public class FunctionalArray {
    public static void main(String[] args) {
        // Initialize an array of integers
        Integer[] numbersArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Convert the array to a List for functional operations
        List<Integer> numbers = Arrays.asList(numbersArray);

        // Functional approach: Filtering, mapping, and reducing
        int sumOfSquares = numbers.stream()
                .filter(num -> num % 2 == 0) // Keep only even numbers
                .map(num -> num * num) // Square the numbers
                .reduce(0, Integer::sum); // Sum up the squares

        // Print the result
        System.out.println("Sum of squares of even numbers: " + sumOfSquares);
    }
}

