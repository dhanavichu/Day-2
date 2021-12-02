package com.Casestudy;

import java.util.Scanner;

public class Offersix {

	public static void main(String[] args) {
		int off;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Product 1:");
		int prd1=sc.nextInt();
		
		System.out.println("Enter the Product 2:");
		int prd2=sc.nextInt();
		
		System.out.println("Enter the Product 2:");
		int prd3=sc.nextInt();
		
		int total=prd1+prd2+prd3;
		System.out.println("Total product prize");
		System.out.println(total);
		
		double temp=0.2*total;
		
		System.out.println("Offer Amount:");
		System.out.println(temp);
		
		if(prd1<prd2&& prd1<prd3 )
		{
			off=prd1;
		}
		else if(prd2<prd1 && prd2<prd3)
		{
			off=prd2;
		}
		else
		{
			off=prd3;
		}
		
	    System.out.println("payoffer offer1 price ");
		double payoff1=total-temp;
		System.out.println(payoff1);
		
		System.out.println("payoffer offer2 price ");
		double payoff2=total-off;
		System.out.println(payoff2);
		
		if (payoff1 < payoff1)
		{
		System.out.println("Best to choose offer 1");
		} 
		else
		{
			System.out.println(" Best to choose offer2");
			
		}

	}

}
