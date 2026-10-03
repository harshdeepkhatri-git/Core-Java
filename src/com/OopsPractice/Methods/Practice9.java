package com.OopsPractice.Methods;

import java.util.Scanner;

class Employee1{
    Scanner sc = new Scanner(System.in);
    String name ;
    double salary;

    void takeDetails(){
        System.out.println("Enter your name: ");
        name = sc.nextLine();

        System.out.println("Enter your salary: ");
        salary = sc.nextDouble();
    }

    void calculateBonus(){
        System.out.println("Name : "+ name);
        System.out.println("Salary : "+ salary);

       double bonus =0;

        if(salary >= 50000 ){
            bonus =  (salary*10)/100;
        }
        else{
            bonus = (salary*5)/100;
        }

        System.out.println("Bonus : "+ bonus);
        System.out.println("Final Salary : "+ (salary + bonus) );
    }

}


public class Practice9 {
    public static void main(String[] args){
        Employee1 emp = new Employee1();
        emp.takeDetails();
        emp.calculateBonus();
    }
}
