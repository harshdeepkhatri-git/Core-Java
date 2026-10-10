//Topic: Multilevel Inheritance >>>
// >> Multilevel inheritance mein ek class doosri class ko inherit karti hai, aur
// teesri class us child class ko inherit karti hai.

package com.OopsPractice.Inheritance;

class Animals{
    void eat(){
        System.out.println("Animal is eating");
    }
}

class Dogs extends Animals{

    void bark(){
        System.out.println("Dog is barking");
    }
}

class Puppy extends Dogs{
    void weep(){
        System.out.println("Puppy is Weeping");
    }

}

public class Practice8 {
    public static void main(String[] args){
        Puppy p = new Puppy();

        p.eat();
        p.bark();
        p.weep();

    }
}
