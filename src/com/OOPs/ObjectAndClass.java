package com.OOPs;

import java.util.Scanner;

// how to create am object for a class.

//class person {
//    String name = "harsh";
//    int age = 22;
//    String address = "bihar";
//}
//
//public class ObjectAndClass{
//    public static void main(String[] args) {
//        person p1 = new person();
//        System.out.println(p1.name);
//        System.out.println(p1.age);
//        System.out.println(p1.address);
//
//        System.out.println("=====".repeat(10));
//
//        person p2 = new person();
//        System.out.println(p2.name);
//        System.out.println(p2.age);
//        System.out.println(p2.address);
//    }
//
//}
//

// output:
//            harsh
//            22
//            bihar
//  ==============================
//            harsh
//            22
//            bihar



// How to create an object for a class.

//public class ObjectAndClass {
//    public static void main(String [] args){
//        Scanner sc = new Scanner(System.in);
//        player p1 = new player();
//        p1.setData(1029, "Harsh", 23);
//         p1.display();
//
//        System.out.println("====".repeat(10));
//        player p2 = new player();
//        p1.setData(1026, "Mota", 23);
//        p1.display();
//    }
//}
//
//class player {
//    int playerId;
//    String playerName;
//    int playerRank;
//
//
//    void setData(int pid, String pname, int prank){
//        playerId = pid;
//        playerName = pname;
//        playerRank = prank;
//
//    }
//
//    void display(){
//        System.out.println("Player ID: " + playerId);
//        System.out.println("Player Name: " + playerName);
//        System.out.println("Player Rank: " + playerRank);
//    }
//
//}


// output:
//            Player ID: 1029
//            Player Name: Harsh
//            Player Rank: 23
//  ========================================
//            Player ID: 1026
//            Player Name: Mota
//            Player Rank: 23
//



// This keyword: >>>



public class ObjectAndClass{
    public static void main(String[] args){
        Employee e1 = new Employee();
        e1.setData(19324, "Sekhar", 150000);
        e1.displayData();

        System.out.println("====".repeat(5));

        Employee e2 = new Employee();
        e2.setData(19234, "Ravi", 120000);
        e2.displayData();
    }
}
class Employee{
    int eid;
    String name;
    double salary;

    void setData(int eid, String name, double salary){
        this.eid = eid;
        this.name = name;
        this.salary = salary;
    }

    void displayData(){
        System.out.println("Employee ID: " + this.eid);
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
    }
}


// output:
//            Employee ID: 19324
//            Name: Sekhar
//            Salary: 150000.0
//                    ====================
//            Employee ID: 19234
//            Name: Ravi
//            Salary: 120000.0
//




