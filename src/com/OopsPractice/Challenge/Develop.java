package com.OopsPractice.Challenge;

public class Develop extends Employes{
    private int completedProjects;
    private double projectReward;

  public Develop(int employeID, String name, double baseSalary, int completedProjects, double projectReward){
        super(employeID, name, baseSalary);
        if (completedProjects >= 0){
            this.completedProjects = completedProjects;
        }
        else {
            throw new IllegalArgumentException("Invalid Completed Projects !!");
        }

        if (projectReward >= 0){
            this.projectReward = projectReward;
        }
        else {
            throw new IllegalArgumentException("Invalid Project Reward !!");
        }
    }

    @Override
    public String getRole(){
        return "Developer";
    }

    @Override
    public double calculateBonus(double baseSalary){
        return baseSalary * 15 / 100;
    }

    @Override
    public  double calculateAllowance(){
        return completedProjects * projectReward;
    }

    @Override
      public void performWork(){
        System.out.println("Developing Software !! ");
    }

    @Override
     public  void displayExtraDetails(){
        System.out.println("Number Of Completed Projects: "+ completedProjects);
        System.out.println("Rewards per project: "+ projectReward);
    }
}
