package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class SumOfThreeIntegers 
{
	public static void main(String[] args) 
	{
		Scanner sc  = new Scanner(System.in);
		System.out.println("enter the size of array");
		int size  = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("enter array elements");
		for (int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		findTriplets(arr,size);
	}

	public static void findTriplets(int[] arr, int size) 
	{
	
		int count=0;
		for(int i=0;i<size-2;i++)
		{
			for(int j=i+1;j<size-1;j++)
			{
				for(int k=j+1;k<size;k++)
				{
					if(arr[i]+arr[j]+arr[k]==0)
					{
						System.out.print(arr[i]+" ");
						System.out.print(arr[j]+" ");
						System.out.print(arr[k]+"\n");
						count++;
					}
				}
					
			}
		}
		System.out.println("no of pairs="+count);
	}
}
