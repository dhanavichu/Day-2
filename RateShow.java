package com.run;

import java.util.Scanner;

public class RateShow {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
        System.out.println("Enter the number of people who watched show 1");
        int p1=sc.nextInt();
        System.out.println("Enter the average rating for show 1");
        double a1=sc.nextFloat();
      
        
        
        System.out.println("Enter the number of people who watched show 2");
        int p2=sc.nextInt();
        System.out.println("Enter the average rating for show 2");
        double a2=sc.nextFloat();
      
       
        
        System.out.println("Enter the number of people who watched show 3");
        int p3=sc.nextInt();
        System.out.println("Enter the average rating for show 3");
        double a3=sc.nextFloat();
       
 
        
        
        
        double d1=(p1/100)*(a1/10);
        double d2=(p2/100)*(a2/10);
        double d3=(p3/100)*(a3/10);
        
       
        
        System.out.println("The overall average rating for the show is ");
        double total= d1+d2+d3;
        System.out.println(total);
        
	}

}
