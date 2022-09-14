package com.simply.numberscalc.options;


import static com.simply.numberscalc.Main.scanner;

public class HexInBinaryTranslate {

    public static String hexinbinarytranslate() {

        System.out.println("Please input your Hex here:");
        String input = scanner.next();
        StringBuilder output = new StringBuilder();

        String[] binarynumbers = {"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"};



        for (int i = 0; i < input.length(); i++) {

            String s = String.valueOf(input.charAt(i));

            switch (s)
            {
                case "0" -> output.append(binarynumbers[0]);
                case "1" -> output.append(binarynumbers[1]);
                case "2" -> output.append(binarynumbers[2]);
                case "3" -> output.append(binarynumbers[3]);
                case "4" -> output.append(binarynumbers[4]);
                case "5" -> output.append(binarynumbers[5]);
                case "6" -> output.append(binarynumbers[6]);
                case "7" -> output.append(binarynumbers[7]);
                case "8" -> output.append(binarynumbers[8]);
                case "9" -> output.append(binarynumbers[9]);
                case "A" -> output.append(binarynumbers[10]);
                case "B" -> output.append(binarynumbers[11]);
                case "C" -> output.append(binarynumbers[12]);
                case "D" -> output.append(binarynumbers[13]);
                case "E" -> output.append(binarynumbers[14]);
                case "F" -> output.append(binarynumbers[15]);
            }
        }
        return output.toString();
    }
}
