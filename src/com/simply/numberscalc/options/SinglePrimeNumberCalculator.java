package com.simply.numberscalc.options;

import java.util.ArrayList;
import java.util.List;

import static com.simply.numberscalc.Main.scanner;

public class SinglePrimeNumberCalculator {

    public static List<Integer> unnecessaryNumbers = new ArrayList<>();
    public static boolean pon = true;


    public static void singlenumbercalc() {
        System.out.println("Please enter the number you want to calculate here:");

        int number = scanner.nextInt();

        for (int counter = 2; Math.sqrt(number) >= counter; counter++) {

            final int counterFinal = counter;
            List<Integer> multipleCounter = unnecessaryNumbers.stream().filter(unnecessaryNumber -> counterFinal % unnecessaryNumber == 0).toList();
            if (unnecessaryNumbers.contains(counter)) continue;

            for (int size = multipleCounter.size() - 1; size >= 1; size--) {
                unnecessaryNumbers.add(multipleCounter.get(size));
            }

            if (number % counter != 0) {
                unnecessaryNumbers.add(counter);
            }
            if (number % counter == 0) {

                pon = false;
                System.out.println("Your number isn't a prime-number, because: \nYour number can be divided by " + counter + " (maybe) and all its multiples");

                if (unnecessaryNumbers.size() > 0) {

                }else {
                    System.out.println("The number you chose,can be divided by 2 and all its multiples");
                }

                break;
            }

        }
        if (pon) {
            System.out.println("Your number is a prime-number");

        }

    }

}
