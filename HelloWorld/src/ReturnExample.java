public class ReturnExample {

    public static void main(String[]args){
        int x= 20;
        System.out.println(x);
        x=change(6);//this is to capture the returned value at method call
        System.out.println("this value "+x+" is equals from the method change(int value) since x = change()");

    }
    /*void means no return since now i want it to return change it to the data type that you want
    you can only return 1 data type
     */
    public static int change(int value) {
        value*=12.5;
        return value;
    }
}
