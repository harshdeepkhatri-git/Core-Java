package com.OopsPractice.Challenge;


import com.OopsPractice.Abstraction.Testers;

public class PayrollService {

    public static void validateEmployees(Employes[] employees) {

        if (employees == null) {
            throw new IllegalArgumentException("Employee array cannot be null!");
        }

        for (Employes employee : employees) {
            if (employee == null) {
                throw new IllegalArgumentException("Employee cannot be null!");
            }
        }
    }

    public static void generatePayroll(Employes[] employees) {
        validateEmployees(employees);

        if (employees.length == 0) {
            System.out.println("No employees found.");
            return;
        }

        for (Employes employee : employees) {
            employee.generateSalarySlip();
            System.out.println("=".repeat(40));
        }
    }

    public static double calculateTotalExpense(Employes[] employees) {
        validateEmployees(employees);

        double total = 0;

        for (Employes employee : employees) {
            total += employee.calculateSalary();
        }

        return total;
    }

    public static Employes findHighestPaid(Employes[] employees) {
        validateEmployees(employees);

        if (employees.length == 0) {
            return null;
        }

        Employes highestPaid = employees[0];

        for (Employes employee : employees) {
            if (employee.calculateSalary() > highestPaid.calculateSalary()) {
                highestPaid = employee;
            }
        }

        return highestPaid;
    }

    public static double calculateAverageSalary(Employes[] employees) {
        validateEmployees(employees);

        if (employees.length == 0) {
            return 0;
        }

        return calculateTotalExpense(employees) / employees.length;
    }

    public static int countHighEarners(Employes[] employees, double threshold) {
        validateEmployees(employees);

        int count = 0;

        for (Employes employee : employees) {
            if (employee.calculateSalary() > threshold) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Employes[] employees = {
                new Develop(201, "Harsh", 60000, 4, 2000),
                new Manag(202, "Priya", 80000, 5, 1500),
                new Testers(203, "Amit", 40000, 10, 300)
        };

        System.out.println("========== EMPLOYEE PAYROLL REPORT ==========");
        generatePayroll(employees);

        double totalExpense = calculateTotalExpense(employees);
        Employes highestPaid = findHighestPaid(employees);
        double averageSalary = calculateAverageSalary(employees);
        int highEarners = countHighEarners(employees, 70000);

        System.out.println("\n========== COMPANY PAYROLL SUMMARY ==========");
        System.out.println("Total Salary Expense: " + totalExpense);

        if (highestPaid == null) {
            System.out.println("Highest Paid Employee: None");
            System.out.println("Highest Salary: 0.0");
        } else {
            System.out.println("Highest Paid Employee: " + highestPaid.name);
            System.out.println("Highest Salary: " + highestPaid.calculateSalary());
        }

        System.out.printf("Average Salary: %.2f%n", averageSalary);
        System.out.println("Employees Earning Above 70000: " + highEarners);
    }
}


