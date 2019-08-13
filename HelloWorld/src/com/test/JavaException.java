package com.test;
public class JavaException {
    public  static  void main(String[] args){
        try {
            System.out.println(divide(2, 5));
            System.out.println(divide(0, 5));
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            //e.printStackTrace();
        }
    }
    public static double divide(int divisor, int dividend) throws Exception{
        if (divisor == 0) {
            throw new Exception("Division by Zero");
        }
        double result =dividend/divisor;
        return result;
    }


}
