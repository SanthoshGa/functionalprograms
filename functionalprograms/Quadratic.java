package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class Quadratic 
{
	public static void main(String[] args) 
	{
		Quadratic q=new Quadratic();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter  a,b,c values");
		double a = sc.nextInt();
		double b = sc.nextInt();
		double c = sc.nextInt();
		double delta = b*b-4*a*c;
		double root1= (-b +Math.sqrt(delta))/(2*a);
		double root2= (-b -Math.sqrt(delta))/(2*a);
		System.out.println(root1);
		System.out.println(root2);	
	}			
}


