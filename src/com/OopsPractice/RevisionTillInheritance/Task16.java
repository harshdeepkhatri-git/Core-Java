package com.OopsPractice.RevisionTillInheritance;

class Studentes{
    String name;
    int marks;

    Studentes(String name, int marks){
        this.name = name;
        this.marks = marks;
    }

    double calculateScholarship(){
        return 0;
    }

    void displayDetails(){
        System.out.println("Student name :" + name);
        System.out.println("Student marks: "+ marks);
    }
}

class MeritStudent extends Studentes{
    double familyIncome;

    MeritStudent(String name, int marks, double familyIncome){
        super(name,marks);
        this.familyIncome = familyIncome;
    }


    @Override
    double calculateScholarship(){

     double schoolarShip = 0;
        if(marks >= 85 && familyIncome <= 300000){
            schoolarShip = 20000;
            return schoolarShip;
        }
        else {
            return schoolarShip;
        }
    }

    @Override
    void displayDetails(){
        super.displayDetails();
        System.out.println("Family Income :" + familyIncome);
        System.out.println("Schoolarship : " + calculateScholarship());
    }
}

class SportStudent extends Studentes{
    String  sportLevels ;

    SportStudent(String name, int marks, String  sportLevels){
        super(name,marks);
        this.sportLevels = sportLevels;
    }

    @Override
    double calculateScholarship(){
        double schoolarShip = 0;
        if (sportLevels.equalsIgnoreCase("National")){
            schoolarShip = 15000;
            return schoolarShip;
        } else if (sportLevels.equalsIgnoreCase("State")) {
            schoolarShip = 8000;
            return schoolarShip;
        }
        else {
            return 0;
        }
    }
    @Override
    void displayDetails(){
        super.displayDetails();
        System.out.println("Sport Levels :" + sportLevels);
        System.out.println("Schoolarship : " + calculateScholarship());
    }

}


public class Task16 {
    public static void main(String [] args) {
        MeritStudent ms = new MeritStudent("Harsh", 92, 250000);
        System.out.println("-----Merit Student Details -----");
        ms.displayDetails();
        System.out.println("=====".repeat(6));

        SportStudent stu = new SportStudent("Rahul", 75, "national");
        System.out.println("-----Sports Student Details -----");
        stu.displayDetails();
    }
}
