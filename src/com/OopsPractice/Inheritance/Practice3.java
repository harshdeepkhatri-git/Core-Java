package com.OopsPractice.Inheritance;


class Vehical{
    String brand;
    int speed;


    Vehical (String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    void displayVehicle(){
        System.out.println("Brand: "+ brand);
        System.out.println("Speed: "+ speed);
    }

}

class Carr extends Vehical{
    String fuelType;

    Carr(String brand, int speed, String fuelType){
        super(brand, speed);
        this.fuelType = fuelType;


    }

    void displayCar(){
        System.out.println("Fuel Type: "+ fuelType);

    }

}

public class Practice3 {
    public static void main(String [] args){
        Carr c = new Carr("Toyota", 120, "Petrol");
        c.displayVehicle();
        c.displayCar();
    }
}
