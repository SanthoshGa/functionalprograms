package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.algorithms.Utility;

public class BubbleSort 
{
	public static void main(String[] args) 
	{
		int[] arr= new int[10];
		System.out.println("enter array of elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=Utility.getNumber();
		}
		System.out.println("Before bubble Sort");
		Utility.printArray(arr);
		Utility.insertionSort(arr);
		System.out.println("after bubble sort");
		Utility.printArray(arr);
	}

}
