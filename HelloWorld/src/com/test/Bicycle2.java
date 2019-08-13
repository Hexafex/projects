package com.test;

public class Bicycle2 {
    private String color;
    private Double speed;
//creating your own class
    public Bicycle2(String initColor, Double initSpeed){
        color=initColor;
        speed=initSpeed;
    }
    public void applyBrake(double decrement)
    {
        speed -= decrement;
    }

    public void speedUp(double increment)
    {
        speed += increment;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }
}