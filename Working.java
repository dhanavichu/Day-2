package com.Casestudy;

import java.util.Scanner;

public class Working {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the total salary paid :");
		int pay=sc.nextInt();
		int n=pay-800+10;
		int Weekend=n/130;
		int Weekday=Weekend+10;

		System.out.println("Number of weekday hours is :");
		System.out.println(Weekday);
		System.out.println("Number of weekend hours is :");
		System.out.println(Weekend);
	}

}
