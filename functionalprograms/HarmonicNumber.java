package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class HarmonicNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		double sum = 0.0;
		for(int i=1;i<=n;i++)
		{
			sum = sum+(1.0/i);
		}
		System.out.println(sum);
		sc.close();
	}

}
