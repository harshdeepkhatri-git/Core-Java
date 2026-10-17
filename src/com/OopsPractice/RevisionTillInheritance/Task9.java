package com.OopsPractice.RevisionTillInheritance;




class PatientQ9{
    String patientName;
    int consultationFee;

    PatientQ9(String patientName, int consultationFee){
        this.patientName = patientName;
        this.consultationFee = consultationFee;

        }
        void displayInfo(){
        System.out.println("Name: "+ patientName);
        System.out.println("Consultation Fee : "+ consultationFee);
        }
    }


    class InPatientQ9 extends PatientQ9{



        int roomCharge;

           InPatientQ9(String patientName, int consultationFee, int roomCharge){
               super(patientName, consultationFee);
               this.roomCharge = roomCharge;
           }

           @Override
        void displayInfo(){
               System.out.println("PatientName: "+ patientName);
               System.out.println("Room Charge : "+ roomCharge);
               System.out.println("Consultant Fee: "+ consultationFee);
               System.out.println("Total Bill: "+ calculateTotalBill());
        }
        int calculateTotalBill(){
            return consultationFee + roomCharge;
        }


    }


public class Task9 {
    public static void main(String [] args){

        InPatientQ9 patient = new InPatientQ9("Harsh", 1500, 3500 );
        patient.displayInfo();

    }
}
