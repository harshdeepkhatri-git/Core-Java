package com.OopsPractice.Abstraction;

abstract class Employ{
    int employId;
    String name;
    double baseSalary;

    Employ(int employId, String name, double baseSalary){
        this.employId = employId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    abstract String getRole();

    abstract double calculateBonus();

    abstract double calculateAllowance();

    abstract double calculateSalary();

    abstract void performWork();

    abstract void displayExtraDetails();

    void displayDetails(){
        System.out.println("Employee Id: "+ employId);
        System.out.println("Name: "+ name);
        System.out.println("Role: "+ getRole());
        System.out.println("Base Salary: "+ baseSalary);
    }

    void generateSalarySlip(){
         displayDetails();
         performWork();
        displayExtraDetails();
        System.out.println("Bonus: "+ calculateBonus());
        System.out.println("Allowance: "+ calculateAllowance());
        System.out.println("Final Salary: "+ calculateSalary());
    }
}

class Developeres extends Employ{
    int completedProjects;
    double projectReward;

    Developeres(int employId, String name, double baseSalary, int completedProjects, double projectReward){
        super(employId, name, baseSalary);
        this.completedProjects = completedProjects;
        this.projectReward = projectReward;
    }

    @Override
    String getRole() {
        return "Developer";
    }

    @Override
    double calculateBonus(){

        return baseSalary * 15 / 100;
    }

    @Override
    double calculateAllowance(){
        return completedProjects * projectReward;
    }

    @Override
    double calculateSalary(){
        return baseSalary + calculateBonus() + calculateAllowance();
    }

    @Override
    void performWork(){
        System.out.println("Work : Developing software !! ");
    }

    @Override
    void displayExtraDetails(){
        System.out.println("Completed Project: "+ completedProjects);
        System.out.println("Project Reward per Project: "+ projectReward);
    }
}

class Manageres extends Employ{
    int teamSize;
    double perEmployeeAllowance;

    Manageres(int employId, String name, double baseSalary, int teamSize, double perEmployeeAllowance){
        super(employId, name, baseSalary);
        this.teamSize = teamSize;
        this.perEmployeeAllowance = perEmployeeAllowance;
    }

    @Override
    String getRole(){
        return "Manager";
    }

    @Override
    double calculateBonus(){
        return baseSalary * 25 / 100;
    }

    @Override
    double calculateAllowance(){
        return teamSize * perEmployeeAllowance;
    }
    @Override
    double calculateSalary(){
        return baseSalary + calculateBonus() + calculateAllowance();
    }

    @Override
    void performWork(){
        System.out.println(" Work: Managing Team !! ");
    }

    @Override
    void displayExtraDetails(){
        System.out.println("Team Size: "+ teamSize);
        System.out.println("Allowance per employee: "+ perEmployeeAllowance);
    }
}

class Tester extends Employ{
    int bugsFound;
    double rewardPerBug;

    Tester(int employId, String name, double baseSalary, int bugsFound, double rewardPerBug){
        super(employId, name, baseSalary);
        this.bugsFound = bugsFound;
        this.rewardPerBug = rewardPerBug;
    }

    @Override
    String getRole(){
        return "Tester";
    }

    @Override
    double calculateBonus(){
        return baseSalary * 10 / 100;
    }

    @Override
    double calculateAllowance(){
        return bugsFound * rewardPerBug;
    }

    @Override
    double calculateSalary(){
        return baseSalary + calculateBonus() + calculateAllowance();
    }

    @Override
    void performWork(){
        System.out.println("Work:  Testing Software !!");
    }

    @Override
    void displayExtraDetails(){
        System.out.println("Bugs Found: "+ bugsFound);
        System.out.println("Reward per Bug: "+ rewardPerBug);
    }
}
public class Challenge2 {
    public static void main(String [] args){
        Employ [] emp = {new Developeres(201, "Harsh", 60000, 4, 2000),
                new Manageres(202, "Priya", 80000, 5, 1500),
                new Tester(203, "Amit", 40000, 10, 300)
        };

        double totalCompanySalaryExpense = 0;
        String name = null;
        double highestSalary = 0;
        double averageSalary = 0;
        int EmployeesEarningAbove70000 = 0 ;
        System.out.println("========== EMPLOYEE PAYROLL REPORT ==========");
        System.out.println();

        for(Employ e : emp){
            totalCompanySalaryExpense += e.calculateSalary() ;

            if (highestSalary < e.calculateSalary()){
                highestSalary = e.calculateSalary();
                name = e.name;
            }

             if (e.calculateSalary() > 70000){
                 EmployeesEarningAbove70000++;
             }

            averageSalary += e.calculateSalary();
//            averageSalary = (e.calculateSalary() + e.calculateSalary() + e.calculateSalary() )/ 3;
            e.generateSalarySlip();
            System.out.println("=====".repeat(7));
            System.out.println();
        }
        averageSalary = averageSalary/emp.length;

        System.out.println();
        System.out.println("======= COMPANY SUMMARY ======= ");
        System.out.println("Total Salary Expense: "+ totalCompanySalaryExpense);
        System.out.println("Highest Paid Employee: "+ name);
        System.out.println("Highest Salary: "+ highestSalary);
        System.out.printf("Average Salary: %.2f%n", averageSalary);
        System.out.println("Employees Earning Above 70000: " + EmployeesEarningAbove70000);
        System.out.println();
        System.out.println();
        System.out.println("==========".repeat(8));


    }
}
