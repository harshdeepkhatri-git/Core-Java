package com.OopsPractice.Interface;

//Q11 — Smart Home Management System

interface PowerControl{
    void turnOn();
    void turnOff();
}

interface EnergyMonitor{
    double calculateEnergy(int hours);
}

class SmartBulb implements PowerControl,  EnergyMonitor{
    double bulbPower;

    SmartBulb(double bulbPower){
        this.bulbPower = bulbPower;
    }

   @Override
    public void turnOn(){
        System.out.println("Smart Bulb is ON !!");
   }

   @Override
    public void turnOff(){
        System.out.println("Smart Bulb is OFF !!");
   }

   @Override
    public double calculateEnergy(int hours){
        return (bulbPower * hours) / 1000;
   }
}

class SmartAc implements PowerControl,  EnergyMonitor{
    double acPower;
    SmartAc(double acPower){
        this.acPower = acPower;
    }

    @Override
    public void turnOn(){
        System.out.println("Smart Ac is ON !!");
    }

    @Override
    public void turnOff(){
        System.out.println("Smart Ac is OFF !!");
    }

    @Override
    public double calculateEnergy(int hours){
        return (acPower * hours) / 1000;
    }
}

public class Practice11 {
      public  static void main(String [] args){
//         SmartBulb bulb = new SmartBulb(20);
//         SmartAc ac = new SmartAc(1500);

         PowerControl pc ;
         EnergyMonitor em ;


         pc = new SmartBulb(20);
         em = (EnergyMonitor) pc;
         pc.turnOn();
         pc.turnOff();
         System.out.println("Smart Bulb Energy Consumption: " + em.calculateEnergy(10) + " kwh ");
          System.out.println("--------------");

          pc = new SmartAc(1500);
          em = (EnergyMonitor) pc;
          pc.turnOn();
          pc.turnOff();
          System.out.println("Smart AC Energy Consumption: " + em.calculateEnergy(8) + " kwh ");



    }
}
