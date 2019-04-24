package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class InsertionSort 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];
		System.out.println("enter array of elements");
		for(int i=0;i<a.length;i++)
		{
			a[i] = sc.nextInt();
		}
		int temp,j;
		for(int i=1;i<a.length;i++)
		{
			temp = a[i];
			j=i;
			while(j>0&&a[j-1]>temp)
				
			{
				a[j]=a[j-1];
				j=j-1;
			}
			a[j]=temp;	
		}
		System.out.println("sorted elements are:");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
	}

}
