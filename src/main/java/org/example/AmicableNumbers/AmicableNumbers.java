package org.example.AmicableNumbers;

import java.util.ArrayList;
import java.util.Arrays;

public class AmicableNumbers {
    private static int[] divisors(int number){
        ArrayList<Integer> resultDivisors = new ArrayList<>();


        for (int counter = 1; counter < number; counter++) {
            if (isDivisor(number, counter)){
                resultDivisors.add(counter);
            }
        }

        return convertToArray(resultDivisors);
    }

    private static boolean isDivisor(int remainder,int divisor) {
        return remainder % divisor == 0;
    }

    private static int[] convertToArray(ArrayList<Integer> resultDivisors) {
        int sizeOfArrayResultFromArrayList = resultDivisors.size();
        int[] arrayResultFromArrayList = new int[sizeOfArrayResultFromArrayList];

        for (int counter = 0; counter < sizeOfArrayResultFromArrayList; counter++) {
            arrayResultFromArrayList[counter] = resultDivisors.get(counter);
        }

        return arrayResultFromArrayList;
    }

    private static int sumArray(int[] resultDivisors) {
        int sumArray = 0;



        for (int counter = 0; counter < resultDivisors.length; counter++) {
            sumArray += resultDivisors[counter];
        }

        return sumArray;
    }

    public static int[] amicableNumbers(int number, int limit) {
        ArrayList<Integer> resultDivisors = new ArrayList<>();
        int sumDivisorsNumber = sumArray(divisors(number));
        /*System.out.println(sumDivisorsNumber);
        System.out.println( "STARTING Number: " + Arrays.toString(divisors(number)) + " " + sumDivisorsNumber);
*/

        for (int counter = 1; counter < limit; counter++) {
            int[] divisors = divisors(counter);
            int number2 = sumArray(divisors);
            if (isAmicableNumber(number, number2)){
                /*System.out.println( "Number: " + Arrays.toString(divisors) + " " + number2 + " NUMBER COUNTER IS: " + counter);
*/
                resultDivisors.add(counter);
            }
        }

        return convertToArray(resultDivisors);
    }

    private static boolean isAmicableNumber(int number1, int number2) {
        return number1 == number2;
    }

}
