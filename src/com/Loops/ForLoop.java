package com.Loops;
import java.util.Scanner;
public class ForLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter N Number: ");
		
		int n = sc.nextInt();
	//	int i = 1;
		
	//for(i = 1; i <= n; i++ ) {
	//	System.out.println(2*i+1);
	//}
	  //sc.close();
		
		// points -------------------.
		
		// comment out kiya hua code odd number find krne ke liye hai jisme n user dega 
		// agr n 5 hai to output me phla 5 odd number aayega jaise 54321;
		
	//     aur agr even nikalna hoo to 2n formula hoga 
		// aur odd ka 2n-1 hoga.
		
		
		for(int i = n; i >=0; i--) {
		System.out.println(i);
		}
		sc.close();
	}
	  

}


// output 
//Enter N Number: 
//5
//5
//4
//3
//2
//1
//0

     // Here we can write i = n to output hmara n se suru hoga agr n-1 likhenge to output hmara ,
    // agr n 5 is to output hmara 4 se suru hoga decrement order me .