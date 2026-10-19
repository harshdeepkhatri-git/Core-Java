package com.OopsPractice.Abstraction;

abstract class Notification{
    abstract void sendNotification(String message);

    void notificationInfo(){
        System.out.println("Notification Service Started");
    }
}
class EmailNotification extends Notification{
    @Override
      void sendNotification(String message) {
        System.out.println("Email sent: " + message);
    }

}
class SMSNotification extends Notification{
    @Override
    void sendNotification(String message) {
        System.out.println("SMS sent: "+ message);
    }

}
public class Task6 {
    public static void main(String [] args){
          EmailNotification email = new EmailNotification();
          SMSNotification sms = new SMSNotification();
          email.notificationInfo();
          email.sendNotification("Welcome to Java");
        System.out.println("====".repeat(5));

          sms.notificationInfo();
          sms.sendNotification("Your OTP is 1234");
    }
}
