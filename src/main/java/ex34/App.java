package ex34;
/*
 *  UCF COP3330 Fall 2021 Assignment 34 Solution
 *  Copyright 2021 Blake Baez
 */
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        App nApp = new App();
        String[] List = {"John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"};

        nApp.display(List);
        System.out.print("\nEnter an employee name to remove: ");
        String remove = input.nextLine();
        List = nApp.remove(List, remove);
        nApp.display(List);
    }

    public String[] remove (String[] List, String remove){
        String[] Array = new String[List.length - 1];
        int index = 0;
        for (int i = 0; i < List.length; i++){
            if (!List[i].equals(remove)){
                Array[index] = List[i];
                index++;
            }
        }
        return Array;
    }
    public void display(String[] list){
        System.out.println("\nThere are "+ list.length + " employees:");
        for (int i = 0; i < list.length; i++){
            System.out.println(list[i]);
        }
    }
}
