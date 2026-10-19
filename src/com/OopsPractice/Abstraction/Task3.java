package com.OopsPractice.Abstraction;

abstract class Animal{
    abstract void makeSound();

    void sleep(){
        System.out.println("Animal is Sleeping");
    }
}

class Dog extends Animal{
    @Override
    void makeSound(){
        System.out.println("Dog Barks");
    }
}



public class Task3 {
    public static void main(String [] args){
       Animal a = new Dog();
        a.makeSound();
        a.sleep();

    }
}
