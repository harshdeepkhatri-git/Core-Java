package com.OopsPractice.Inheritance;

class Vehicle{
    String brand;
    int speed;

    void displayVehicle(){
        System.out.println("Brand: "+ brand);
        System.out.println("Speed: "+ speed);
    }


}

class Car extends Vehicle{
    String fuelType;

    Car(String brand, int speed, String fuelType){
        this.brand = brand;
        this.speed = speed;
        this.fuelType = fuelType;
    }
    void displayCar(){

        System.out.println("Fuel Type: "+ fuelType);
    }
}

public class Practice1 {
    public static void main(String[] args){
        Car c = new Car("Toyota", 120, "Petrol");

        c.displayVehicle();
        c.displayCar();


    }
}
