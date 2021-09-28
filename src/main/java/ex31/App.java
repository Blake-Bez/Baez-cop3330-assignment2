package ex31;
/*
 *  UCF COP3330 Fall 2021 Assignment 31 Solution
 *  Copyright 2021 Blake Baez
 */
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int restPulse;
        int age;

        while(true) {

            System.out.print("Enter Resting Pulse : ");
            String pulse = sc.next();
            if(isNum(pulse)) {
                restPulse = Integer.parseInt(pulse);
                break;
            }else {
                System.out.println("Invalid Pulse");
            }
        }

        while(true) {
            System.out.print("Enter Age : ");
            String pulse = sc.next();
            if(isNum(pulse)) {
                age = Integer.parseInt(pulse);
                break;
            }else {
                System.out.println("Invalid Age");
            }
        }

        System.out.println("Intensity\tRate");
        for(int intensity = 55 ; intensity <= 95 ; intensity += 5) {
            int rate = ((220 - age - restPulse) * intensity/100) + restPulse;
            System.out.println(intensity+"%\t\t"+rate+" bpm");
        }
        sc.close();
    }

    public static boolean isNum(String pulse) {
        try {
            Integer.parseInt(pulse);
        }catch(Exception e) {
            return false;
        }
        return true;
    }

}
