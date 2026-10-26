package com.OopsPractice.Challenge;

public class Manag extends Employes{
   private int teamSize;
    private double perEmployeeAllowance;

    public Manag(int employeId, String name, double baseSalary,  int teamSize, double perEmployeeAllowance){
        super(employeId, name, baseSalary);
        if (teamSize >= 0){
            this.teamSize = teamSize;
        }
        else {
            throw new IllegalArgumentException("Invalid Team Size !!");
        }
        if (perEmployeeAllowance >= 0){
            this.perEmployeeAllowance = perEmployeeAllowance;
        }
        else {
            throw new IllegalArgumentException("Invalid Employee Allowance !!");
        }
    }

    @Override
    public String getRole(){
        return "Manager";
    }

    @Override
    public double calculateBonus(double baseSalary){
        return baseSalary * 25 / 100;
    }

    @Override
    public double calculateAllowance(){
        return teamSize * perEmployeeAllowance;
    }

    @Override
   public void performWork(){
        System.out.println("Managing Team !! ");
    }

    @Override
    public void displayExtraDetails(){
        System.out.println("Team Size: "+ teamSize);
        System.out.println("Allowance per Employee: "+ perEmployeeAllowance);
    }
}
