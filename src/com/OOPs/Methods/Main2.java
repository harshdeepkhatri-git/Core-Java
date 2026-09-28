package com.OOPs.Methods;

class player{
    int playerid ;
    String name;
    int playerrank;

    void setdata(int pid, String pname, int prank){
        int playerid = pid;
        String name = pname;
        int playerrank = prank;
    }

    void displaydata(){
        System.out.println("Player Id is = "+ playerid);
        System.out.println("playet name is = " + name);
        System.out.println("Player rank is = " + playerrank);

    }

}
public class Main2 {
    public static void main(String[] args){
        player p1 = new player();

        p1.setdata(1029, "Harsh", 23);

        p1.displaydata();
        System.out.println("====".repeat(10));

        player p2 = new player();

        p2.setdata(1030, "Radhe", 05);
        p2.displaydata();
        System.out.println("====".repeat(10));
    }

}

