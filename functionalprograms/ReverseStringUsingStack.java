package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class ReverseStringUsingStack 
{
	static char[] array = new char[100];
	static int top=-1;
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String s1 =sc.nextLine();
		
		for(int i=0;i<s1.length();i++)
		{
			push(s1.charAt(i));
		}
		
	    for(int i=0;i<s1.length();i++)
	    {
		pop();
	    }
		
	}
	public static void push(char charAt) 
	{
		
		++top;
		array[top]=charAt;
		
		
	}
	public static void pop()
	{
		System.out.print(array[top--]);
		
	
	}
		
	}


