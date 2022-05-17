package com.simply.numberscalc;

import com.simply.numberscalc.options.*;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {

        System.out.println("""
                Welcome to the NumbersCalculator4j\s
                 These are you options to calculate:\s
                   1) calculates a single prime number\s
                   2) calculates a chosen area of prime numbers\s
                   3) converts decimal in hexadecimal\s
                   4) converts hexadecimal in decimal\s
                   5) converts decimal in binary\s
                   6) converts binary in decimal
                   """);

        String input = scanner.next();

        switch (input) {

            case "1" -> SinglePrimeNumberCalculator.singlenumbercalc();
            case "2" -> System.out.println(AreaPrimeNumberCalculator.areanumberscalc());
            case "3" -> System.out.println(DecimalInHexTranslate.dezimalinhextranslate());
            case "4" -> System.out.println(HexInDecimalTranslate.hexindecimaltranslate());
            case "5" -> System.out.println(DecimalInBinaryTranslate.decimalinbinary());
            case "6" -> System.out.println(BinaryInDecimalTranslate.hexindecimaltranslate());

        }
    }



}
