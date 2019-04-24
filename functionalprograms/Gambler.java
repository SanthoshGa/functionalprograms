package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class Gambler 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the stake");
		int stake = sc.nextInt();
		System.out.println("enter the goal");
		int goal = sc.nextInt();
		System.out.println("enter no of trails");
		double trails = sc.nextInt();
		int win = 0;
		int lose = 0;
		for (int i=1;i<=trails;i++)
		{
			int cash = stake;
			int bets = 0;
			if(cash!=0&&cash<goal)
			{
				bets++;
				if(Math.random()<0.5)
				{
					win++;	
				}
				else
				{
					lose++;
				}
			}
		}
		System.out.println("no of wins"+ win);
		System.out.println("wins percentage is:"+ (win/trails)*100);
		System.out.println("lose percentage is:"+ (lose/trails)*100);
		}
		
	}


