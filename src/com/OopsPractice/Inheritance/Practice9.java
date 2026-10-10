//Topic: Hierarchical Inheritance
//Hierarchical inheritance means multiple child classes
//inherit from the same parent class.

package com.OopsPractice.Inheritance;

 class Animales{
     void eat(){
         System.out.println("Animal is eating");
     }
 }

 class Duck extends Animales{
     void Swim(){
         System.out.println("Duck is Swimming");
     }
 }

 class Cats extends Animales{
     void meow(){
         System.out.println("Cats is meowing");
     }
 }

public class Practice9 {
    public static void main(String[] args){
        Duck d = new Duck();
        d.eat();
        d.Swim();

        Cats c = new Cats();
        c.eat();
        c.meow();


    }
}
