import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        System.out.print("Please, enter your choice: ");
        String plrChoice = sc.nextLine();
        int plrChoiceInt = 0;
        switch (plrChoice){
            case ("Rock"):
                plrChoiceInt = 0;
                break;
            case ("Spock"):
                plrChoiceInt = 1;
                break;
            case ("Paper"):
                plrChoiceInt = 2;
                break;
            case ("Lizard"):
                plrChoiceInt = 3;
                break;
            case ("Scissors"):
                plrChoiceInt = 4;
                break;
        }
        String pcChoiceString = "abc";
        int compChoice = abs(rnd.nextInt()) % 5;
        switch (compChoice){
            case (0):
                pcChoiceString = "Rock";
                break;
            case (1):
                pcChoiceString = "Spock";
                break;
            case (2):
                pcChoiceString = "Paper";
                break;
            case (3):
                pcChoiceString = "Lizard";
                break;
            case (4):
                pcChoiceString = "Scissors";
                break;
        }
        System.out.println("Computer has chosen: " + pcChoiceString);
        int diff = (compChoice - plrChoiceInt) % 5;
        if (diff == 0){
            System.out.println("Tie!");
        }else if (diff % 2 == 1){
            System.out.println("Computer has won!");
        }else {
            System.out.println("Player has won!");
        }
    }
}