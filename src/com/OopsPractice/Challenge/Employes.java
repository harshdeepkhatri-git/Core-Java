package com.OopsPractice.Challenge;

interface BonusPolicy{
    double calculateBonus(double baseSalary);
}

public abstract class Employes implements BonusPolicy{
   protected int employeId;
   protected String name;
   protected double baseSalary;

   public Employes(int employeId, String name, double baseSalary){
        if (employeId > 0 ){
            this.employeId = employeId;
        }
        else {
            throw new IllegalArgumentException("Invalid Employe Id !!");
        }

        if (name == null || name.isBlank()){
            throw new IllegalArgumentException("Invalid Employe Name !!");
        }
        else {
            this.name = name;
        }

        if (baseSalary > 0){
            this.baseSalary = baseSalary;
        }
        else {
            throw new IllegalArgumentException("Invalid Base Salary !!");
        }
    }

    public abstract String getRole();
    public abstract double calculateAllowance();
    public abstract void performWork();
    public abstract void displayExtraDetails();

    void displayDetails(){
        System.out.println("Employe Id: " + this.employeId);
        System.out.println("Employe Name: " + this.name);
        System.out.println("Role: "+ getRole());
        System.out.println("Base Salary: " + this.baseSalary);
    }
    public double calculateSalary(){
        return baseSalary + calculateBonus(baseSalary) + calculateAllowance();
    }

    public void generateSalarySlip(){
        displayDetails();
        performWork();
        displayExtraDetails();
        System.out.println("Bonus: " + calculateBonus(baseSalary));
        System.out.println("Allowance: " + calculateAllowance());
        System.out.println("Final Salary: " + calculateSalary());

    }

}


