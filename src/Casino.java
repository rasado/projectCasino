import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Casino {

    int row;
    int col;
    Scanner input;
    Layout[][] map;


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
            System.out.println("Your account have been charged with: $" + credit());
        } else {
            System.out.println("Unfortunately you are too young to enter. You are welcome back in " + (minAge - age) + " years.");
        }
    }
        //metod för att lagra hur mycket pengar användaren vill kunna spela för.
    public static double credit(){
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

            if (command == "go") { //vill ändra så att kommandot är go to istället för bara "go". hur?
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
    public static void save(int row, int col) {
        File file = new File("./save/saved_game.txt");
        try {
            FileWriter fileWriter = new FileWriter(file);
            String position = String.format("%d, %d", row, col);
            fileWriter.write(position);
            fileWriter.close();
            System.out.println("Your game is saved");
        } catch (IOException e) {
            System.out.println("The game could not be saved.");
        }
    }

    public static String load() {
        File file = new File("./save/saved_game.txt");
        try {
            Scanner fileScanner = new Scanner(file);
            String position = fileScanner.nextLine();
            fileScanner.close();
            return position;
        } catch (FileNotFoundException e) {
            System.out.println("Could not load a saved game");
        }
        return null;
    }

    private void LoadSavedGame() {
        String position = load();
        if(position != null) {
            String[] pos = position.split(", ");
            int oldRow = row;
            int oldCol = col;
            row = Integer.parseInt(pos[0]);
            col = Integer.parseInt(pos[1]);
            if(row >= map.length) {
                System.out.println("Error reading row coordinates from file. Are you cheating?");
                row = oldRow;
                col = oldCol;
            }
            else {
                if(col >= map[row].length) {
                    System.out.println("Error reading row coordinates from file. Are you cheating?");
                    row = oldRow;
                    col = oldCol;
                }
            }
        }
    }

    public void quit(){
        System.out.println("Thanks for playing the casino game. Hope to see you again soon.");
    }

}
