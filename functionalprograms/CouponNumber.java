package com.bridgelabz.functionalprograms;

import java.util.Random;

public class CouponNumber 
{
	public static void main(String[] args) 
	{
		Random r = new Random();
		for(int i=1;i<=10;i++)
		{
			System.out.println(r.nextInt(100));
		}
	}
}
