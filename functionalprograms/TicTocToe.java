package com.bridgelabz.functionalprograms;

import java.util.Random;
import java.util.Scanner;

public class TicTocToe 
{
	static char[][] matrix =new char[3][3];
	public static void main(String[] args) 
	{
		System.out.println("X-Computer,O-player,*-spaces");
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix.length;j++)
			{
				matrix[i][j]='*';
			}
			
		}
		display();
		player();
	}
	public static void player() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter row & column indicies to play");
		int row = sc.nextInt();
		int column = sc.nextInt();
		if(row<3 && column<3)
		{
			if(matrix[row][column]=='*')
			{
				matrix[row][column]='O';
			}
			else
			{
				System.out.println("this place is already filled plz re-enter the indices");
				player();
			}
		}
		else
		{
			System.out.println("enter indicies between 0 and 2 ");
			player();
		}
		display();
		rowCheck(row);
		columnCheck(column);
		diagonalCheck();
		diagonalCheck1();
		isMatrixFull();
		system();
		
		
	}
	private static void system() 
	{
		Random r = new Random();
		int row = r.nextInt(3);
		int column = r.nextInt(3);
		if(row<3 && column<3)
		{
			if(matrix[row][column]=='*')
			{
				matrix[row][column]='X';
			}
			else
			{
				system();
			}
		}
		display();
		rowCheck(row);
		columnCheck(column);
		diagonalCheck();
		diagonalCheck1();
		isMatrixFull();
		player();	
	}
	public static void isMatrixFull() 
	{
		int flag=0;
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix.length;j++)
			{
				if(matrix[i][j]=='O'||matrix[i][j]=='X')
				{
					flag=1;
					return;
				}
			}
		}
		if(flag==1)
		{
			System.out.println("match tie");
			System.exit(0);
		}
	
		
	}
	public static void diagonalCheck1() 
	{
		if(matrix[0][2]==matrix[1][1]&&matrix[0][2]==matrix[2][0]&&matrix[0][2]!='*'&&matrix[1][1]!='*'&&matrix[2][0]!='*')
		{
			System.out.println("game won by"+matrix[1][1]);
		
			System.exit(0);
		}	
	}
	private static void diagonalCheck() 
	{
		if(matrix[0][0]==matrix[1][1]&&matrix[0][0]==matrix[2][2]&&matrix[0][0]!='*'&&matrix[1][1]!='*'&&matrix[2][2]!='*')
		{
			System.out.println("game won by"+matrix[0][0]);
		
			System.exit(0);
		}
	}
	private static void columnCheck(int column) 
	{
		if(matrix[0][column]==matrix[1][column]&&matrix[0][column]==matrix[2][column]&&matrix[0][column]!='*'&&matrix[1][column]!='*'&&matrix[2][column]!='*')
		{
			System.out.println("game won by"+matrix[0][column]);
		
			System.exit(0);
		}
	}
	private static void rowCheck(int row) 
	{
		if(matrix[row][0]==matrix[row][1]&&matrix[row][0]==matrix[row][2]&&matrix[row][0]!='*'&&matrix[row][1]!='*'&&matrix[row][0]!='*')
		{
			System.out.println("game won by"+matrix[row][0]);
			
			System.exit(0);
		}
	}
	public static void display() 
	{
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix.length;j++) 
			{
				System.out.print(" "+matrix[i][j]);
			}
			System.out.println();	
		}
	System.out.println("================================================================================");
		
	}

}
