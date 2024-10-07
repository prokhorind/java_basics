package ua.leader.basics.C04_Logical_Operations;

import java.util.Scanner;

class Logical {
    public static void main(String args[]) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter A value: ");
        int number=sc.nextInt();

        if (number > 0) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is negative.");

        }
    }
}
