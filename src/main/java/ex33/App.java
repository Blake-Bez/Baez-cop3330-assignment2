package ex33;
/*
 *  UCF COP3330 Fall 2021 Assignment 33 Solution
 *  Copyright 2021 Blake Baez
 */
import java.util.Scanner;
import java.util.Random;
import java.util.*;
public class App{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("What's your question?\r\n> ");
        String question = input.nextLine();
        Random rand = new Random();

        List<String> answer = Arrays.asList("Yes.", "No.", "Maybe.", "Ask again later.");
        int choice = rand.nextInt(4);

        String decision = answer.get(choice);

        System.out.println(decision);

    }
}