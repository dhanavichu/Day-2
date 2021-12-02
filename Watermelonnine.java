package com.Casestudy;

import java.util.Scanner;

public class Watermelonnine {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the watermelon weight:");
		int water=sc.nextInt();
		if(water%2==0)
		{
			System.out.println("I get "+water/2+ "kgs and my sibiling gets "+water/2+"kgs");
		}
		else
		{
			System.out.println("Sorry you can't buy the watermelon,select even weight watermelon..!!");
		}
           for(int i=1;i<=water;i++)
           {
        	   System.out.println("Possible way :"+i+" " +(water-i));
           }
	}

}
