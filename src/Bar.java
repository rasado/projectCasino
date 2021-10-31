import java.util.Scanner;

public class Bar {

    double tip;
    private static double PriceOfItem;
    private static double orderTotal;
    static double mainOrder = 0.0;
    static int menuChoice;
    static boolean ordering = true;
    static int menuItem = 0;



    public static void barMenu(){

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the bar, would you like to see the menu?");
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
            makingOrder();
        }
    }

    public static double makingOrder(){ //lagrar beställningen från användaren
        Scanner input = new Scanner(System.in);

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
                    finished (orderTotal);
                    break;
                default:
                    System.out.println("Invalid input.");
            }
        }
        System.out.println("The total is: $" + orderTotal);
        return orderTotal;
    }


    public static double order(int menuItem){
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

    public static double totalOrder(double priceOfItem){

    }

    public static void finished(double orderTotal) {
        ordering = false;
        System.out.println("Thank you for stopping by, enjoy your drinks my friend.");
    }

}
