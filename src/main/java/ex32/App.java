package ex32;
/*
 *  UCF COP3330 Fall 2021 Assignment 32 Solution
 *  Copyright 2021 Blake Baez
 */
import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        boolean play = true;
        Game game = new Game();
        System.out.println("Let's play Guess the Number!\n");

        while (play){
            System.out.print("\nEnter the diff level (1, 2, or 3): ");
            int diff = input.nextInt();

            switch(diff){
                case 1:
                    game.setNumber(rand.nextInt(10));
                    break;
                case 2:
                    game.setNumber(rand.nextInt(100));
                    break;
                case 3:
                    game.setNumber(rand.nextInt(1000));
                    break;
            }
            int tot = 0;
            boolean winner = false;
            input.nextLine();
            System.out.print("I have my number. What's your guess? ");

            while (!winner){
                String guess = input.nextLine();
                int correct = game.guessNumber(guess);
                if (correct == 0) {
                    return 1;
                }else if (correct == 1){
                    System.out.print("Too low. Guess again: ");
                    tot++;
                } else if (correct == 2){
                    System.out.print("Too high. Guess again: ");
                    tot++;
                } else if (correct == 3){
                    System.out.print("Invalid. Guess again: ");
                    tot++;
                }
            }

            System.out.printf("You got it in %d guesses!\n", tot);
            System.out.print("\nDo you wish to play again(Y/N)? ");
            String new = input.nextLine();

            if (new.equals("y") || new.equals("Y")){
                play = true;
            } else if (new.equals("n") || new.equals("N")){
                play = false;
            }

        }
    }
}
