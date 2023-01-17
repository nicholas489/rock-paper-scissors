import java.util.*;
public class rockPaperScissors {
    public static void main (String[] args) throws InterruptedException {
        System.out.println("Rock Paper Scissors Game");
        System.out.println("(Enter \"End\" if you wish to end the game)");
        // Creates the Scanner object needed for receiving user inputs
        Scanner sc = new Scanner(System.in);
        // Creates the Random object that will choose the Computer's choice
        Random rand = new Random();
        // An array/string of all options that can be selected
        String choicesStr = "Rock     Scissors Paper";
        String[] choicesArr = {"Rock", "Scissors", "Paper"};
        // Variable to ensure the random number selected doesn't exceed the indices of choices
        int upperBound = 3;
        // while loop to make the game endless, if the user chooses
        while (true) {
            // Reads the choice made by the user
            String userChoice = sc.nextLine();
            // If the user inputs "End", the game ends
            if (userChoice.equals("End")) {
                break;
            }
            // Makes the selection for the computer by choosing a random index from choicesArr
            String computerChoice = choicesArr[rand.nextInt(upperBound)];
            // Temporarily stops running code for 1000 ms (1s)
            Thread.sleep(1000);
            // Prints out the selection done by the computer
            System.out.println(computerChoice);
            Thread.sleep(1000);
            // If userChoice and computerChoice are the same, they tied
            if (userChoice.equals(computerChoice)) {
                System.out.println("You tied!");
            }
            else if (choicesStr.indexOf(userChoice) + 9 == choicesStr.indexOf(computerChoice) || userChoice.equals("Paper") && computerChoice.equals("Rock")) {
                System.out.println("You win!");
            }
            else if (choicesStr.indexOf(userChoice) - 9 == choicesStr.indexOf(computerChoice) || userChoice.equals("Rock") && computerChoice.equals("Paper")) {
                System.out.println("You lose!");
            }
            // If no one wins, loses or ties, then we know that bad input was used by the user
            else {
                throw new IllegalArgumentException("Bad input! Please rerun this program");
            }
        }
        sc.close();
    }
}
