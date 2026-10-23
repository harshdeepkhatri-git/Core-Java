package com.OopsPractice.Abstraction;

abstract class VehicleRental{
    String vehicleName;
    double pricePerDay;

    VehicleRental(String vehicleName, double pricePerDay){
        this.vehicleName = vehicleName;
        this.pricePerDay = pricePerDay;
    }

    abstract double calculateRentalCost(int days);

    abstract void startRental();

    void displayVehicle(){
        System.out.println("Vehicle Name: "+ vehicleName);
        System.out.println("Price Per Day: "+ pricePerDay);
    }
}

class CarRental extends VehicleRental{
    CarRental(String vehicleName, double pricePerDay){
        super(vehicleName, pricePerDay);
    }

    @Override
    double calculateRentalCost(int days){
        return (pricePerDay * days) + (((pricePerDay * days) * 10 )/100);
    }

    @Override
    void startRental(){
        System.out.println("Car rental started !!");
    }
}

class BikeRental extends VehicleRental{
    BikeRental(String vehicleName, double pricePerDay){
        super(vehicleName, pricePerDay);
    }

    @Override
    double calculateRentalCost(int days){
        return (pricePerDay * days) + 100;
    }

    @Override
    void startRental(){
        System.out.println("Bike rental started !!");
    }
}


public class Task13 {
    public static void main(String [] args){
         VehicleRental vehicle = new CarRental("Honda City", 2000);
         vehicle.displayVehicle();
         vehicle.startRental();
         System.out.println("Final Rental Cost: " + vehicle.calculateRentalCost(3));

        System.out.println("===".repeat(8));

        vehicle = new BikeRental("Royal Enfield", 800);
        vehicle.displayVehicle();
        vehicle.startRental();
        System.out.println("Final Rental Cost: "+ vehicle.calculateRentalCost(2));

    }
}
