import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Bar {

    double cost;
    static boolean ordering = true;
    double totalSum;
    int choice;
    Scanner input = new Scanner(System.in);
    Scanner inputTwo = new Scanner (System.in);
    //Casino casino = new Casino();
    Character character;

    public Bar(Character character) {
        this.character = character;
    }

    public void barMenu(){
        System.out.println("Welcome to the bar. Would you like to see the menu?");
        if (input.nextLine().equalsIgnoreCase("yes")){
            System.out.println("____________________________________");
            System.out.println("|          KYH CASINO BAR          |");
            System.out.println("|__________________________________|");
            System.out.println("| 1. Draft Beer             $5.50  |");
            System.out.println("| 2. Red Wine (glass)       $4.50  |");
            System.out.println("| 3. White Wine (glass)     $4.50  |");
            System.out.println("| 4. Cocktail               $7.00  |");
            System.out.println("| 5. Non-Alcoholic Cocktail $4.50  |");
            System.out.println("| 6. Finished the order            |");
            System.out.println("|__________________________________|");
            placingOrder();
            } else if(input.nextLine().equalsIgnoreCase("no")){
               // casino.mainMenu();
            }
    }

    public void placingOrder(){
        while (ordering) { //loopenkörs så länge ordering är sann
            System.out.println(cost + " is taken from your credit.");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    cost = 5.50;
                    character.decreaseWallet(cost);
                    totalSum(cost);
                    break;
                case 2:
                    cost = 4.50;
                    character.decreaseWallet(cost);
                    totalSum(cost);
                    break;
                case 3:
                    cost = 4.50;
                    character.decreaseWallet(cost);
                    totalSum(cost);
                    break;
                case 4:
                    cost = 7;
                    character.decreaseWallet(cost);
                    totalSum(cost);
                    break;
                case 5:
                    cost = 4.50;
                    character.decreaseWallet(cost);
                    totalSum(cost);
                    break;
                case 6:
                    ordering = false;
                    break;
                default:
                    System.out.println("Incorrect input.");
            }
        }
        System.out.println("We have withdrawn $" + totalSum + " from your total credit.");
        System.out.println("Your balance is: " + (character.wallet));
        if (character.wallet == 0){
            character.walletEmpty();
        }
        System.out.println();
        System.out.println("Would you like your receipt? Y/N");
        String answer = inputTwo.nextLine();
        if (answer.equalsIgnoreCase("y")){
            receipt(cost);
        }
    }
    private void totalSum(double cost){
        this.totalSum += cost;
    }

   public static void receipt(double cost){
        File file = new File("./Text/receipt.txt");
        try{
            FileWriter fileWriter = new FileWriter(file);
            String text = String.format("d", cost);
            fileWriter.write(text);
            fileWriter.close();
            System.out.println("Your receipt is saved.");
        } catch(IOException e){
            System.out.println("Unfortunately the receipt machine just broke down.");
        }
    }

}
