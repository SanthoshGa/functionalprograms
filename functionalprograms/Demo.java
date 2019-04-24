package com.bridgelabz.functionalprograms;

public class Demo 
{

	public static void main(String[] args) {
		
		for(int i =10 ; i<=30 ;i++)
		{
			int count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
				 count += 1;
				}
			
			}
			
			if(count==2)
			{
				System.out.println(i);
			}
			
			
		}
		
	}

}
