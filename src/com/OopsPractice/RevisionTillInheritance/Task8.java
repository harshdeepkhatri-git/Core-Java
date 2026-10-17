package com.OopsPractice.RevisionTillInheritance;


class VehicalQ8{
    String brand;
    double rentalPrice;


    VehicalQ8(String brand, double rentalPrice){
        this.brand = brand;
        this.rentalPrice = rentalPrice;

    }

    void displayInfo(){
        System.out.println("Brand: "+ brand);
        System.out.println("Rental price: "+ rentalPrice);
    }
}

class CarQ8 extends VehicalQ8{
    int seatingCapacity;
    CarQ8(String brand, double rentalPrice, int seatingCapacity){
        super(brand, rentalPrice);
        this.seatingCapacity = seatingCapacity;
    }

    @Override
    void displayInfo(){
        System.out.println("Brand: "+ brand);
        System.out.println("Rental Price: "+ rentalPrice);
        System.out.println("Seating capacity: "+ seatingCapacity);
    }

    double calculateRentalCost(int days){

        return rentalPrice * days;
    }
}

public class Task8 {
    public static void main(String [] args){

        CarQ8 car = new CarQ8("Toyota", 2500, 5);
        car.displayInfo();
        System.out.println("Total Rent : "+ car.calculateRentalCost(3));
    }
}
