package com.OopsPractice.Interface;

interface Workable {
    void performWork();
    String getWorkDescription();
}

class SoftwareEngineer implements Workable{

    @Override
    public void performWork(){
        System.out.println("Software Engineer is writing code");
    }

    @Override
    public String getWorkDescription(){
        return "Developing applications";
    }
}

class Designer implements Workable{
    @Override
    public void performWork(){
        System.out.println("Designer is creating UI designs");
    }

    @Override
    public String getWorkDescription(){
        return "Designing user interfaces";
    }
}

public class Practice6 {
    public static void main(String [] args){
        Workable work ;
        work = new SoftwareEngineer();
        work.performWork();
        System.out.println(work.getWorkDescription());

        System.out.println("====".repeat(6));

        work = new Designer();
        work.performWork();
        System.out.println(work.getWorkDescription());
    }
}
