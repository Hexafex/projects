import java.util.Scanner;

public class SwtichCase {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a command: ");
        String text =input.nextLine();
        switch(text){
            case "start":
                System.out.println("Machine started!");
            case"stop":
                System.out.println("Machine stopped");
                break;
            default:
                System.out.println("Command not recognised");
        }
    }
}
