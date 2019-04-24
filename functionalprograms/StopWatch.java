package com.bridgelabz.functionalprograms;

import com.bridgelabz.algorithms.Utility;

public class StopWatch 
{
	public static void main(String[] args) 
	{
		System.out.println("press 1 to start");
		int a = Utility.getNumber();
		long start=Utility.start();
		System.out.println();
		System.out.println("press 2 to stop");
		int b = Utility.getNumber();
		long stop=Utility.stop();
		
		long l = Utility.getElapsedTime(start,stop);
		System.out.println();
		System.out.println("Total Time Elapsed(in millisec) is:"+l);
		System.out.println();
		System.out.println("Converting millisec to seconds: "+(l/1000)+" sec");

	}
}
	
	