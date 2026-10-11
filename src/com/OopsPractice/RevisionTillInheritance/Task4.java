package com.OopsPractice.RevisionTillInheritance;


class RentalVehicle{
    String brand;
    long rentperday;

    RentalVehicle(String brand, long rentperday){
        this.brand = brand;
        this.rentperday = rentperday;
    }

    long calculateRent(int days){
        return rentperday * days;
    }
}
class LuxuryCar extends RentalVehicle{

    LuxuryCar(String brand, long rentperday){
        super(brand, rentperday);
    }

    @Override
    long calculateRent(int days){
        return rentperday * days + 2000;
    }

    void displayDetails(int days){
        System.out.println("Brand : "+ brand);
        System.out.println("Total Rent: "+ calculateRent(days));
    }
}

public class Task4 {
    public static void main(String [] args){
        LuxuryCar lux = new LuxuryCar("BMW", 3000);
        lux.displayDetails(3);
//  System.out.println("Total Rent: " + lux.calculateRent(3));

//        both ways are correct.

    }
}
