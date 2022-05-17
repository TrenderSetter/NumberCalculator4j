package com.simply.numberscalc.options;

import static com.simply.numberscalc.Main.scanner;

public class HexInDecimalTranslate {

    public static int hexindecimaltranslate() {

        System.out.println("Please input your Hex here:");
        String input = scanner.next();



        int b = 0;
        double counter = 0;
        double pow = 16;

        for (int i = input.length() -1; i >= 0; i--) {

            String s = String.valueOf(input.charAt(i));

            if (b < input.length()) {
                switch (s) {
                    case "0" -> {
                        counter = counter + Math.pow(pow, b) * 0;
                        b = b + 1;

                    }
                    case "1" -> {
                        counter = counter + Math.pow(pow, b) * 1;
                        b = b + 1;
                    }
                    case "2" -> {
                        counter = counter + Math.pow(pow, b) * 2;
                        b = b + 1;
                    }
                    case "3" -> {
                        counter = counter + Math.pow(pow, b) * 3;
                        b = b + 1;
                    }
                    case "4" -> {
                        counter = counter + Math.pow(pow, b) * 4;
                        b = b + 1;
                    }
                    case "5" -> {
                        counter = counter + Math.pow(pow, b) * 5;
                        b = b + 1;
                    }
                    case "6" -> {
                        counter = counter + Math.pow(pow, b) * 6;
                        b = b + 1;
                    }
                    case "7" -> {
                        counter = counter + Math.pow(pow, b) * 7;
                        b = b + 1;
                    }
                    case "8" -> {
                        counter = counter + Math.pow(pow, b) * 8;
                        b = b + 1;
                    }
                    case "9" -> {
                        counter = counter + Math.pow(pow, b) * 9;
                        b = b + 1;
                    }
                    case "A" -> {
                        counter = counter + Math.pow(pow, b) * 10;
                        b = b + 1;
                    }
                    case "B" -> {
                        counter = counter + Math.pow(pow, b) * 11;
                        b = b + 1;
                    }
                    case "C" -> {
                        counter = counter + Math.pow(pow, b) * 12;
                        b = b + 1;
                    }
                    case "D" -> {
                        counter = counter + Math.pow(pow, b) * 13;
                        b = b + 1;
                    }
                    case "E" -> {
                        counter = counter + Math.pow(pow, b) * 14;
                        b = b + 1;
                    }
                    case "F" -> {
                        counter = counter + Math.pow(pow, b) * 15;
                        b = b + 1;
                    }
                }
            }

        }
        return (int) counter;

    }


}
