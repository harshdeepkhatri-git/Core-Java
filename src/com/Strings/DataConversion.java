package com.Strings;

public class DataConversion {
    public static void main(String [] args){
        //parsing

        String d1 = "10";

        System.out.println(d1.getClass().getName());

        int r1 = 10;
        System.out.println(r1);

     // System.out.println(r1.getClass().getName());

        //boxing

        int x = 100;
        Integer y = new Integer(x);
        System.out.println(y.getClass().getName());

        //unboxing

        Integer p =12;
        System.out.println(p.getClass().getName());
        int r = p;
        System.out.println(p);

    }
}
