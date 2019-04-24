package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class Stack 
{
	static int[] array=new int[5];
	static int top=-1;
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		while(true)
		{
		System.out.println("\nenter 1 to push\n enter 2 to pop\n enter 3 to display\n enter 4 to exit");
		int n = sc.nextInt();
		switch(n)
		{
		case 1:if(top+1==5)
		       {
			   System.out.println("stack is full");
			   System.exit(1);
		       }
		       else
		       {
			   push();
		       }
		       break;
		case 2:if(top==-1)
		       {
			   System.out.println("stack is empty");
		       }
		       else
		       {
			   pop();
		       };
		       break;
		case 3:display();
		       break;
		case 4:search();
		       break; 
		case 5:System.exit(1);
		       break;
		   
		
		}
		sc.close();
		
	}
	}
	
	public static void search() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter element to search:");
		int key = sc.nextInt();
		for(int i=0;i<=top;i++)
		{
			if(array[i]==key)
			{
				System.out.println(i);
				return;
			}
		}
		sc.close();	
	}

	public static void display() 
	{
		System.out.println("elements present in stack are:");
		for(int i=top;i>=0;i--)
		{
			System.out.print(array[i]);
		}
	
	}
	public static void pop() 
	{
		System.out.println(array[top]+ " is deleted");
		top--;
		
	}
	public static void push() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter element to insert");
		++top;
		array[top]=sc.nextInt();			
	}
	
}
