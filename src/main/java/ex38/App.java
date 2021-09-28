package ex38;
/*
 *  UCF COP3330 Fall 2021 Assignment 38 Solution
 *  Copyright 2021 Blake Baez
 */
import java.util.*;

public class App
{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a list of numbers, separated by spaces: ");
        String num = in.nextLine();
        String list[] = num.split(" ");

        Integer evenList[] = filterEvenNumbers(list);

        System.out.print("The even numbers are ");
        for(int i=0; i<evenList.length; i++){
            if(i < evenList.length-1){
                System.out.print(evenList[i] + " ");
            }
            else
            {
                System.out.print(evenList[i] + ".");
            }
        }
    }

    public static Integer[] filterEvenNumbers(String list[]) {

        ArrayList<Integer> newList = new ArrayList<>();

        for(int i=0; i<list.length; i++){

            int num = Integer.parseInt(list[i]);

            if(num % 2 == 0){
                newList.add(num);
            }
        }

        Integer[] array = new Integer[newList.size()];
        array = newList.toArray(array);

        return array;
    }
}
