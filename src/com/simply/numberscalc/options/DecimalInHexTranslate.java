package com.simply.numberscalc.options;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.simply.numberscalc.Main.scanner;

public class DecimalInHexTranslate {


    private static final List<Integer> objects = new ArrayList<>();
    private static final List<String> hextypes= new ArrayList<>();
    private static String endresult;

    public static String dezimalinhextranslate() {

        System.out.println("Please enter your decimal number here:");
        int input = scanner.nextInt();

        objects.add(input);



        for( int i = 0; objects.get(i) > 0; i++) {


            int divided = objects.get(i) / 16;

            switch (objects.get(i) % 16) {
                case 0 -> hextypes.add("0");
                case 1 -> hextypes.add("1");
                case 2 -> hextypes.add("2");
                case 3 -> hextypes.add("3");
                case 4 -> hextypes.add("4");
                case 5 -> hextypes.add("5");
                case 6 -> hextypes.add("6");
                case 7 -> hextypes.add("7");
                case 8 -> hextypes.add("8");
                case 9 -> hextypes.add("9");
                case 10 -> hextypes.add("A");
                case 11 -> hextypes.add("B");
                case 12 -> hextypes.add("C");
                case 13 -> hextypes.add("D");
                case 14 -> hextypes.add("E");
                case 15 -> hextypes.add("F");
            }


            objects.add(divided);


        }
        Collections.reverse(hextypes);

        endresult = hextypes.toString().substring(1, 3 * hextypes.size() - 1).replaceAll(", ", "");

        return endresult;
    }


}
