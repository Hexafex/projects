import java.util.Scanner;

/**
 * This is a very simple Hello World application
 */
public class HelloWorld {
    /**
     *this is the main method
     * @param args - an array of string values
     */
    public static void main(String[] args) {
        System.out.println("Hello World");
        //this is a single line comment for humans to read
        /*now this is for multiline comments
        also for humans to read hehehhe
         */
        System.out.println("sup  boiii");
        // it is recommended to write comments so the reader knows what the hell you writing this code for
        System.out.print("test1\ntest2\ntest3\n");
        System.out.print("hey ");
        System.out.print("what's up");
        System.out.print(" doc");
        System.out.println("!");
        MethodNew();
        // Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Supp mah nigg!");
        String stringname = input.nextLine();
        System.out.println(stringname + " " + "boiii");
        // End of Scanner
        // Variable Testing
        String test = "test text";
        System.out.println(test);
        int number = 3;
        System.out.println(number);
        /* to edit the Variable don't need to use DataType DataTypeName
        just assign the DataTypeName a new value
         */
        number = 100;
        System.out.println(number);
        //End of Variable Testing
        //Concatenation Testing and Math Testing
        System.out.println(number + test);
        System.out.println(test + number);
        double number2 = 5.5;
        System.out.println(number * number2);

        //End of Concatenation and Math Testing
        //Casting tryouts
        System.out.println((double)(1+4));
        System.out.println((int)(1.0+4.0));
        System.out.println((int)(99+2.3345));

    }

    /**
     * This is a method that prints "hello world with method"
     */
    public static void MethodNew(){
        System.out.println("hello world with method");
    }
}
