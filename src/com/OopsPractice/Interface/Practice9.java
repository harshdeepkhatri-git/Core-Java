package com.OopsPractice.Interface;

interface BonusCalculator{
    void setPerformanceRating(int rating);
    double calculateBonus();

}

class FullTimeEmployee implements BonusCalculator{
    double baseSalary;
    int rating;

    FullTimeEmployee(double baseSalary){
        this.baseSalary = baseSalary;
    }

    @Override
    public void setPerformanceRating(int rating){
        this.rating = rating;
    }

    @Override
    public double calculateBonus(){
         if (rating == 5){
             return (baseSalary * 20 )/100;
         }
         else if (rating == 4){
             return (baseSalary * 15 )/100;
         }
         else {
             return (baseSalary * 5 )/100;
         }
    }
}

class PartTimeEmployee implements BonusCalculator{
    double baseSalary;
    int rating;
    PartTimeEmployee(double baseSalary){
        this.baseSalary = baseSalary;
    }
    @Override
    public void setPerformanceRating(int rating){
        this.rating = rating;
    }
    @Override
    public double calculateBonus(){
        if (rating == 5){
            return (baseSalary * 10 )/100;
        }
        else if (rating == 4){
            return (baseSalary * 7 )/100;
        }
        else {
            return (baseSalary * 2 )/100;
        }
    }
}


public class Practice9 {
    public static void main(String[] args) {
        BonusCalculator bonus = new FullTimeEmployee(50000);
        bonus.setPerformanceRating(5);
        System.out.println("Full Time Employee Bonus : " + bonus.calculateBonus());

        bonus = new PartTimeEmployee(20000);
        bonus.setPerformanceRating(4);
        System.out.println("Part Time Employee Bonus : " + bonus.calculateBonus());
    }
}
