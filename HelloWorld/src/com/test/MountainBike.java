package com.test;

public class MountainBike extends Bicycle {
    public int gear;

    public MountainBike(String initColor, Double initSpeed, int initGear) {
        super(initColor,initSpeed);
        gear = initGear;

    }

    @Override
    public void speedUp(double increment) {
        super.speedUp(increment);
    }

    @Override
    public void applyBrake(double decrement) {
        //super.applyBrake(decrement);
        speed = speed -(decrement * 2);
    }
}
