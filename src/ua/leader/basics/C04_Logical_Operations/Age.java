package ua.leader.basics.C04_Logical_Operations;

import java.util.Scanner;

public class Age {

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Asking for user input for age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Asking for user input to check if they have an ID (true/false)
        System.out.print("Do you have an ID? (true/false): ");
        boolean hasID = scanner.nextBoolean();

        // Using logical operators in conditional statements
        if (age >= 18 && hasID) {
            System.out.println("You are allowed to enter.");
        } else if (age < 18 && hasID) {
            System.out.println("You are not old enough to enter.");
        } else if (age >= 18 && !hasID) {
            System.out.println("You need an ID to enter.");
        } else {
            System.out.println("You are neither old enough nor do you have an ID.");
        }

        // Close the scanner object
        scanner.close();
    }
}

