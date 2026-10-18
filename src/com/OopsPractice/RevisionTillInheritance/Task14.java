package com.OopsPractice.RevisionTillInheritance;


class LibraryMember{
    String memberName;
    int daysLate;

    LibraryMember(String memberName, int daysLate){
        this.memberName = memberName;
        this.daysLate = daysLate;
    }

    double calculateFine(){
        return 0;
    }

    void displayDetails(){
        System.out.println("Member Name: "+ memberName);
        System.out.println("Days Late: "+ daysLate);
    }
}

 class Students extends LibraryMember{
    int finePerDay = 2;

    Students (String memberName, int daysLate){
        super(memberName, daysLate);
    }

    @Override
     double calculateFine(){
        int fine = 0;
        if (daysLate > 0){
           fine  = daysLate * finePerDay;
            return fine;
        }
        else{
            return 0;
        }
    }

    @Override
     void displayDetails(){
        System.out.println("Student details: ");
        super.displayDetails();
        System.out.println("Fine: " + calculateFine());
    }
 }

 class FacultyMember extends LibraryMember{
    int finePerDay = 1;
    FacultyMember(String memberName, int daysLate){
        super(memberName, daysLate);
    }

    @Override

     double calculateFine(){
        int fine = 0;
         if(daysLate > 0){
             fine = daysLate * finePerDay;
             return fine;
         }
         else{
             return 0;
         }
    }

    @Override
     void displayDetails(){
        System.out.println("Faculty Details: ");
         super.displayDetails();
         System.out.println("Fine: " + calculateFine());
    }
 }

public class Task14 {
    public static void main(String [] args){
        Students stu = new Students ("Harsh", 8);
        FacultyMember fm = new FacultyMember("Amit", 8);

        stu.displayDetails();
        System.out.println("=*=*=*".repeat(5));
        fm.displayDetails();
    }
}
