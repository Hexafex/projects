import java.util.*;

public class OddsAndEvens {
    public static  void main(String[] args) {
        //intro
        System.out.println("Let's play a game called \"Odds and Evens\"");
        System.out.print("What is your name? ");
        Scanner input = new Scanner(System.in);
        String name = input.next();
        System.out.print("Hi " + name + ", which do you choose? (O)dds or (E)vens: ");
        String choice = "";
        while (!choice.equals("O") && !choice.equals("E")) {
            choice = input.next();
            if (choice.equals("O")) {
                System.out.println(name + " have chosen Odds! The computer will be Evens!");
            } else if (choice.equals("E")) {
                System.out.println(name + " have chosen Evens! The computer will be Odds!");
            } else {
                System.out.print("Which do you choose? (O)dds or (E)vens?");
            }
        }
        System.out.println("--------------------------------\n");

        //game
        System.out.print("How many fingers do you put out? ");
        int fingers = input.nextInt();

            Random rand = new Random();
            int computer = rand.nextInt(6);
            System.out.println("The computer has chosen " + computer + " \"fingers\"");

            //calculation to determine odds or evens
            int result = (fingers + computer);
            System.out.println(fingers + " +" + computer + " = " + (result));
            if (result % 2 == 0) {

                System.out.println(result + " ... is Even!");
                if (choice.equals("E")) {
                    System.out.println( "That means "+ name + " wins!");
                } else {
                    System.out.println("Computer wins!");
                }
            } else if(result%2!=0){
                System.out.println(result + " ... is Odd!");
                if(choice.equals("O")){
                    System.out.println( "That means "+  name+ " wins!");
                }else
                    System.out.println("Computer wins!");

            }
        System.out.println("--------------------------------\n");

        }

    }

