package com.Casestudy;

import java.util.Scanner;

public class Childrenseven {

	public static void main(String[] args) {
		int i ;
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of chocalates:");
		int choc=sc.nextInt();
		
		System.out.println("Enter the number of childrens:");
		int child=sc.nextInt();
		
		for(i=1;i<=child;i++)
		{
			if(choc>=i)
			{
				choc=choc-i;
				count++;
			}
		}
  
		System.out.println("Remaining chocalate:"+count);
		System.out.println("No of childrens:" +choc);
	}

}
