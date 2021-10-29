import java.util.Scanner;

public class Casino {

    int row;
    int col;
    Scanner input;


    public static void intro() { //metod för första delen av spelet. här välkomnas spelaren och lite data om användaren lagras.
        Scanner input = new Scanner(System.in); //scanner för input av användaren
        int minAge = 21; //minimumålder för att spela på casinot

        //välkomnar spelaren och samlar info.
        System.out.println("A warm welcome to the KYH Casino!");
        System.out.println("Please answer these questions before you enter the casino floor");
        System.out.println("What's your name? ");
        String name = input.nextLine();
        System.out.println("How old are you? Remember you have to be at least 21 to gamble at our Casino.");
        int age = input.nextInt(); //lagrar användarens ålder i age

        if (age >= minAge) { //loop kollar ifall åldern är större än eller samma som minimumåldern. printar i så fall ett välkomstmeddelande
            System.out.print("Welcome, " + name + ". Please enter the amount of money you would like to have at hand: ");
            System.out.println("Your account have been charged with: $" + getCredit());
        } else {
            System.out.println("Unfortunately you are too young to enter. You are welcome back in " + (minAge - age) + " years.");
        }
    }
        //metod för att lagra hur mycket pengar användaren vill kunna spela för.
    public static double getCredit(){
        Scanner input = new Scanner(System.in);
            return input.nextDouble();
    }


    public void updatePlayerPosition(String direction){ //kan jag ändra så att jag kan skriva "bar" "craps" osv utan att det blir för mycket huvudvärk??

        // Kolla efter riktning
        if(direction.equalsIgnoreCase("up")) {
            row--;
            // Kontrollera så vi inte hamnar utanför kartan
            if(row < 0) {
                row = 0;
            }
        }
        else if(direction.equalsIgnoreCase("down")) {
            row++;
            if(row >= map.length) {
                row--;
            }
        }
        else if(direction.equalsIgnoreCase("right")) {
            col++;
            if(col >= map[row].length) {
                col--;
            }
        }
        else if(direction.equalsIgnoreCase("left")) {
            col--;
            if(col < 0) {
                col = 0;
            }
        }

    }

    private String[] userInput(){
        System.out.print("> ");
        String command = input.nextLine();

        // 3. Dela upp kommandot i delar, varje ord blir en sträng i en array
        //    Vi delar upp det inmatade värdet vid varje mellanslag
        String[] commandParts = command.split(" ");
        return commandParts;
    }

    public void theGame(){
        System.out.println("This is the Casino floor, here you have a variety of options - such as a bar, a game of craps and a game of The Shell Game.");
        boolean running = true;
        while (running) {
            String[] commandParts = userInput();
            String command = commandParts[0];

            if (command == "go to") { //vill ändra så att kommandot är go to istället för bara "go". hur?
                if (commandParts.length >= 2) {
                    updatePlayerPosition(commandParts[1]);
                    System.out.println("Going to the " + /* nånting */  " table.");
                } else {
                    System.out.println("You can't move without a designated destination.");
                }
            } else if (command == "save") {
                save(row, col);
            } else if (command == "load") {
                LoadSavedGame();
            } else if (command == "quit") {
                running = false;
            }
        }

    }

}
