package com.Loops;

import java.util.Scanner;

public class ReformattingShipmentIDs {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Shipment ID: ");
        int id = sc.nextInt();

        int result = 0;
        int place = 1;

        while(id!=0){
            int first = id%10;
            id = id/10;

            int second = id%10;
            id = id/10;

            result = result + first*place*10;
            result = result + second*place;

            place = place*100;
        }
        System.out.println("Reformatted Shipment Id = " + result);

    }
}
