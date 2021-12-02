package com.Casestudy;

public class SumSquare {

	public static void main(String[] args) {
		int sum=0,sumOfSquare=0,diff=0,squareOfSum=0;
		for(int i=1;i<=100;i++)
		{
		sum=sum+i;
		sumOfSquare += (i * i);
		squareOfSum =sum*sum;
		}
		diff=squareOfSum - sumOfSquare;
		System.out.println(diff);
	}

}
