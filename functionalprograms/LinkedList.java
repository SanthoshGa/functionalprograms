package com.bridgelabz.functionalprograms;

import java.util.Scanner;

class Node
{
	int data;
	Node next;
}

public class LinkedList 
{
	static Node head=null;
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		while(true)
		{
		System.out.println("enter your choice\n1.insert\n2.delete\n3.show\n4.insertAtStart\n5:insertAtPosition\n6.deleteAtPosition\n7.search\n8.mid");
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1:head=insert();
		       break;
		case 2:head=delete();
		       break;
		case 3:show();
		       break;
		case 4:head=insertAtStart();
		       break;
		case 5:head=insertAtPosition();
		       break;
		case 6:head=delteAtPosition();
		       break;
		case 7:head=search();
		       break;
		case 8:head=mid(head);
		       break;
		}
	}
}

	public static Node mid(Node curr) 
	{
		Node prev=null ;
		Node head ;
		Node temp,temp1;
		Node node=new Node();
		temp=temp1=curr;
	
		if(temp.next==null)
		{
			System.out.println(" only one Elememt");
		}
		/*
		else if(temp!=null && temp.next!=null)
		{
			System.out.println(" only two element");
		}
		*/
		else
		{
			while(temp!=null && temp.next!=null)
			{
				temp= temp.next;
			}
			if(temp!=null && temp.next!=null)
			{
				temp1 = temp1.next;
				temp = temp.next;
			}
			prev.next = temp1;
			node.next = temp1.next;
			prev.next = node;
		}
		return curr;
			
	}
	

	public static Node search() 
	{
	  Scanner sc = new Scanner(System.in);
	  System.out.println("enter element you want to search");
	  int key = sc.nextInt();
	  Node current = head;
	  int count = 0;
	  if(current.data!=key)
	  {
		  current = current.next;
		  count++;
	  }
	  if(current.data==key)
	  {
		  System.out.println("your element is at:"+ count+1);
	  }
	  if(current.next==null)
	  {
		  System.out.println("key is not found");
	  }
		return head;
	}

	public static Node delteAtPosition() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the position you want to delete");
		int position = sc.nextInt();
		if(position == 1)
		{
			head=head.next;
		}
		else
		{
			Node current = head;
			Node prev = current;
			for(int i=1;i<position;i++)
			{
				prev = current;
				current = current.next;
			}
			System.out.println("deleted element is:"+current.data);
			prev.next = current.next;	
		}
	
		return head;
	}

	public static Node insertAtPosition() 
	{
		Node node = new Node();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the position you want to insert");
		int position = sc.nextInt();
		if(position==1)
		{
			insertAtStart();
			return head;
		}
		else
		{
		System.out.println("enter value to be insert");
		int data = sc.nextInt();
		node.data=data;
		node.next=null;
		Node current = head;
		Node prev=current;
		
		for(int i=1;i<position;i++)
		{
			prev = current;
			current = current.next;
		}
		prev.next=node;
		node.next=current;
		
		return head;
	}
	}

	private static Node insertAtStart() 
	{
		Node node = new Node();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a value to insert");
		int value= sc.nextInt();
		node.data=value;
		node.next=null;
		node.next=head;
		head=node;
		return head;
	}

	public static void show() 
	{
		Node current = head;
		System.out.println("the elements are: ");
		while(current.next!=null)
		{
			System.out.println(current.data);
			current = current.next;
		}
		System.out.println(current.data);	
	}

	public static Node delete() 
	{
		Scanner sc = new Scanner(System.in);
		
	
		return head;
	}

	public static Node insert() 
	{
	
		Node node = new Node();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a value to insert");
		int value= sc.nextInt();
		node.data=value;
		node.next=null;
		if(head==null)
		{
			head=node;
			return head;
		}
		else
		{
			Node current=head;
			while(current.next!=null)
			{
				current=current.next;	
			}
			current.next=node;
			return head;
		}	
	}
}

	
	
	

