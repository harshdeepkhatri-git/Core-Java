//Topic: Method Overriding
//Ab hum inheritance ka ek important concept seekhenge: Method Overriding.
//Concept
//When a child class provides its own implementation of a method already
// defined in the parent class, it is called method overriding.

package com.OopsPractice.Inheritance;


class Animal{
    void sound(){
        System.out.println("Animal Makes Sound");
    }
}

class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dogs Bark");
    }
}

class Cat extends Animal{
    @Override

    void sound(){
        System.out.println("Cat meows");
    }
}

//Important interview concept >> Even though all three classes have a method named sound(),
//the implementation differs based on the object's class.
//This is runtime polymorphism when an overridden method is invoked
//through a parent-type reference.


public class Practice5 {
    static void main() {
        Animal ani = new Animal();
        ani.sound();

        Dog dog = new Dog();
        dog.sound();

        Cat cat = new Cat();
        cat.sound();

    }
}
