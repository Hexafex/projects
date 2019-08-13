import java.util.Scanner;
public class FractionCalculator {
    public static void main(String[] args) {
        getIntro();
        getFraction();
    }
    public static void getIntro() {
        System.out.println("this is a program calculator.");
        System.out.println("It will add,subtract,multiply and divide fractions until you type Q to quit.");
        System.out.println("Please enter your fractions in the form of  a/b, where a and b are integers.");
    }
    private static String getOperation() {
        Scanner input = new Scanner(System.in);
        String operation;
        System.out.println("----------------------------------------------------------------------------");
        System.out.print("Please enter an operation (+,-,/,*,= or Q to quit): ");
        operation = input.nextLine();
        if (operation.equals("Q") || operation.equals("q")) {
            System.exit(0);
        }
        while (!(operation.equals("+") || operation.equals("-") || operation.equals("/") || operation.equals("*") || operation.equals("="))) {
            System.out.print("Invalid input (+,-,/,*,= or Q to quit): ");
            operation = input.nextLine();

            if (operation.equals("Q") || operation.equals("q")) {
                System.exit(0);
            }

        }
        return operation;
    }
    public static Fraction validFraction(String fraction) {

        Fraction fr = null;
        if (fraction.contains("/")) {
            String fractStore[] = fraction.split("/");
            String topNumS = fractStore[0];
            String btmNumS = fractStore[1];
            int topnum = Integer.parseInt(fractStore[0]);
            int btmnum = Integer.parseInt(fractStore[1]);
            fr = new Fraction(topnum, btmnum);

        } else if (!(fraction.contains("/"))) {

            fr = new Fraction(Integer.parseInt(fraction));


        } else if(fraction.contains("")) {
            fr= new Fraction();

        }else if(fraction.contains(" ")){
            System.out.print("Invalid fraction.");

        }else{System.out.print("Invalid fraction.");}

        return fr;
    }
    public  static void getFraction() {
        int x =0;
        while ( x==0){
     Scanner input1 = new Scanner(System.in);
        String operation = getOperation();
            System.out.print("Please enter fraction(a/b) or integer(a): ");
            String firstFract = input1.nextLine();
            while (firstFract.matches("[a-zA-Z]")){
                System.out.print("Invalid input.Please enter (a/b) or integer(a) where a and b are integers and b is not zero: ");
                firstFract = input1.nextLine();
            }
            Fraction fr1=validFraction(firstFract);

            System.out.print("Please enter fraction(a/b) or integer(b): ");
            String secondFract = input1.nextLine();
            while (secondFract.matches("[a-zA-Z]")||secondFract.startsWith("0")){

                System.out.print("Invalid input.Please enter (a/b) or integer(b) where a and b are integers and b is not zero: ");
                secondFract = input1.nextLine();
            }
            Fraction fr2=validFraction(secondFract);

            //Fraction calc
            if (operation.equals("+")) {
                Fraction result = fr1.add(fr2);
                Fraction printResult = result.toLowestTerms();
                System.out.println(firstFract + " " +operation + " " +secondFract + " = " +printResult.toString());

            }else if (operation.equals("-")) {
                Fraction result = fr1.subtract(fr2);
                if(result.getNumerator()==0){
                    System.out.println(firstFract+" " +operation+" " +secondFract+" = 0" );
                    getFraction();
                }else {
                    Fraction printResult = result.toLowestTerms();
                    System.out.println(firstFract + " " + operation + " " + secondFract + " = " + printResult.toString());
                }
            }else if (operation.equals("*")) {
                Fraction result = fr1.multiply(fr2);
                if (result.equals("0")||secondFract.equals("0")){
                    System.out.println(firstFract+" " +operation+" " +secondFract+" = 0" );
                    getFraction();
                }
                Fraction printResult = result.toLowestTerms();
                System.out.println(firstFract + " " +operation +" " + secondFract + " = " + printResult.toString());

            }else if (operation.equals("/")) {
                Fraction result = fr1.divide(fr2);
                if (firstFract.equals("0")){
                    System.out.println(firstFract+" " +operation+" " +secondFract+" = 0" );
                    getFraction();
                }
                Fraction printResult = result.toLowestTerms();
                System.out.println(firstFract + " " +operation +" " + secondFract + " = " + printResult.toString());

            }else if (operation.equals("=")) {
                Boolean result = fr1.equals(fr2);
                System.out.println(firstFract + " " +operation +" " + secondFract + " = " + result.toString());

            }
        }

    }
}