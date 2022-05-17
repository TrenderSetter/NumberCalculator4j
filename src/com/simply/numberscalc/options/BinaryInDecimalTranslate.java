package com.simply.numberscalc.options;

import static com.simply.numberscalc.Main.scanner;

public class BinaryInDecimalTranslate {

    public static int hexindecimaltranslate() {


        System.out.println("Please input your Hex here:");
        String input = scanner.next();


        int b = 0;
        double counter = 0;
        double pow = 2;

        for (int i = input.length() - 1; i >= 0; i--) {

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
                }
            }
        }
        return (int) counter;
    }
}
