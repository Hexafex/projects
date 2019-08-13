public class Parameters {
    public static void main(String[] args) {
        cookieMix(6);
        gameTitlesIOwned(78);
        TestParam(5000,"satu je");
        double distance =(int) 10.998;// the (int) force the value that comes after it to conform to its rules(casting)
        kMToMi(distance);
    }
    //order of params must be correct as well for eg
    // in main method the TestParam distance is int, the method order called must be proper or it will not work
    public static void gameTitlesIOwned(int gameTitlesOwned) {
        System.out.println("you own "+ gameTitlesOwned + " games as of today!");
    }

    public static void cookieMix ( int cupOfSugar) {
        System.out.println("add " + cupOfSugar + " cups of sugar");
    }
    public static void TestParam(double distance, String pantat){
        System.out.println("the distance travelled is "+distance+" Km");
        System.out.println("kau ade "+pantat+ " pantat");
    }
    //km to miles the value inside the() must be of the same data type as the on in main
    public static void kMToMi(double distance){
        distance*=10;
        System.out.println("the distance multiplied by 10 is " +distance+"!");
    }
}// parameter scope is like variable... only local to the method