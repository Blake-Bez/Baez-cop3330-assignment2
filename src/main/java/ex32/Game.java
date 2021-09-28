package ex32;
public class Game {
    private int number;

    public void setNumber(int num){
        this.number = num;
    }

    public int guessNumber(String guessString){
        char[] inputArray = guessString.toCharArray();
        int right = 0;
        for (int i = 0 ; i < guessString.length(); i++){
            if (Character.isDigit(inputArray[i])){
                right++;
            }
        }
        //indicates the whole string is a number
        if(right == guessString.length()){
            Integer value = Integer.valueOf(guessString);
            if (value == number){
                return 0;
                //case if the guess was too low
            } else if (value < number){
                return 1;
                //case if the guess was too high
            } else {
                return 2;
            }
        } else {
            return 3;//case if the user input was invalid
        }



    }
}

