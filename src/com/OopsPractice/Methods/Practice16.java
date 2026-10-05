package com.OopsPractice.Methods;

import java.util.Scanner;

class Employ{

    double calculateAnnualSalary(double monthlySalary){
        double annualsalary = monthlySalary*12;

        return annualsalary;
    }

    double calculateTax(double annualSalary){
        double tax = 0;
           if(annualSalary>= 600000){
               tax += (annualSalary*10)/100;
           }
           else{
               tax += (annualSalary*5)/100;
           }
        return tax;
    }

}

public class Practice16 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Employ emp = new Employ();

        System.out.println("Enter the your monthly Salary: ");
        double monthlySalary = sc.nextDouble();

         double AnnualSalary = emp.calculateAnnualSalary(monthlySalary);
         double Tax = emp.calculateTax(AnnualSalary);

         System.out.println("Annual Salary: "+ AnnualSalary);
         System.out.println("Tax: "+ Tax);
    }
}
