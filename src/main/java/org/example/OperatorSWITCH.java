package org.example;

import java.util.Scanner;

public class OperatorSWITCH {
    private static Scanner weekdayNumber;

    public static void main(String[] args) {
        weekdayNumber = new Scanner(System.in);
        System.out.println(" Enter number from 1 to 7");
        int dayNumber = weekdayNumber.nextInt();

        String dayName;

        switch (dayNumber) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid input";

        }
        System.out.printf("You entered " + dayNumber + ". So weekday name is " + dayName + ".");

    }

}
