package com.Statements;

import java.util.Scanner;

public class DataCenterAccessControl {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Employee ID Valid (Yes/No): ");
        String id = sc.next();

        System.out.print("Security Clearance Level: ");
        int clearance = sc.nextInt();

        System.out.print("Biometric Authentication Successful (Yes/No): ");
        String biometric = sc.next();

        System.out.print("Access Request Time (24-hour format): ");
        double time = sc.nextDouble();

        System.out.print("Chief Security Officer (Yes/No): ");
        String cso = sc.next();

        
        if (id.equalsIgnoreCase("No")) {
            System.out.println("Invalid Employee ID");
        }

       
        else if (clearance < 5) {
            System.out.println("Insufficient Security Clearance");
        }

       
        else if (biometric.equalsIgnoreCase("No")) {
            System.out.println("Biometric Authentication Failed");
        }

       
        else if (cso.equalsIgnoreCase("No") && (time < 9 || time > 18)) {
            System.out.println("Outside Office Hours");
        }

       
        else {
            System.out.println("Access Granted");
        }

        sc.close();
    }
}