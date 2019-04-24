package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class ReplaceString 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter username");
		String username = sc.next();
		if(username.length()>3)
		{
		 System.out.println("Hello "+username+" How are you");	
		}
		else
		{
			System.out.println("invalid string");
		}
		sc.close();
		
	}

}
