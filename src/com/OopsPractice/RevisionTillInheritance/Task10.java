package com.OopsPractice.RevisionTillInheritance;


class Course{
    String courseName;
    double courseFee;

    Course(String courseName, double courseFee){
        this.courseName = courseName;
        this.courseFee = courseFee;
    }

    void displayCourse(){
        System.out.println("Course Name : " + courseName);
        System.out.println("Course Price : " + courseFee);
    }
}

class OnlineCourse extends Course{
    double platformFee;
     OnlineCourse(String CourseName, double CourseFee, double PlatformFee){
         super(CourseName, CourseFee);
         this.platformFee = PlatformFee;
     }

    @Override
        void displayCourse(){
         System.out.println("Name: "+ courseName);
         System.out.println("Price : "+ courseFee);
         System.out.println("Platform Fee : "+ platformFee);
         System.out.println("Final Fee: "+ calculateFinalFee());
    }

         double calculateFinalFee() {

         return courseFee + platformFee;
    }
}

public class Task10 {
    public static void main(String [] args){
        OnlineCourse online = new OnlineCourse("Java Programming", 5000, 500);
        online.displayCourse();

    }
}
