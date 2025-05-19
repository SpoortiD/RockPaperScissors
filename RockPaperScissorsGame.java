import java.util.Scanner;
import java.util.Random;

public class RockPaperScissorsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] gameImage = {
            """
                _______
            ---'   ____)
                  (_____)
                  (_____)
                  (____)
            ---.__(___)
            """,

            """
                 _______
            ---'    ____)____
                       ______)
                      _______)
                     _______)
            ---.__________)
            """,

            """
                _______
            ---'   ____)____
                      ______)
                   __________)
                  (____)
            ---.__(___)
            """
        };

        boolean shouldContinue = true;

        System.out.println("***** Rock Paper Scissors *****");
        while (shouldContinue) 
        {
            System.out.print("Type 0 for Rock, 1 for Paper or 2 for Scissors \nEnter your choice: ");
            int userChoice = scanner.nextInt();
            scanner.nextLine();

            if (userChoice < 0 || userChoice > 2) 
            {
                System.out.println("You have entered the wrong choice. ");
                System.out.println();
                continue;
            } 
            else 
            {
                System.out.println("Your choice is:\n" + gameImage[userChoice]);
            }

            int compChoice = random.nextInt(3);
            System.out.println("Computer choice is:\n" + gameImage[compChoice]);

            if ((userChoice == 0 && compChoice == 1) || (userChoice == 1 && compChoice == 2) || (userChoice == 2 && compChoice == 0)) 
            {
                System.out.println("You lose");
            } 
            else if (userChoice == compChoice) 
            {
                System.out.println("Draw");
            } 
            else 
            {
                System.out.println("You win");
            }

            boolean restartInvalid = true;
            while (restartInvalid) 
            {
                System.out.print("Play again? yes or no: ");
                String restart = scanner.nextLine().toLowerCase();

                if (restart.equals("yes")) 
                {
                    System.out.println();
                    shouldContinue = true;
                    restartInvalid = false;
                } 
                else if (restart.equals("no")) 
                {
                    System.out.println("***** Game ends *****");
                    shouldContinue = false;
                    restartInvalid = false;
                } 
                else 
                {
                    System.out.println("Invalid. Type 'yes' or 'no'");
                }
            }
        }

        scanner.close();
    }
}


