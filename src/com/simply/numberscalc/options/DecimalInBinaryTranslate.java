package com.simply.numberscalc.options;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.simply.numberscalc.Main.scanner;

public class DecimalInBinaryTranslate {


    private static final List<Integer> objects = new ArrayList<>();
    private static final List<String> binarytypes= new ArrayList<> ();

    public static String decimalinbinary() {

        System.out.println("Please enter your decimal number here:");
        int input = scanner.nextInt();

        objects.add(input);


        for( int i = 0; objects.get(i) > 0; i++) {


            int divided = objects.get(i) / 2;

            switch (objects.get(i) % 2) {
                case 0 -> binarytypes.add("0");
                case 1 -> binarytypes.add("1");

            }


            objects.add(divided);


        }
        Collections.reverse(binarytypes);

        String endresult = binarytypes.toString().substring(1, 3 * binarytypes.size() - 1).replaceAll(", ", "");

        return endresult;
    }

}
