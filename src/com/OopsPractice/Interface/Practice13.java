package com.OopsPractice.Interface;

// Parent Interface
interface ContentAccessQ13 {
    void accessContent();

    String getCourseName();
}

// Child Interface
interface ProgressTrackingQ13 extends ContentAccessQ13 {
    double calculateProgress(int completedLessons, int totalLessons);
}

// Java Course
class JavaCourseQ13 implements ProgressTrackingQ13 {

    String courseName;

    JavaCourseQ13(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public void accessContent() {
        System.out.println("Java Course Content Accessed");
    }

    @Override
    public String getCourseName() {
        return courseName;
    }

    @Override
    public double calculateProgress(int completedLessons, int totalLessons) {
        return (completedLessons * 100.0) / totalLessons;
    }
}

// Python Course
class PythonCourseQ13 implements ProgressTrackingQ13 {

    String courseName;

    PythonCourseQ13(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public void accessContent() {
        System.out.println("Python Course Content Accessed");
    }

    @Override
    public String getCourseName() {
        return courseName;
    }

    @Override
    public double calculateProgress(int completedLessons, int totalLessons) {
        return (completedLessons * 100.0) / totalLessons;
    }
}

// Main Class
public class Practice13 {

    public static void main(String[] args) {

        ProgressTrackingQ13 course;

        // Java Course
        course = new JavaCourseQ13("Java Full Stack");

        System.out.println("Course Name: " + course.getCourseName());
        course.accessContent();

        System.out.println("Course Progress: "
                + course.calculateProgress(8, 10) + "%");

        System.out.println("--------------------");

        // Python Course
        course = new PythonCourseQ13("Python Programming");

        System.out.println("Course Name: " + course.getCourseName());
        course.accessContent();

        System.out.println("Course Progress: "
                + course.calculateProgress(6, 12) + "%");
    }
}