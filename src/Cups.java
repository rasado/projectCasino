import java.util.Random;
import java.util.Scanner;

public class Cups{

    Scanner input = new Scanner(System.in);
    Scanner inputTwo = new Scanner(System.in);
    Character character;
    Random rndm = new Random();

    public Cups(Character character) {
        this.character = character;
    }

    public void cupsGame() {

        System.out.println("Here your job is to guess where the Ace is hiding." +
                " Since the odds are against you the payout will be greater - 2.5x if you win.");
        System.out.println("Your credit is currently: " + character.wallet);
        System.out.print("\nPlease place your bet: ");
        double bet = input.nextDouble();
        character.decreaseWallet(bet);

        System.out.println("Choose a cup which you think hides a ball");
        System.out.println("\t##\t##\t##");
        System.out.println("\t##\t##\t##");
        System.out.println("\t1\t2\t3");

        int guess = input.nextInt();
        int ball = 1 + rndm.nextInt(3);

        //körs när input och randomiserade numret är samma
        if (guess == ball) {
            System.out.println("* * * HURRAY!! You won * * * ");
            character.increaseWallet((bet * 2.5));
            if (guess == 1) {
                System.out.println("\tAA\t##\t##");
                System.out.println("\tAA\t##\t##");
                System.out.println("\t1\t2\t3");
            }
            if (guess == 2) {
                System.out.println("\t##\tAA\t##");
                System.out.println("\t##\tAA\t##");
                System.out.println("\t1\t2\t3");
            }else {
                System.out.println("\t##\t##\tAA");
                System.out.println("\t##\t##\tAA");
                System.out.println("\t1\t2\t3");
            }
        }
        //en av dessa 3 looparna körs när gissningen och "ball" inte stämmer överens. alltså förlorade spelaren.
        if (guess != ball && ball == 2) {
            System.out.println("Bad luck Chuck. It was under number 2");
            System.out.println("\t##\tAA\t##");
            System.out.println("\t##\tAA\t##");
            System.out.println("\t1\t2\t3");
        }
        if (guess != ball && ball == 1) {
            System.out.println("Bad luck Chuck. It was under number 1");
            System.out.println("\tAA\t##\t##");
            System.out.println("\tAA\t##\t##");
            System.out.println("\t1\t2\t3");
        }
        if (guess != ball && ball == 3) {
            System.out.println("Bad luck Chuck. It was under number 3");
            System.out.println("\t##\t##\tAA");
            System.out.println("\t##\t##\tAA");
            System.out.println("\t1\t2\t3");
        }


        System.out.println("Your credit is now: " + character.wallet);
        if (character.wallet == 0){
           character.walletEmpty(); //dödar programmet när saldot är 0.
        }
        System.out.println("Would you like to play again?");
        if (inputTwo.nextLine().equalsIgnoreCase("yes")) {
            cupsGame();
        }
    }
}

