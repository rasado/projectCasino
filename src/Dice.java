import java.util.Random;
import java.util.Scanner;

public class Dice {

    Random r = new Random();
    Scanner input = new Scanner(System.in);
    Scanner inputTwo = new Scanner(System.in);
    Character character;
    boolean playing;
    String answer;
    double bet;


    public Dice(Character character) {
        this.character = character;
    }

    public void diceGame() { //själva spelmetoden för Dice-bordet i casinot
        int dice1 = 1 + r.nextInt(6); //slumpar tärningarna med siffra från 1-6.
        int dice2 = 1 + r.nextInt(6);
        playing = true;
        while (playing) { //playing körs så länge användaren fortsätter att svara ja på frågan om den vill fortsätta
            System.out.println("Take a guess if the second dice will be higher or lower than the first.");
            System.out.print("How much would you like to bet? The payout is 2x if you guess right: ");
            bet = input.nextInt(); //lagrar användarens insats
            System.out.println("* * * * * ROLLING THE DICE * * * * *");
            System.out.println("The first dice shows " + dice1);
            System.out.println();
            System.out.print("Now, take a guess whether the number on the next dice will be higher or lower. Answer by entering higher/lower: ");
            answer = inputTwo.nextLine(); //lagrar användarens input

            if (answer.equalsIgnoreCase("higher")) {
                if (dice2 > dice1) {
                    System.out.println("Success! You won " + (bet * 2) + " dollars. They are added to your credit.");
                    character.increaseWallet((bet * 2));
                } else {
                    System.out.println("Unlucky, the number was " + dice2 + ".");
                    character.decreaseWallet(bet);
                }
            }
            if (answer.equalsIgnoreCase("lower")) {
                if (dice2 < dice1) {
                    System.out.println("Success! You won " + (bet * 2) + "dollars. They are added to your credit.");
                    character.increaseWallet((bet * 2));
                } else {
                    System.out.println("Unlucky, the number was: " + dice2 + ".");
                    character.decreaseWallet(bet);
                }
            }

            System.out.println("Your credit is now: " + character.wallet);
            if (character.wallet == 0) {
                character.walletEmpty();
            } else {
                System.out.println("Would you like to play again?");
                answer = inputTwo.nextLine();
                if (answer.equalsIgnoreCase("yes")) {
                    diceGame();
                } else
                    System.out.println("Thanks for rolling the dice with us.");
            }
        }
    }
}


