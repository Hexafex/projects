import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.*;

public class TripPlanner {
    public static void main(String[] args){
        Greetings();
        System.out.println("--------------");

        TravelTimeBudget();
        System.out.println("--------------");

        TimeDiff();
        System.out.println("--------------");

        CountryArea();
        System.out.println("--------------");
    }

    public static void Greetings() {
        System.out.println("Welcome to Vacation Planner!");
        Scanner input = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name =input.nextLine();
        System.out.print("Nice to meet you "+name+", Where are you travelling to? ");
        String location =input.nextLine();
        System.out.println("Great! "+location+" sounds like a great trip");

    }
    public static void TravelTimeBudget(){
        //use for conversion
        int hours = 24;
        int minutes = hours*60;

        Scanner input = new Scanner(System.in);
        System.out.print("How many days are you going to spend travelling? ");
        int days = input.nextInt();
        System.out.print("How much money, in USD, are you planing to spend on your trip? ");
        double cash =input.nextDouble();
        System.out.print("What is the three letter currency symbol for your travel destination? ");
        String currencyCode =input.next();
        System.out.print("How many " + currencyCode + " are there in 1 USD? ");
        double conversionRate =input.nextDouble();
        System.out.println("If you are travelling for " +days+ " days that is the same as " +(days*hours)+" hours or "+(days*minutes)+" minutes.");
        System.out.println("If you are going to spend  $"+cash+" that means per day you can spend up to $"+(cash/days)+" USD");
        System.out.println("Your total budget in "+currencyCode+" is "+cash*conversionRate+" "+currencyCode+" which per day is "+((cash*conversionRate)/days)+" "+currencyCode);

    }
    public static void TimeDiff(){
        //working code
        //time calculations
        Scanner input = new Scanner(System.in);
        System.out.print("What is the time difference, in hours, between your home and your destination? ");
        //user input time diff
        double diffInTime = input.nextDouble();

        //getting the hours from user
        double timeDestMid = (24 + diffInTime)%24;
        double timeDestNoon = (12 + diffInTime)%24;
        int hourDestMid =(int) timeDestMid;
        int hourDestNoon =(int) timeDestNoon;

        //getting the minutes from user
        double minutesMidnight =  (timeDestMid- hourDestMid)*60 ;
        double minutesNoon =   (timeDestNoon - hourDestNoon)*60;

        //change minutes back to int
        int newMinsMid = (int)minutesMidnight;
        int newMinsNoon = (int)minutesNoon;

        //print result back to user
        System.out.println("That means that when it is midnight at home it will be " + hourDestMid +":"+newMinsMid + " in your travel destination");
        System.out.println("and when it is noon at home it will be " +hourDestNoon+ ":"+ newMinsNoon );


        //testing other method
      /* //setting the time for midnight and noon
        LocalTime localTimeMidnight = LocalTime.of(0,0);
        LocalTime localTimeNoon = LocalTime.of(12,0);
        // user input time difference
        double timeDiff=input.nextDouble();
        //conversions for time
        double time= timeDiff*3600*1000;
        long hrs= (long)time;



        //destination time calculations
          LocalTime DestMidnight =localTimeMidnight.plusNanos(hrs);
          LocalTime DestinationNoon=localTimeNoon.plusNanos(hrs);

         SimpleDateFormat sdf=new SimpleDateFormat("HH:mm");

        String formattedTime = sdf.format(DestMidnight);
        System.out.println(formattedTime);

        System.out.println("That means that when it is midnight at home it will be " + DestMidnight + " in your travel destination");
        System.out.println("and when it is noon at home it will be " +DestinationNoon );*/


    }
    public static void CountryArea(){
        Scanner input = new Scanner(System.in);
        System.out.print("What is the square area of your destination country? " );
        double DestAreaKm = input.nextDouble();
        double DestAreaMiles= DestAreaKm*0.621371;
        System.out.println("In miles that is "+ DestAreaMiles);
    }
}
