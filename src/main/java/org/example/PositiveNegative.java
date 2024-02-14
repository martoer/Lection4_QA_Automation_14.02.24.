package org.example;
import java.util.Scanner;
public class PositiveNegative {
    private static Scanner checkPositive;

    public static void main(String[] args) {
        checkPositive = new Scanner (System.in);
        System.out.println("Please enter a number");
        int numberToCheck = checkPositive.nextInt();

        if  (numberToCheck < 0 ) {
            System.out.println("The number " + numberToCheck + " is negative");
        } else if (numberToCheck > 0) {
            System.out.println("The number " + numberToCheck + " is positive");
        }
        else {
            System.out.println("The number is 0");
        }

        }
    }

