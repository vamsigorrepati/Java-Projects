import java.util.Scanner;
import java.util.Random;
public class RockPaperSiccsor {
    public static void main(String[] args){
        String ComputerInput = "Nothing";
        System.out.println("\n\t\t\tWelcome To Vamsi's Rock Paper Scissors Game");
        System.out.println("Please Select an input either Rock, Paper, Scissors or R, P, S");
        int playervalue = 0;
        int random;
        int count = 0;
        String answer = "yes";
        while (answer.equalsIgnoreCase("Yes") || answer.equalsIgnoreCase("Y")){
            if (count > 0) { 
                System.out.println("\nInput your Choice\n");  
            }
            count ++;
            do {
                Random number = new Random();
                random = number.nextInt(3)+1;
                if (random == 1) 
                    ComputerInput = "Rock"; 
                else if (random == 2) 
                    ComputerInput = "Paper"; 
                else if (random == 3) 
                    ComputerInput = "Scissors"; 

                Scanner scan = new Scanner(System.in);
                String question = scan.nextLine();
                String userInput = "Nothing";

                if (question.equalsIgnoreCase("Rock") || question.equalsIgnoreCase("R")) {
                    playervalue = 1;
                    userInput = "Rock";
                }
                else if (question.equalsIgnoreCase("Paper") || question.equalsIgnoreCase("P")){
                    playervalue = 2;
                    userInput = "Paper";
                }
                else if (question.equalsIgnoreCase("Scissors") || question.equalsIgnoreCase("S")){
                    playervalue = 3;
                    userInput = "Scissors";
                }

                if (playervalue == random){
                    System.out.println("Draw");    
                    System.out.println("Computer: " + ComputerInput + " vs " + "User: " + userInput);
                    System.out.println("Since it is a draw insert another input");
                    System.out.println();
                }
                else if (playervalue == 1 && random == 3) {
                    System.out.println("You Win"); 
                    System.out.println("Computer: " + ComputerInput + " vs " + "User: " + userInput);
                    System.out.println();
                }
                else if (playervalue == 1 && random == 2) {
                    System.out.println("You Lose"); 
                    System.out.println("Computer: " + ComputerInput + " vs " + "User: " + userInput);
                    System.out.println();
                }
                else if (playervalue == 2 && random == 1) {
                    System.out.println("You Win"); 
                    System.out.println("Computer: " + ComputerInput + " vs " + "User: " + userInput);
                    System.out.println();
                }
                else if (playervalue == 2 && random == 3) {
                    System.out.println("You Lose"); 
                    System.out.println("Computer: " + ComputerInput + " vs " + "User: " + userInput);
                    System.out.println();
                }
                else if (playervalue == 3 && random == 1) {
                    System.out.println("You Lose"); 
                    System.out.println("Computer: " + ComputerInput + " vs " + "User: " + userInput);
                    System.out.println();
                }
                else if (playervalue == 3 && random == 2) {
                    System.out.println("You Win"); 
                    System.out.println("Computer: " + ComputerInput + " vs " + "User: " + userInput);
                    System.out.println();
                }

            }
            while (playervalue == random);

            System.out.println("Do you want to play again");
            Scanner again = new Scanner(System.in);
            answer = again.nextLine();
        }
        System.out.println("\nThank you for playing");
    }
}


