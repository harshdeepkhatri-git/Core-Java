package com.OopsPractice.Interface;

interface RentalService{
    void rentVehicle(int days);
    double calculateRent();
}

class CarRental implements RentalService{
     double dailyRent;
     int days;

     CarRental(double dailyRent){
         this.dailyRent = dailyRent;

     }

     @Override
     public void rentVehicle(int days){
         this.days = days;
         System.out.println("Car rented for " + days + " days");
     }

    @Override
    public double calculateRent() {
        return dailyRent * days;
    }

}

class BikeRental implements RentalService{
     double dailyRent;
     int days;

     BikeRental(double dailyRent){
         this.dailyRent = dailyRent;
     }
     @Override
     public void rentVehicle(int days){
         this.days = days;
         System.out.println("Bike rented for " + days + " days");
     }
     @Override
     public double calculateRent(){
         if ((days > 5)){
             return (dailyRent * days) - (((dailyRent * days) * 5)/100);
         }
         else {
             return dailyRent * days;
         }
     }
}

public class Practice8 {
    public static void main(String[] args){
        RentalService rent ;
        rent = new CarRental(2000);
        rent.rentVehicle(3);
        System.out.println("Total Car Rental: "+ rent.calculateRent());

        rent = new BikeRental(800);
        rent.rentVehicle(7);
        System.out.println("Total Bike Rental: "+ rent.calculateRent());
    }
}
