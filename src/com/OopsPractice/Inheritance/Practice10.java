//Topic: Combining Inheritance + Method Overriding + Runtime Polymorphism
//Ye inheritance ka final practice question hai. Ismein tum ab tak seekhe
//hue concepts combine karoge.

package com.OopsPractice.Inheritance;

class Payment{
    void pay(){
        System.out.println("Processing payment");
    }
}

class UPIPayment extends Payment{
    @Override
     void pay(){

        System.out.println("Processing UPI Payment");
    }

}
class CardPayment extends Payment{
    @Override
    void pay(){
        System.out.println("Processing Card Payment");
    }
}

public class Practice10 {
    // Payment System.
    public static void main(String [] args) {
        Payment p =new UPIPayment();
        p.pay();
        p = new CardPayment();
        p.pay();
        p=new Payment();
        p.pay();
    }

}
