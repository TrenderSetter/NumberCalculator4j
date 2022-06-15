package com.simply.numberscalc.options;


import static com.simply.numberscalc.Main.scanner;

public class HexInBinaryTranslate {

    public static String hexinbinarytranslate() {

        System.out.println("Please input your Hex here:");
        String input = scanner.next();
        StringBuilder output = new StringBuilder();

        String[] hexnumbers = {"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"};



        for (int i = 0; i < input.length(); i++) {

            String s = String.valueOf(input.charAt(i));

            switch (s)
            {
                case "0" -> output.append(hexnumbers[0]);
                case "1" -> output.append(hexnumbers[1]);
                case "2" -> output.append(hexnumbers[2]);
                case "3" -> output.append(hexnumbers[3]);
                case "4" -> output.append(hexnumbers[4]);
                case "5" -> output.append(hexnumbers[5]);
                case "6" -> output.append(hexnumbers[6]);
                case "7" -> output.append(hexnumbers[7]);
                case "8" -> output.append(hexnumbers[8]);
                case "9" -> output.append(hexnumbers[9]);
                case "A" -> output.append(hexnumbers[10]);
                case "B" -> output.append(hexnumbers[11]);
                case "C" -> output.append(hexnumbers[12]);
                case "D" -> output.append(hexnumbers[13]);
                case "E" -> output.append(hexnumbers[14]);
                case "F" -> output.append(hexnumbers[15]);
            }
        }
        return output.toString();
    }
}
