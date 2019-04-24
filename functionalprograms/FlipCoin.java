package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class FlipCoin 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of times to flip coin");
		double status = sc.nextInt();
	    flip(status);
	    sc.close();
	}
	
	public  static void flip(double status) 
	{
		int head=0;
		int tail=0;
		for(int i=1;i<=status;i++)
		{
		if(Math.random()>0.5)
		{
		  head++;	
		}
		else
		{
		    tail++;	
		}
		
	}
		System.out.println("no of heads:"+head );
		System.out.println("no of tails:"+tail);
		System.out.println("head percentage is "+(head/status)*100+"%");
		System.out.println("tail percentage is "+(tail/status)*100+"%");
    }
}

