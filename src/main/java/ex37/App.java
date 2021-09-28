package ex37;
/*
 *  UCF COP3330 Fall 2021 Assignment 37 Solution
 *  Copyright 2021 Blake Baez
 */
import java.util.Scanner;
import java.util.Random;
import java.util.*;

public class App
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("What's the minimum len? ");
        int size = Integer.parseInt(in.nextLine());

        System.out.print("How many spec characters? ");
        int spec = Integer.parseInt(in.nextLine());

        System.out.print("How many numbers? ");
        int numbers = Integer.parseInt(in.nextLine());

        System.out.println("Your password is " + generatePassword(size, spec, numbers));
    }

    public static String generatePassword(int len, int spec, int nums)
    {
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

        String specialCharacters = "!@#$%^&*";

        String numbers = "1234567890";

        Random random = new Random();

        ArrayList<Character> chars = new ArrayList<>();

        for(int i=0; i<spec; i++){
            chars.add(specialCharacters.charAt(random.nextInt(specialCharacters.length())));
        }

        for(int i=0; i<nums; i++){
            chars.add(numbers.charAt(random.nextInt(numbers.length())));
        }
        for(int i=chars.size()-1; i<len; i++){
            chars.add(letters.charAt(random.nextInt(letters.length())));
        }

        Collections.shuffle(chars);
        String password = "";

        for(Character s : chars)
        {
            password = password + Character.toString(s);
        }
        return password;
    }
}
