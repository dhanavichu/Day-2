package com.run;

import java.util.Scanner;

public class Event {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter branding expenses:");
		double brand=sc.nextDouble();
		System.out.println("Enter travel expenses:");
		double travel=sc.nextDouble();
		System.out.println("Enter food expenses:");
		int food=sc.nextInt();
		System.out.println("Enter logistics expenses:");
		int log=sc.nextInt();
		
		System.out.println("Total expenses:");
		double total=brand+travel+food+log;
		System.out.println(total);
		
		System.out.println("Branding expenses percentage:");
		double b=((brand/total)*100);
		System.out.println(b);
		
		System.out.println("Travel expenses percentage:");
		double t=((travel/total)*100);
		System.out.println(t);
		
		System.out.println("Food expenses percentage :");
		double f=((food/total)*100);
		System.out.println(f);
		
		System.out.println("Logistics expenses percentage :");
		double l=((log/total)*100);
		System.out.println(l);
	
		
		

	}

}
