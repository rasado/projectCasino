import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("DEVELOPMENT BRANCH");

        Scanner input = new Scanner(System.in);
        int minAge = 21;

        String[][] layout = { {"Dices", "Blackjack"},
                              {"Entrance", "Roulette"}
        };

        System.out.println("A warm welcome to the KYH Casino!");
        System.out.println("Please answer these questions before you enter the casino floor");
        System.out.println("What's your name? ");
        String name = input.nextLine();
        System.out.println("How old are you? Remember you have to be at least 21 to gamble at our Casino.");
        int age = input.nextInt();

        if (age >= minAge){
            System.out.println("We have a maximum deposit policy of $500.00, for your own good. \nPlease enter your gambling limit: ");
            double money = input.nextDouble();
            if (money <= 500.00 && money > 0){
                System.out.println("We have now charged your account with $" + money + ", please enjoy your visit.");
            }else{
                System.out.println("Invalid deposit.");
            }
        }else{
            System.out.println("Unfortunately you are too young to enter. You are welcome back in " + (minAge - age) + " years.");
        }

    }
}
