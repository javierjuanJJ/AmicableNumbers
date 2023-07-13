package org.example;

import org.example.AmicableNumbers.AmicableNumbers;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int limit = 50;
        for (int counter = 1; counter < limit; counter++) {
            System.out.println("The amicable numbers of " + counter + " are " + Arrays.toString(AmicableNumbers.amicableNumbers(counter, 10000)));
        }
        System.out.println("The amicable numbers of " + 220 + " are " + Arrays.toString(AmicableNumbers.amicableNumbers(220, 10000)));

    }
}