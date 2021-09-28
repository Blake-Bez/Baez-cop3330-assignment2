package ex24;

import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two strings and I'll tell you if they are anagrams: \n");
        System.out.print("Enter the first string: ");
        String str1 = input.nextLine();
        System.out.print("Enter the first string: ");
        String str2 = input.nextLine();

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // check if length is same
        if(str1.length() == str2.length()) {
            if(isAnagram(str1, str2))
            {
                System.out.println(str1 + " and " + str2 + " are anagram.");
            }
            else {
                System.out.println(str1 + " and " + str2 + " are not anagram.");
            }
        }
        else {
            System.out.println(str1 + " and " + str2 + " are not anagram.");
        }
    }

    public static boolean isAnagram(String str1, String str2)
    {
        // convert strings to char array
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        // sort the char array
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // if sorted char arrays are same
        // then the string is anagram
        return Arrays.equals(charArray1, charArray2);
    }
}