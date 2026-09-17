package com.Statements;

import java.util.Scanner;

public class SmartIrrigation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter raining:(yes/no)  ");
         String rain= sc.nextLine();
         
        System.out.println("soil(dry/wet/normal) : ");
         String soil = sc.nextLine();
         
        System.out.println("maintenance(yes/no): ");
         String maintenance = sc.nextLine();
         
       
		 if( rain.equals("yes")) {
			 System.out.println("No need of watering");
		 } 
			 else {
				 
				  maintenance = "yes";
				 int wateringtime = 0;

		            if (soil.equals("dry") && maintenance .equals("yes") ) {
		            	wateringtime = (120 - 20);
		            	System.out.println("Watering time: "+ wateringtime  + " Seconds Due to maintainence");	
		               }
		            else if(soil.equals("dry") &&  maintenance .equals("no") ) {
		            	wateringtime = 120;
		            	System.out.println("Watering Time : "+ wateringtime + " Seconds"); 	
		            }
		            else if(soil.equals("normal") && maintenance .equals("yes") ) {
		            	wateringtime = 90-20;
		            	System.out.println("Watering time : "+ wateringtime + " Seconds Due to maintainence");
		            }
		            else if(soil.equals("normal") &&  maintenance .equals("no") ) {
		            	wateringtime = 90;
		            	System.out.println("Watering time : "+ wateringtime + " Seconds");	
		            }
		            else if(soil.equals("wet") && maintenance.equals("yes")) {
		            	wateringtime = 60 - 20;
		            	System.out.println("Watering time : "+ wateringtime + " Seconds Due to maintainence");
		            }
		            else if(soil.equals("wet") &&  maintenance .equals("no")) {
		            	wateringtime = 60;
		            	System.out.println("Watering time : "+ wateringtime + " Seconds");
		            }
		           
		            }
		           sc.close();
		        }

   
         }

       
    


