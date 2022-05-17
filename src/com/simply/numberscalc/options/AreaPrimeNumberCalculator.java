package com.simply.numberscalc.options;

import com.simply.numberscalc.Main;

import java.util.ArrayList;
import java.util.List;

public class AreaPrimeNumberCalculator {

    private static final List<Integer> dividers = new ArrayList<>();

    public static List<Integer> primenumbers = new ArrayList<>();

    public static String areanumberscalc () {

        setDividers();

        System.out.println("Please enter your start point here:");

        int number1 = Main.scanner.nextInt();

        System.out.println("Please enter end point here:");

        int number2 = Main.scanner.nextInt();

        for (int counter = number1; counter <= number2; counter++) {
            final int counter1 = counter;
            if(dividers.stream().allMatch(divider -> counter1 % divider != 0) || dividers.contains(counter)) {
                if (counter != 1) {
                    primenumbers.add(counter);
                }
            }
        }

        System.out.println("In fact there are " + primenumbers.size() + " prime numbers in the area you have chosen. These are your prime numbers:");
        return primenumbers.toString().substring(1, 3 * primenumbers.size() - 1).replaceAll(", ", "; ");
    }

    public static void setDividers() {

        dividers.add(2);
        dividers.add(3);
        dividers.add(5);
        dividers.add(7);
        dividers.add(11);
        dividers.add(13);
        dividers.add(17);
        dividers.add(19);
        dividers.add(23);
        dividers.add(29);
        dividers.add(31);
        dividers.add(37);
        dividers.add(41);
        dividers.add(43);
        dividers.add(47);
        dividers.add(53);
        dividers.add(59);
        dividers.add(61);
        dividers.add(67);
        dividers.add(71);
        dividers.add(73);
        dividers.add(79);
        dividers.add(83);
        dividers.add(89);
        dividers.add(97);

    }

}
