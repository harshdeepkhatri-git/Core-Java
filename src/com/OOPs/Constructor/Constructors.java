package com.OOPs.Constructor;

class classA{
    int x ;
    int y;
    int z;

    void display(){
        System.out.println("x = "+ x);
        System.out.println("y = "+ y);
        System.out.println("z = "+ z);
    }
}

public class Constructors {
    public static void main(String[] args){
        classA ca = new classA();

        ca.display();
    }
}
  // The default constructor/JVM can be filled all the data members of the class with
// its default value based on its type.


// output:
//        x = 0
//        y = 0
//        z = 0

