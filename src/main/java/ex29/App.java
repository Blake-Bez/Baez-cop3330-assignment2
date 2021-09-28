package ex29;

/*
 *  UCF COP3330 Fall 2021 Assignment 29 Solution
 *  Copyright 2021 Blake Baez
 */
import java.util.Scanner;
import java.util.*;
public class App
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        boolean num=false;
        while(true)
        {
            try
            {
                System.out.print("What is the rate of return? ");
                int num1=Integer.parseInt(sc.next());
                System.out.println("It will take "+(72/num1)+" years to double your initial investment.");
                num=true;
            }
            //I don't beleive catch was taught in class, but it made this program a lot more clean
            catch(NumberFormatException e)
            {
                System.out.println("Sorry. That's not a valid input");
            }
            catch(ArithmeticException e)
            {
                System.out.println("Sorry. That's not a valid input");
            }
            if(num)
            {
                break;
            }

        }
    }
}