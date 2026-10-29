package com.OopsPractice.Interface;

interface Notification{
    void send();
}

class EmailNotification implements Notification {

    @Override
    public void send(){
        System.out.println("Sending Email Notification!! ");
    }

}

  class SMSNotification implements Notification{
    @Override
    public void send(){
        System.out.println("Sending SMS Notification!! ");
    }

}

public class Practice1{
    public static void main(String[] args){
        EmailNotification email = new EmailNotification();
        SMSNotification sms = new SMSNotification();
        email.send();
        sms.send();
    }

}

