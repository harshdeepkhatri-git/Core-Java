package com.OopsPractice.Interface;

//Question 3 — Smart Home Device System

interface SmartDevice{
    void turnon();
    void turnoff();
}

class SmartLight implements SmartDevice{
    @Override
    public void turnon(){
        System.out.println("Smart Light is ON");
    }

    @Override
    public void turnoff(){
        System.out.println("Smart Light is OFF");
    }

}

class SmartFan implements SmartDevice{

    @Override
    public void turnon() {
        System.out.println("Smart Fan is ON");
    }

    @Override
    public void turnoff() {
        System.out.println("Smart Fan is OFF");
    }
}

public class Practice3 {
    public static void main(String [] args){
        SmartDevice device;

        device = new SmartLight();
        device.turnon();
        device.turnoff();

        device = new SmartFan();
        device.turnon();
        device.turnoff();

    }
}