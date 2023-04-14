/*
Given the string “Mississippi”, find the number of occurrences of character ’s’ and character
‘i’.
 */

public class CountOccurrence {
    public static void main(String[] args) {
        countOccurrences("Mississippi");

    }
    public static void countOccurrences(String str) {
        int sCount = 0;
        int iCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 's') {
                sCount++;
            } else if (ch == 'i') {
                iCount++;
            }
        }

        System.out.println("Number of 's' occurrences: " + sCount);
        System.out.println("Number of 'i' occurrences: " + iCount);
    }
}
