import java.util.Random;
import java.util.Scanner;
public class BattleShips {
    public static void main(String[] args) {
        //coordinates for ships
        int x = 0;
        int y = 0;
        String w = "0123456789";
        System.out.println("********WELCOME TO BATTLE SHIPS********\n");
        System.out.println("The sea is empty for now.\n");
        String ocean[][] = new String[10][10];
        System.out.println("  " + w + "  ");
        for (x = 0; x < ocean.length; x++) {

            System.out.print(x + "|");

            for (y = 0; y < ocean[x].length; y++) {

                if (ocean[x][y] == null) {
                    ocean[x][y] = " ";
                    System.out.print(" ");
                } else {
                    System.out.print(ocean[x][y]);
                }
            }
            System.out.println("|" + x);
        }
        System.out.println("  " + w + "  \n\n");
        int yourShips = 5;
        int computerShips = 5;

        for (int initShips = 0; initShips < yourShips; initShips++) {

            System.out.println("You have " + (yourShips - initShips) + " ships to place");

            System.out.print("Please enter your No" + (initShips + 1) + " ship X coordinates: ");
            Scanner input = new Scanner(System.in);
            int shipx = input.nextInt();

            //capture user ship coord
            while (shipx >= x || shipx < 0) {
                System.out.print("Please enter your No" + (initShips + 1) + " ship X coordinates: ");
                shipx = input.nextInt();
            }
            System.out.print("Please enter your No" + (initShips + 1) + " ship Y coordinates: ");
            int shipy = input.nextInt();
            System.out.println("Ship No" + (initShips + 1) + " has been placed.\n");

            while (shipy >= y || shipy < 0) {
                System.out.print("Please enter your No" + (initShips + 1) + " ship Y coordinates: ");
                shipy = input.nextInt();
                System.out.println("Ship No" + (initShips + 1) + " has been placed.\n");
            }
            while (ocean[shipx][shipy].equals("@")) {
                System.out.println("There is already a ship there. Choose another location");
                System.out.print("Please enter your No" + (initShips + 1) + " ship X coordinates: ");
                shipx = input.nextInt();
                System.out.print("Please enter your No" + (initShips + 1) + " ship Y coordinates: ");
                shipy = input.nextInt();
                System.out.println("Ship No" + (initShips + 1) + " has been placed.\n");
            }
            //storing user ship coords to array
            ocean[shipx][shipy] = "@";
        }
        System.out.println("\nComputer is deploying ships\n");
        //computer ships
        for (int initShips = 0; initShips < computerShips; initShips++) {

            Random rand = new Random();
            int comx = rand.nextInt(10);
            int comy = rand.nextInt(10);

            while (ocean[comx][comy].equals("@")) {
                comx = rand.nextInt(10);
                comy = rand.nextInt(10);
            }
            //storing comp ship coords to array
            ocean[comx][comy] = "!";
            System.out.println("Computer ship No" + (initShips + 1) + " has been placed.");

        }
        System.out.println("----------------------------\n");
        while (yourShips > 0 && computerShips > 0) {
            //show map for game
            System.out.println("  " + w + "  ");
            for (x = 0; x < ocean.length; x++) {

                System.out.print(x + "|");

                for (y = 0; y < ocean[x].length; y++) {

                    if (ocean[x][y].equals("!")) {
                        ocean[x][y] = " ";
                        System.out.print(" ");
                    } else {
                        System.out.print(ocean[x][y]);
                    }
                }
                System.out.println("|" + x);
            }
            System.out.println("  " + w + "  \n\n");

            //ATTACK COORDS


            Scanner input = new Scanner(System.in);
            System.out.print("Enter X coordinates: ");
            int attackX = input.nextInt();

            while (attackX > 9 || attackX < 0) {

                System.out.print("Enter X coordinates: ");
                attackX = input.nextInt();

            }
            System.out.print("Enter Y coordinates: ");
            int attackY = input.nextInt();

            while (attackY > 9 || attackY < 0) {

                System.out.print("Enter Y coordinates: ");
                attackY = input.nextInt();
            }
            while (ocean[attackX][attackY].equals("X") || ocean[attackX][attackY].equals("-")) {
                System.out.print("You have already hit that spot, choose another location\nEnter X coordinates: ");
                attackX = input.nextInt();
                System.out.print("Enter Y coordinates: ");
                attackY = input.nextInt();
            }
            if (ocean[attackX][attackY].equals("!")) {
                computerShips--;
                System.out.println("You have sunk that Computer's ship!");
                //System.out.println("Your Ships: "+yourShips+"|"+"Computer Ships: "+computerShips);
                //System.out.println("----------------------------\n");
            } else if (ocean[attackX][attackY].equals("@")) {
                yourShips--;
                System.out.println("You sunk your own ship!");
               // System.out.println("Your Ships: "+yourShips+"|"+"Computer Ships: "+computerShips);
               // System.out.println("----------------------------\n");
            } else {
                System.out.println("You missed!");
                ocean[attackX][attackY] = "-";
            }
            ocean[attackX][attackY] = "X";

            Random rand = new Random();
            int cattackX = rand.nextInt(10);
            int cattackY = rand.nextInt(10);
            while (ocean[cattackX][cattackY].equals("X") || ocean[cattackX][cattackY].equals("-")) {

                cattackX = rand.nextInt(10);

                cattackY = rand.nextInt(10);
            }
            if (ocean[cattackX][cattackY].equals("@")) {
                yourShips--;
                System.out.println("Computer has sunk your ship!");
                System.out.println("Your Ships: "+yourShips+"|"+"Computer Ships: "+computerShips);
                System.out.println("----------------------------\n");
            } else if (ocean[cattackX][cattackY].equals("!")) {
                computerShips--;
                System.out.println("Computer sunk his own ship!");
                System.out.println("Your Ships: "+yourShips+"|"+"Computer Ships: "+computerShips);
                System.out.println("----------------------------\n");

            } else {

                System.out.println("Computer missed!");
                System.out.println("Your Ships: "+yourShips+"|"+"Computer Ships: "+computerShips);
                System.out.println("----------------------------\n");
                ocean[cattackX][cattackY] = "-";
            }
            ocean[cattackX][cattackY] = "X";


        }if (yourShips==0 || computerShips==0) {
            System.out.println("  " + w + "  ");
            for (x = 0; x < ocean.length; x++) {

                System.out.print(x + "|");

                for (y = 0; y < ocean[x].length; y++) {

                    if (ocean[x][y] == null) {
                        ocean[x][y] = " ";
                        System.out.print(" ");
                    } else {
                        System.out.print(ocean[x][y]);
                    }
                }
                System.out.println("|" + x);
            }
            System.out.println("  " + w + "  \n");


            if (yourShips==0){
                System.out.println("The computer has won the battle! Better luck next time!");
            }else{
                System.out.println("Hooray you win the battle!");
            }
        }
    }
}


