package com.OopsPractice.Abstraction;

abstract class Appliance{
    String brand;
    double power;

    Appliance(String brand, double power){
        this.brand = brand;
        this.power = power;
    }

    abstract void turnOn();

    abstract double calculatePower(int hours);

    void displayInfo(){
        System.out.println("Brand : "+ brand);
        System.out.println("Power: "+ power + " W ");

    }
}

class WashingMachine extends Appliance{
    WashingMachine(String brand, double power){
        super(brand, power);
    }

    @Override
    void turnOn(){
        System.out.println("Washing machine is ON ");
    }

    @Override
    double calculatePower(int hours) {
        return power * hours;
    }
}

class Fan extends Appliance{
    Fan(String brand, double power){
        super(brand, power);
    }

    @Override
    void turnOn(){
        System.out.println("Fan is ON ");
    }

    @Override
    double calculatePower(int hours){
        return power * hours;
    }
}

public class Task9 {
    public static void main(String [] args){
        Appliance app = new WashingMachine("LG", 500.0);
        app.displayInfo();
        app.turnOn();
        System.out.println("Power Consumption: "+ app.calculatePower(4) + " Wh ");

        System.out.println("===".repeat(5));

        app = new Fan("Usha", 75.0);
        app.displayInfo();
        app.turnOn();
        System.out.println("Power Consumption: " +  app.calculatePower(4) + " Wh ");



    }
}
