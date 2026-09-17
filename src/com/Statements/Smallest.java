package com.Statements;

public class Smallest{
public static void main(String[]args){
      int a=2, b=4, c=1, d=3;
if(a<b && a<c && a<d){
  System.out.println(a);
}else if(b<a && b<c && b<d){
     System.out.println(b);
}else if(c<a && c<b && c<d){
    System.out.println(c);
}else{
   System.out.println(d);
     }
  }

}