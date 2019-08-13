package com.test;

public class Test {

        public static void main(String[] args) {
            //Bicycle bc = new Bicycle("RED", 5.0);
            Bicycle2 bc = new Bicycle2("RED", 5.0);
            //display inital value
            System.out.println(bc.getColor());
            System.out.println(bc.getSpeed());

            //display speed after speed up
            bc.speedUp(5.0);
            System.out.println(bc.getSpeed());

            //display speed after apply break
            bc.applyBrake(1.0);
            System.out.println(bc.getSpeed());

            //initiate new
            MountainBike mb= new MountainBike("BLUE",10.0, 5);
            System.out.println(mb.color);
            System.out.println(mb.speed);
            System.out.println(mb.gear);
        }
    }