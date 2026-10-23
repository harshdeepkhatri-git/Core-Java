package com.OopsPractice.Abstraction;

abstract class HospitalEmployee{
    int employeeId;
    String name;
    double baseSalary;

    HospitalEmployee(int employeeId, String name, double baseSalary){
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    abstract double calculateAllowance();

    abstract String getRole();

    abstract double calculateSalary();

    abstract void performDuties();

    abstract double calculateBonus();

    void displayDetails(){
        System.out.println("Employee Id: "+ employeeId);
        System.out.println("Employee Name: "+ name);
        System.out.println("Role: "+ getRole());
        System.out.println("Base Salary: "+ baseSalary);
    }

    void generateSalarySlip(){
        displayDetails();

    }
}

class Doctor extends HospitalEmployee{
    double consultationFee;
    Doctor(int employeeId, String name, double baseSalary, double consultationFee) {
        super(employeeId, name, baseSalary);
        this.consultationFee = consultationFee;
    }

    @Override
    double calculateBonus(){
        return baseSalary *20 /100;
    }

    @Override
    double calculateSalary(){
        return (baseSalary + calculateBonus() + consultationFee);
    }

    @Override
    void performDuties(){
        System.out.println("Duties: Treating patients !!");
    }
    @Override
    String getRole(){
        return "Doctor";
    }
    @Override
    double calculateAllowance(){
        return consultationFee;
    }

    @Override
    void generateSalarySlip(){
        displayDetails();
        performDuties();
        System.out.println("Bonus: "+ calculateBonus());
        System.out.println("Consultation fee: "+ calculateAllowance());
        System.out.println("Final Salary: "+ calculateSalary());
    }
}

class Nurse extends HospitalEmployee{
    int nightShifts;
    Nurse(int employeeId, String name, double baseSalary, int nightShifts){
        super(employeeId, name, baseSalary);
        this.nightShifts = nightShifts;
    }

    @Override
    double calculateBonus(){
        return baseSalary * 10 / 100;
    }

    @Override
    double calculateSalary(){
        return (baseSalary + calculateBonus() + calculateAllowance());
    }

    @Override
    void performDuties(){
        System.out.println("Duties: Taking care of patients");
    }

    @Override
    String getRole(){
        return "Nurse";
    }

    @Override
    double calculateAllowance(){
        return nightShifts * 500;
    }

    @Override
    void generateSalarySlip(){
        displayDetails();
        performDuties();
        System.out.println("Bonus: "+ calculateBonus());
        System.out.println("Night Shifts: "+ nightShifts);
        System.out.println("Night Shift Allowance: "+ calculateAllowance());
        System.out.println("Final Salary: "+ calculateSalary());
    }
}

class Surgeon extends HospitalEmployee{
    int surgeries;
    Surgeon(int employeeId, String name, double baseSalary, int surgeries){
        super(employeeId, name, baseSalary);
        this.surgeries = surgeries;
    }

    @Override
    double calculateBonus(){
        return baseSalary  * 25 / 100;
    }

    @Override
    double calculateSalary(){
        return (baseSalary + calculateBonus() + calculateAllowance());
    }

    @Override
    void performDuties(){
        System.out.println("Duties: Performing Surgeries !!");
    }

    @Override
    String getRole(){
        return "Surgeon";
    }

    @Override
    double calculateAllowance(){
        return surgeries * 2000;
    }

    @Override
    void generateSalarySlip(){
        displayDetails();
        performDuties();
        System.out.println("Bonus: "+ calculateBonus());
        System.out.println("Surgeries: "+ surgeries);
        System.out.println("Surgery Allowance: "+ calculateAllowance());
        System.out.println("Final Salary: "+ calculateSalary());
    }
}

public class ChallengeTask {
    public static void main(String [] args){
        HospitalEmployee [] employee = {new Doctor(101, "Rahul", 80000, 5000),
              new Nurse(102, "Priya", 40000, 8),
                new Surgeon(103, "Amit", 100000, 5)};

        double totalExpense = 0;
        for(HospitalEmployee emp :  employee){
            emp.generateSalarySlip();
            totalExpense += emp.calculateSalary();
            System.out.println("====". repeat(9));
        }
        System.out.println("Total Hospital Salary Expense: "+ totalExpense);
    }
}
