//Topic: Runtime Polymorphism (Parent Reference, Child Object)
//Ab hum dekhenge ki parent class ka reference child class
//ke object ko hold kar sakta hai aur overridden method
// call karne par kya hota hai.


package com.OopsPractice.Inheritance;

class Shape{
    void draw(){
        System.out.println("Drawing a Shape");
    }
}

class Circle extends Shape{
    @Override
    void draw(){
        System.out.println("Drawing a Circle");
    }
}

class Rectangle extends Shape{
    @Override
    void draw(){
        System.out.println("Drawing a Rectangle");
    }
}


public class Practice6 {
    public static void main(String[] args) {
        Shape sh = new Circle();
        sh.draw();

        Shape s = new Rectangle();
        s.draw();

        Shape s1 = new Shape();
        s1.draw();

    }
}
