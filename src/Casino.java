import java.util.Scanner;

public class Casino {
        int choice;
        boolean running = true;
        Scanner input = new Scanner(System.in);
        Character character = new Character();
        Bar bar = new Bar(character);
        Cups cups = new Cups(character);
        Dice dice = new Dice(character);


    public void intro() { //metod för första delen av spelet. här välkomnas spelaren och lite data om användaren lagras.
        int minAge = 21; //minimumålder för att spela på casinot

        //välkomnar spelaren och samlar info.
        System.out.println("A warm welcome to the KYH Casino!");
        System.out.println("Please answer these questions before you enter the casino floor");
        System.out.print("What's your name? ");
        character.setName(input.nextLine());
        System.out.print("How old are you? Remember you have to be at least 21 to gamble at our Casino :");
        character.setAge(input.nextInt()); //lagrar användarens ålder i age

        //loop kollar ifall åldern är större än eller samma som minimumåldern. printar i så fall ett välkomstmeddelande
        if (character.getAge() >= minAge) {
            System.out.print("Welcome, " + character.getName() + ". Please enter the amount of money you would like to have at hand: ");
            character.setWallet(input.nextInt());
            System.out.println("Your account have been charged with: $" + character.getWallet());
        } else {
            System.out.println("Unfortunately you are too young to enter. You are welcome back in " + (minAge - character.getAge()) + " years.");
        }
        for (int i = 0; i < 10; ++i) System.out.println(); //"clearar" consolen för snyggare program.
    }

    public void mainMenu(){
            while(running){
            System.out.println("Where would you like to go?");
            System.out.println("1. The bar");
            System.out.println("2. The cups table");
            System.out.println("3. The dice table");
            System.out.println("4. Leave the game.");

            choice = input.nextInt();
            switch (choice) {
                case 1 -> bar.barMenu();
                case 2 -> cups.cupsGame();
                case 3 -> dice.diceGame();
                default -> running = false;
            }if (running == false){
            quit();}
            }
    }

    public static void quit(){
        System.out.println("Thanks for playing the casino game. Hope to see you again soon.");
    }
}
