package org.example;
import java.util.Scanner;
public class LoopWHILE {
    private static Scanner keyboard;
    public static void main(String[] args) {
        keyboard = new Scanner (System.in);
        System.out.println("Enter a number ");
        int a = keyboard.nextInt();
        while ( a <= 0 || a > 100) {
            System.out.println("Wrong number! Enter number again");
            a = keyboard.nextInt();
        }
        System.out.println("Bravo! Your number is in the correct range");
    }
}
