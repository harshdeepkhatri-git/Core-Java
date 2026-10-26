package com.OopsPractice.Abstraction;

import com.OopsPractice.Challenge.Employes;

public class Testers extends Employes {
    private int bugFound;
    private double rewardPerBug;

    public Testers(int employeId, String name, double baseSalary, int bugFound, double rewardPerBug){
        super(employeId, name, baseSalary);
        if (bugFound >= 0){
            this.bugFound = bugFound;
        }
        else {
            throw new IllegalArgumentException("Invalid Bug Found !!");
        }

        if (rewardPerBug >= 0){
            this.rewardPerBug = rewardPerBug;
        }
        else {
            throw new IllegalArgumentException("Invalid Reward Per Bug !!");
        }
    }

    @Override
    public String getRole(){
        return "Tester";
    }

    @Override
    public double calculateBonus(double baseSalary){
        return baseSalary * 10 / 100;
    }

    @Override
    public double calculateAllowance(){
        return bugFound * rewardPerBug;
    }

    @Override
    public void performWork(){
        System.out.println("Testing Software !! ");
    }

    @Override
    public void displayExtraDetails(){
        System.out.println("Bug Found: " + bugFound);
        System.out.println("Reward Per Bug: "+ rewardPerBug);
    }
}
