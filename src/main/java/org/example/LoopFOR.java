package org.example;

public class LoopFOR {
    public static void main(String[] args) {
        /*for (int i = 1; i <= 200; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        for (int i = 0; i < 300; i++) {
            if (i % 3 == 0 && i % 7 == 0) {
                System.out.println(i);
            }
        }*/

            for (int i = 0; i < 100; i++) {
                if (i % 10 == 0) {
                    System.out.println("Error");
                } else {
                    System.out.println(i);
                }
            }
    }
}