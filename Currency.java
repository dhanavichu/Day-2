package com.Casestudy;

import java.util.Scanner;

public class Currency {
          public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);	
			int s=sc.nextInt();
			int s1,s2,s3,s4,s5,s6;
			s1=s/100;
			s=s%100;
			s2=s/50;
			s=s%50;
			s3=s/10;
			s=s%10;
			s4=s/5;
			s=s%5;
			s5=s/2;
			s=s%2;
			s6=s;
		    int sum=s1+s2+s3+s4+s5+s6;
		    System.out.println(sum);
		}
}
