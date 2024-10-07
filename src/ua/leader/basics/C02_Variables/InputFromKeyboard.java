package ua.leader.basics.C02_Variables;

import java.util.Scanner;

public class InputFromKeyboard {


    /*
     Enter an integer: 5
     Enter a float: 5.5
     Enter a double: 10.5
     Enter a byte: 20
     Enter a short: 300
     Enter a long: 10000
     Enter a boolean (true/false): true
     Enter a single character: A
     Enter a String: Hello World
     */
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Reading an integer
        System.out.print("Enter an integer: ");
        int intValue = scanner.nextInt();

        // Reading a float
        System.out.print("Enter a float: ");
        float floatValue = scanner.nextFloat();

        // Reading a double
        System.out.print("Enter a double: ");
        double doubleValue = scanner.nextDouble();

        // Reading a byte
        System.out.print("Enter a byte: ");
        byte byteValue = scanner.nextByte();

        // Reading a short
        System.out.print("Enter a short: ");
        short shortValue = scanner.nextShort();

        // Reading a long
        System.out.print("Enter a long: ");
        long longValue = scanner.nextLong();

        // Reading a boolean
        System.out.print("Enter a boolean (true/false): ");
        boolean booleanValue = scanner.nextBoolean();

        // Reading a char (Since Scanner doesn't directly read a single character, use charAt)
        System.out.print("Enter a single character: ");
        char charValue = scanner.next().charAt(0);

        // Reading a String
        System.out.print("Enter a String: ");
        scanner.nextLine(); // consume the remaining newline character
        String stringValue = scanner.nextLine();

        // Displaying the input values
        System.out.println("\nYou entered the following values:");
        System.out.println("Integer: " + intValue);
        System.out.println("Float: " + floatValue);
        System.out.println("Double: " + doubleValue);
        System.out.println("Byte: " + byteValue);
        System.out.println("Short: " + shortValue);
        System.out.println("Long: " + longValue);
        System.out.println("Boolean: " + booleanValue);
        System.out.println("Character: " + charValue);
        System.out.println("String: " + stringValue);

        // Close the scanner object
        scanner.close();
    }
}

