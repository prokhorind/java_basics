package ua.leader.basics.C08_Arrays;

public class CharArray {
    public static void main(String[] args) {
        // Initialize a char array with some letters
        char[] letters = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd'};

        // Print the original char array
        System.out.println("Original char array:");
        printCharArray(letters);

        // Accessing elements
        System.out.println("Element at index 4: " + letters[4]); // Accessing the fifth element (index 4)

        // Modifying an element
        letters[0] = 'h'; // Changing 'H' to 'h'
        System.out.println("Array after modifying index 0:");
        printCharArray(letters);

        // Counting vowels and consonants
        int[] counts = countVowelsAndConsonants(letters);
        System.out.println("Number of vowels: " + counts[0]);
        System.out.println("Number of consonants: " + counts[1]);
    }

    // Method to print the char array elements
    public static void printCharArray(char[] array) {
        for (char ch : array) {
            System.out.print(ch); // Print characters without spaces
        }
        System.out.println(); // New line for better readability
    }

    // Method to count vowels and consonants in the char array
    public static int[] countVowelsAndConsonants(char[] array) {
        int vowelCount = 0;
        int consonantCount = 0;

        for (char ch : array) {
            // Check if the character is a letter
            if (Character.isLetter(ch)) {
                // Check if the character is a vowel
                if ("AEIOUaeiou".indexOf(ch) != -1) {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }
        return new int[]{vowelCount, consonantCount}; // Return counts in an array
    }
}
