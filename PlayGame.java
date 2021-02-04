import java.util.Scanner;
/* This is a game of charades.Program written 01/06/2021 by Audrey Sondergeld
* Rules:
* Each team has a piece of paper in front of them to keep Score.
* Teams will rotate
* Highest score wins
* (feel free to change any charade cards)
* Line 15: Created an string array that holds 6 elements (0-6)
* Line 16: While i is less than or equal to 6 iterate through the string array
* Line 23: If the string array at index i contains this phrase then print true, if not print false please try again
*/
public class PlayGame {
    public static void main(String[] args) {
        System.out.println("Get ready to play chartastic!");
        String[] charadeCards = {"alligator eating a birthday cake", "bear chasing a hiker", "elephant hugging a penguin", "a swimming fish", "a goat shopping", "discovering America"};
        for (int i = 0; i <= 6; i++) {
            System.out.println("Here is your phrase:  ");
            System.out.println(charadeCards[i]);
            Scanner input = new Scanner(System.in);
            System.out.println("enter your guess here: ");
            String userInput = input.nextLine();        //We need to set the input to something so we created a string to hold
            //System.out.println("User input was:  " + userInput);
            if (charadeCards[i].equals(userInput)) {
                System.out.println("True");
            } else {
                System.out.println("Incorrect");
            }
        }
    }
    }

