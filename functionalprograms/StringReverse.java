package com.bridgelabz.functionalprograms;

public class StringReverse 
{
	public static void main(String[] args) 
	{
		String s1 = "Hello! Santhosh chai peelo";
		String[] array = s1.split(" ");
		
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]);	
		}
		System.out.println();
		for(int i=0;i<array.length;i++)
		{
			
			reverse(array[i]);
		}
		
	}

	public static void reverse(String string) 
	{
		char[] a = string.toCharArray();
		System.out.print(" ");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]);
		}
			
	}

}
