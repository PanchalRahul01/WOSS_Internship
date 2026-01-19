package PracticeProg;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Scanner;
public class prac29 {

    static String[] ones = {
            "", "one", "two", "three", "four", "five",
            "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen",
            "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
    };

    static String[] tens = {
            "", "", "twenty", "thirty", "forty", "fifty",
            "sixty", "seventy", "eighty", "ninety"
    };

    public static void main(String[] args) {

        System.out.println(numberToWords(234));
        System.out.println(wordsToNumber("Two thousand thirty four only"));
    }

    // -------- Number to Words --------
    static String numberToWords(int num) {

        if (num > 9999)
            return "Error: More than 4 digits";

        if (num == 0)
            return "zero only";

        return convert(num).trim() + " only";
    }

    static String convert(int num) {
        if (num < 20)
            return ones[num];

        if (num < 100)
            return tens[num / 10] + " " + ones[num % 10];

        if (num < 1000)
            return ones[num / 100] + " hundred " + convert(num % 100);

        return ones[num / 1000] + " thousand " + convert(num % 1000);
    }

    static int wordsToNumber(String input) {

        input = input.toLowerCase().replace("only", "").trim();

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 1; i < ones.length; i++)
            map.put(ones[i], i);

        for (int i = 2; i < tens.length; i++)
            map.put(tens[i], i * 10);

        map.put("hundred", 100);
        map.put("thousand", 1000);

        int result = 0, temp = 0;

        for (String word : input.split(" ")) {

            if (map.containsKey(word)) {
                int val = map.get(word);

                if (val == 100 || val == 1000) {
                    temp *= val;
                } else {
                    temp += val;
                }
            }
        }
        result += temp;

        return result;
        }
}
