package ex36;
/*
 *  UCF COP3330 Fall 2021 Assignment 36 Solution
 *  Copyright 2021 Blake Baez
 */
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Data myData = new Data();

        System.out.print("Enter a number: ");
        String newNumber = input.nextLine();

        while (!newNumber.equals("done")){
            myData.addNumber(newNumber);
            System.out.print("Enter a number: ");
            newNumber = input.nextLine();
        }

        double average = myData.average();
        int minimum = myData.min();
        int maximum = myData.max();
        double standardDeviation = myData.std(average);

        System.out.print(myData.getNumbers());
        System.out.printf("\nThe average is %.1f", average);
        System.out.printf("\nThe minimum is %d", minimum);
        System.out.printf("\nThe maximum is %d", maximum);
        System.out.printf("\nThe standard deviation is %.2f", standardDeviation);

    }
}
