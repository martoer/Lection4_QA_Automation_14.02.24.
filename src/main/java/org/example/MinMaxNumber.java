package org.example;
import java.util.Scanner;
public class MinMaxNumber {
    private static Scanner checkMinMaxNumber;

    public static void main(String[] args) {
        checkMinMaxNumber = new Scanner(System.in);
        System.out.println("Please enter 3 different numbers");
        int number1 = checkMinMaxNumber.nextInt();
        int number2 = checkMinMaxNumber.nextInt();
        int number3 = checkMinMaxNumber.nextInt();
        int maxNumber;

        maxNumber = number1;
        if (number1 < number2) {
            maxNumber = number2;
        } else if (number1 < number3) {
            maxNumber = number3;
        }
        System.out.println("The highest number is " + maxNumber);
    }
}


