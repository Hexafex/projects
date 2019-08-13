public class MysteryProgram {
   /* public static void mystery(String foo, String bar, String zazz) {

        System.out.println(zazz + " and " + foo + " like " + bar);

    }

    public static void main(String[] args) {

        String foo = "peanuts";

        String bar = "foo";

        mystery(bar, foo, "John");

    }*/
   public static void main(String[] args) {
       smallest(2,9,2);
   }
   public static int smallest(int a, int b, int c) {
       return Math.min(Math.min(a, b), c);
   }
}
