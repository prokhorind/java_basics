package ua.leader.basics.C06_Loops;

public class CoreLoop {
        public static void main(String[] args) {

            // Example of a 'do-while' loop
            System.out.println("Do-While Loop:");
            int i = 6;
            do {
                System.out.println(i);
                i++;
            } while (i <= 5);

            // Example of a 'while' loop
            System.out.println("\nWhile Loop:");
            int j = 6;
            while (j <= 5) {
                System.out.println(j);
                j++;
            }

            // Example of a 'for' loop
            System.out.println("\nFor Loop:");
            for (int k = 0; k < 4; k++) {
                System.out.println(k);
            }
        }
}
