package com.Casestudy;

import java.util.Scanner;

public class Archeryeight {

	public static void main(String[] args) {
		int target=100 ,sum=0;
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=target;i++)
		{
			System.out.println("Turn is "+i);
			int turn=sc.nextInt();
			sum+=turn;
			if(sum>target)
			{
				System.out.println("Points scored are:"+sum);
				System.out.println("No of turns :"+i);
			}
		}
		 
	}

}
