package ex27;

/*
 *  UCF COP3330 Fall 2021 Assignment 27 Solution
 *  Copyright 2021 Blake Baez
 */
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first name: ");
        String firstN = input.nextLine();

        System.out.print("Enter the last name: ");
        String lastN = input.nextLine();

        System.out.print("Enter the ZIP code: ");
        String zipCode = input.nextLine();

        System.out.print("Enter the employee ID: ");
        String employeeID = input.nextLine();

        Employee user = new Employee(firstN, lastN, zipCode, employeeID);
        String mess = validateInput(user);
        System.out.print(mess);
    }
    public static String validateInput(Employee user){
        String mess = "";
        int error = 0;
        if (!user.checkFirstNameLength()){
            error++;
            mess = mess.concat("\nThe first name must be at least 2 characters long.");
        }
        if (!user.checkLastNameLength()){
            error++;
            mess = mess.concat("\nThe last name must be at least 2 characters long.");
        }
        if (!user.checkFirstNamePresent()){
            error++;
            mess = mess.concat("\nThe first name must be filled in.");
        }
        if(!user.checkLastNamePresent()){
            error++;
            mess = mess.concat("\nThe last name must be filled in.");
        }
        if (!user.checkEmployeeID()){
            error++;
            mess = mess.concat("\nThe employee ID must be in the format of AA-1234.");
        }
        if (!user.checkZip()){
            error++;
            mess = mess.concat("\nThe zipcode must be a 5 digit number.");
        }
        if(error == 0){
            mess = mess.concat("\nThere were no error found.");
        }
        return mess;
    }
}