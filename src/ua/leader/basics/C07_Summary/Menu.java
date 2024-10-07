package ua.leader.basics.C07_Summary;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Displaying the console menu
            System.out.println("Console Menu:");
            System.out.println("1. Option 1: Say Hello");
            System.out.println("2. Option 2: Add two numbers");
            System.out.println("3. Option 3: Display current time");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            // Handling the user's choice
            switch (choice) {
                case 1:
                    System.out.println("Hello, User!");
                    break;

                case 2:
                    System.out.print("Enter the first number: ");
                    int num1 = scanner.nextInt();
                    System.out.print("Enter the second number: ");
                    int num2 = scanner.nextInt();
                    System.out.println("The sum is: " + (num1 + num2));
                    break;

                case 3:
                    System.out.println("Current system time: " + java.time.LocalTime.now());
                    break;

                case 0:
                    System.out.println("Exiting the program...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

            System.out.println();  // For a blank line between iterations
        } while (choice != 0);  // Loop continues until the user enters 0

        scanner.close();
    }
}
