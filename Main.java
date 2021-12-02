package com.run;

import java.util.Scanner;

public class Main {
        static float currentrate;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter total number of overs :");
		int number=sc.nextInt();
		System.out.println("Enter Target Runs:");
		int target=sc.nextInt();
		System.out.println("Enter overs bowled:");
		int overs=sc.nextInt();
		System.out.println("Enter Runs scored:");
		int scored=sc.nextInt();
	   
		System.out.println("Current Run Rate:");
		float currentrate=scored/overs;
	    System.out.println(currentrate);
	    
		 System.out.println("Run Rate required after 10 overs:");
		 float runrate=(float)(target-scored)/(number-overs);
		 System.out.println(runrate);
		
		

	}

}
