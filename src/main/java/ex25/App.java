package ex25;

/*
 *  UCF COP3330 Fall 2021 Assignment 25 Solution
 *  Copyright 2021 Blake Baez
 */
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter password: ");
        String pas = input.nextLine();
        Password user = new Password(pas);
        int strength = passwordValidator(user);
        String message = generateMessage(user, strength);
        System.out.print(message);

    }

    public static int passwordValidator(Password word){
        int length = word.getLength();
        int nums = word.getDigits();
        int chars = word.getCharacters();
        int special = word.getSpecial();
        int strength = 0;

        if (length >= 8 && nums > 1 && chars > 1 && special > 0){
            strength = 4;
        } else if (length >= 8 && nums >= 1 && chars > 1 && special == 0){
            strength = 3;
        } else if (length < 8 && nums == 0 && chars != 0 && special == 0){
            strength = 2;
        } else if (length < 8 && nums != 0 && chars == 0 && special == 0){
            strength = 1;
        }

        return strength;
    }

    public static String generateMessage(Password word, int strength){
        String message = "The password '" + word.getPassword() + "' is a ";

        switch(strength){
            case 1:
                message = message.concat("very weak password.");
                break;
            case 2:
                message = message.concat("weak password.");
                break;
            case 3:
                message = message.concat("strong password.");
                break;
            case 4:
                message = message.concat("very strong password");
                break;
            default:
                message = message.concat("error.");
                break;
        }

        return message;
    }
}