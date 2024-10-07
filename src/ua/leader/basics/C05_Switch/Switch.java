package ua.leader.basics.C05_Switch;

import java.util.HashMap;
import java.util.Map;


@FunctionalInterface
interface NoArgAction {
    void execute(); // Abstract method with no arguments
}

public class Switch {
    public static void main(String[] args) {
        int day = 3;

        Map<Integer, NoArgAction> switchMap = new HashMap() ;
        switchMap.put(1, () -> System.out.println("Monday"));
        switchMap.put(2, () -> System.out.println("Tuesday"));
        switchMap.put(3, () -> System.out.println("Wednesday"));
        NoArgAction action = switchMap.getOrDefault(day, () -> System.out.println("Invalid day"));

        action.execute();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}


