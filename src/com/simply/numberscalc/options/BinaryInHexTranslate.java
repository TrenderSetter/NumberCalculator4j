package com.simply.numberscalc.options;

import static com.simply.numberscalc.Main.scanner;

public class BinaryInHexTranslate {

    public static String binaryinhextranslate() {

        System.out.println("Please input your binary here:");
        String input = scanner.next();
        StringBuilder output = new StringBuilder();

        String[] hexnumbers = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};
        int j = 0;
        for (int i = 0; i < input.length() *4 +4; i=i +4 *j) {

            String s = input.substring(0,i * j);


            switch (s) {
                case "0000" -> output.append(hexnumbers[0]);
                case "0001" -> output.append(hexnumbers[1]);
                case "0010" -> output.append(hexnumbers[2]);
                case "0011" -> output.append(hexnumbers[3]);
                case "0100" -> output.append(hexnumbers[4]);
                case "0101" -> output.append(hexnumbers[5]);
                case "0110" -> output.append(hexnumbers[6]);
                case "0111" -> output.append(hexnumbers[7]);
                case "1000" -> output.append(hexnumbers[8]);
                case "1001" -> output.append(hexnumbers[9]);
                case "1010" -> output.append(hexnumbers[10]);
                case "1011" -> output.append(hexnumbers[11]);
                case "1100" -> output.append(hexnumbers[12]);
                case "1101" -> output.append(hexnumbers[13]);
                case "1110" -> output.append(hexnumbers[14]);
                case "1111" -> output.append(hexnumbers[15]);

            }

            j++;
            if (i +4*j== input.length()) break;
        }
        return output.toString();
    }
}
