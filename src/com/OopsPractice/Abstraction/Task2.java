package com.OopsPractice.Abstraction;

abstract class Vehical{
    abstract void start();

    void stop(){
        System.out.println("Vehicle is stopping");
    }
}

class Bike extends Vehical{

    @Override
    void start(){
        System.out.println("Bike is starting");
    }
}

public class Task2 {
    public static void main(String [] args){
       Bike b = new Bike();
       b.start();
       b.stop();
    }
}
