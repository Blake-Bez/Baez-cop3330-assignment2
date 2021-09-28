package ex30;
/*
 *  UCF COP3330 Fall 2021 Assignment 30 Solution
 *  Copyright 2021 Blake Baez
 */
public class App {
    public static void main(String[] args) {
        App myApp = new App();
        myApp.generateTable(1, 12);
    }

    public void generateTable(int start, int end){
        for(int i = start; i <= end; i++){
            int num;
            int num1 = 0;
            for(int j = start; j <= end; j++){
                num = i * j;
                if (num1 < 10){
                    System.out.print("\t " + num);
                } else if (num1 >= 10 && num1 < 100){
                    System.out.print("\t " + num);
                }else {
                    System.out.print("\t " + num);
                }
                num1 = num;
            }
        }
    }
}