package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class LeapYear 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a year");
		int count=0;
		int year=sc.nextInt();
		if(year>=1000 && year<=9999)
		{
			System.out.println("year is four digit");
			if((year%400==0)||(year%4==0 && year%100!=0)) 
			{
				System.out.println("year is a leap year");
			}
			else
			{
				System.out.println("not a leap year");
			}
		}
		
		else
		{
			System.out.println("invalid");
		}
		sc.close();
		
		}
}
