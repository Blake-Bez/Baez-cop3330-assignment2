package ex35;
/*
 *  UCF COP3330 Fall 2021 Assignment 35 Solution
 *  Copyright 2021 Blake Baez
 */
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String name;
        ArrayList<String> names = new ArrayList<>();

        do {
            System.out.println("Enter a name:");
            name= input.nextLine();
            if(!name.isBlank() && !name.isEmpty())
                names.add(name);
        }while(!name.isBlank() && !name.isEmpty());

        Random random = new Random();
        int randomIndex = random.nextInt(names.size());

        System.out.println("The winner is... "+names.get(randomIndex));

    }

}