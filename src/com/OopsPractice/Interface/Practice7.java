package com.OopsPractice.Interface;

interface CourseAction{
    void enrollStudent(String studentName);

    double calculateFee();
}

class ProgrammingCourse implements CourseAction{
    double courseFee = 5000;

    @Override
    public void enrollStudent(String studentName) {
        System.out.println("Student " + studentName + " enrolled in programming Course ");
    }

    @Override
    public double calculateFee(){
        return courseFee;
    }
}

class DataScienceCourse implements CourseAction{
    double courseFee = 8000;
    @Override
    public void enrollStudent(String studentName) {
        System.out.println("Student " + studentName + " enrolled in Data SCience Course ");
    }

    @Override
    public double calculateFee(){
        return (courseFee + (courseFee * 18)/ 100);
    }
}

public class Practice7 {
    public static void main (String[] args){
         CourseAction course ;
         course = new ProgrammingCourse();
         course.enrollStudent("Rahul");
        System.out.println("Course Fee : " + course.calculateFee());

        System.out.println("-----".repeat(2));

        course = new DataScienceCourse();
        course.enrollStudent("Aman");
        System.out.println("Course Fee : " + course.calculateFee());
    }
}
