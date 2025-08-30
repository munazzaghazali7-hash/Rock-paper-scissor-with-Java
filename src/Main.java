import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] options = {"rock", "paper", "scissor"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";


        do{
        System.out.println("Enter your move (rock, paper, scissor)");
        playerChoice = scanner.nextLine().toLowerCase();


            if (!playerChoice.equals("rock") &&
                    !playerChoice.equals("paper") &&
                    !playerChoice.equals("scissor")) {
                System.out.println("Invalid Input");
                continue;
            }

            computerChoice = options[random.nextInt(3)];
            System.out.println("Computer's choice " + computerChoice);

            if (playerChoice.equals(computerChoice)) {
                System.out.println("It's a tie!");
            } else if (playerChoice.equals("rock") && computerChoice.equals("scissor")
                    || playerChoice.equals("paper") && computerChoice.equals("rock") ||
                    playerChoice.equals("scissor") && computerChoice.equals("paper")) {
                System.out.println("YOU WIN!");
            } else {
                System.out.println("YOU LOSE!");
            }
            System.out.println("Play again (yes/no)");
            playAgain = scanner.nextLine().toLowerCase();
        } while (playAgain.equals("yes"));

        System.out.println("Thanks for playing!");

        scanner.close();
    }

}

