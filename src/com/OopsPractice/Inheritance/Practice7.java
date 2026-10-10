package com.OopsPractice.Inheritance;

//Topic: Using super to Call an Overridden Parent Method
//You've learned that a child class can override a parent method.
//Now let's see how the child can still call the original parent implementation
//using super.



class Employe{
    void work(){
        System.out.println("Employee is working...");
    }
}

class Developer extends Employe{
    @Override
    void work(){
        super.work();
        System.out.println("Developer is writing java code");
    }
}
public class Practice7 {
    public static void main(String [] args){
        Developer dev = new Developer();
        dev.work();

    }
}
