package org.example;
import java.util.Scanner;
public class Rectangle {
    private static Scanner rectangleMath;

    public static void main(String[] args) {
        rectangleMath = new Scanner (System.in);
        System.out.println("Enter length of rectangle");
        int lengthRectangle = rectangleMath.nextInt();
        while (lengthRectangle <= 0) {
            System.out.println("Enter a positive number");
            lengthRectangle = rectangleMath.nextInt();
        }
        System.out.println("Enter width of rectangle");
        int widthRectangle = rectangleMath.nextInt();
        while (widthRectangle <= 0) {
            System.out.println("Enter a positive number");
            widthRectangle = rectangleMath.nextInt();
        }

        int perimeterRectangle = lengthRectangle * widthRectangle; // периметър - а * б
        int areaRectangle = 2 * (lengthRectangle + widthRectangle); // лице - 2 * (а+б)

        System.out.println("The perimeter of rectangle with length " + lengthRectangle + " and width " + widthRectangle
        + " is " + perimeterRectangle +".");
        System.out.println("The Area of a rectangle with length " + lengthRectangle + " and width " + widthRectangle +
                " is " + areaRectangle + ".");


    }

}
