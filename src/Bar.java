import java.util.Scanner;

public class Bar{

    double tip;
    private static double PriceOfItem;
    private static double orderTotal;
    double mainOrder = 0.0;
    int menuChoice;
    double cost;
    static boolean ordering = true;
    double totalSum;
    //static int menuItem = 0;
    int choice;
    String order;
    Scanner input = new Scanner(System.in);
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
            }
            else if(input.nextLine().equalsIgnoreCase("no")){
            }
            System.out.println("Fair enough. I will escort you to the dice table instead.");
            }                                                                                    
    public void placingOrder(){
        barMenu();
        while (ordering) {
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
        System.out.println("Your new balance is: " + (character.wallet));



       // System.out.println(credit);



    }
    private void totalSum(double cost){
        this.totalSum += cost;
    }

        /*
    public void makingOrder(){ //lagrar beställningen från användaren
        double orderTotal = 0;
        int menuItem = 0;
        int menuChoice;
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the bar, would you like to see the menu?");
        while (ordering){
            barMenu();
            menuChoice = input.nextInt();
            switch (menuChoice){
                case 1:
                    menuItem = 1;
                    orderTotal += order(menuItem);
                    break;
                case 2:
                    menuItem = 2;
                    orderTotal += order(menuItem);
                    break;
                case 3:
                    menuItem = 3;
                    orderTotal += order(menuItem);
                    break;
                case 4:
                    menuItem = 4;
                    orderTotal += order(menuItem);
                    break;
                case 5:
                    menuItem = 5;
                    orderTotal += order(menuItem);
                    break;
                case 6:
                    finished (mainOrder);
                    break;
                default:
                    System.out.println("Invalid input.");
            }
        }
        System.out.println("The total is: $" + mainOrder);
        //return mainOrder;
    }

    public static double quantity() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter quantity");
        double quantity = input.nextDouble();
        totalAmount(quantity, priceOfItem);
        return quantity;
    }


    public double order(int menuItem){
        if (menuItem == 1){ //draft beer
            System.out.println("Good choice, you've ordered a draft beer.");
            PriceOfItem = 5.50;
        }
        if (menuItem == 2){ //red wine
            System.out.println("Great! A glass of red wine coming right up.");
            PriceOfItem = 4.50;
        }
        if (menuItem == 3){ //white wine
            System.out.println("Marvelous, a glass of chilled white wine will be with you shortly.");
            PriceOfItem = 4.50;
        }
        if (menuItem == 4){ //cocktail
            System.out.println("My personal favourite! Here's your cocktail my friend.");
            PriceOfItem = 7.00;
        }
        if (menuItem == 5){ //non alch cocktail
            System.out.println("Designated driver? I like it. Here's your drink.");
            PriceOfItem = 4.50;
        } return mainOrder;
    }

   public static double totalAmount(double quantity, double priceOfItem){
        double totalAmount = quantity * priceOfItem;
       System.out.println("Total amount is: $" + totalAmount);
       mainOrder = totalAmount;

    }

    public static void finished(double orderTotal) {
        ordering = false;
        System.out.println("Thank you for stopping by, enjoy your drinks my friend.");
    }
 */
}
