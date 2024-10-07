package ua.leader.basics.C08_Arrays;

public class IntArray {
    public static void main(String[] args) {
        // Initialize an array with 5 elements
        int[] numbers = {10, 20, 30, 40, 50};

        // Print the original array
        System.out.println("Original array:");
        printArray(numbers);

        // Accessing elements
        System.out.println("Element at index 2: " + numbers[2]); // Accessing the third element

        // Modifying an element
        numbers[2] = 35; // Changing the value at index 2
        System.out.println("Array after modifying index 2:");
        printArray(numbers);

        // Calculating the sum of the array elements
        int sum = calculateSum(numbers);
        System.out.println("Sum of the array elements: " + sum);

        // Calculating the average of the array elements
        double average = (double) sum / numbers.length;
        System.out.println("Average of the array elements: " + average);
    }

    // Method to print the array elements
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println(); // New line for better readability
    }

    // Method to calculate the sum of the array elements
    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }
}

