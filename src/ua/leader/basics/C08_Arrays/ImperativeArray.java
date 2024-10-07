package ua.leader.basics.C08_Arrays;

public class ImperativeArray {
    public static void main(String[] args) {
        // Initialize an array of integers
        int[] numbersArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Variable to hold the sum of squares
        int sumOfSquares = 0;

        // Loop through the array
        for (int num : numbersArray) {
            // Check if the number is even
            if (num % 2 == 0) {
                // Square the number and add to the sum
                sumOfSquares += num * num;
            }
        }

        // Print the result
        System.out.println("Sum of squares of even numbers: " + sumOfSquares);
    }
}

