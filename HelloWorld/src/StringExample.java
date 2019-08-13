public class StringExample {

    public static void main (String []args){

        String original = "abcde";
        //will keep running loop until the expression is satisfied
        for (int i =0;i<original.length(); i++) {
            System.out.println("the character at index "+i+"is "+original.charAt(i));
        }
    }
}
