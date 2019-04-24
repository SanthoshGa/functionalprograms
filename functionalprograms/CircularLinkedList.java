package com.bridgelabz.functionalprograms;

import java.util.Scanner;


public class CircularLinkedList 
{
	public static void main(String[] args) 
	{
		Node head = null;
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("enter \n1.insert_end\n2.delete_end\n3.display\n4.insert_front\n5.delete_front\n6.insert_position\n7.delete_position\n8.search\n9.exit\n");
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1:head = insert_end(head);
		       break;
		    case 2:head= delete_end(head);
		       break;
		    case 3:head=display(head);
		       break;
		    case 4:head = insert_front(head);
		       break;
		    case 5:head = delete_front(head);
		       break;
		    case 6:head=insert_position(head);
		       break;
		    case 7:head=delete_position(head);
		       break;
		    case 8:head=search(head);
				break;
		     case 9:System.exit(1);
			}
					
		}
		
		
		
	}

	public static Node search(Node head) 
	{
		
		return null;
	}

	public static Node delete_position(Node head) 
	{
	
		return null;
	}

	public static Node insert_position(Node head) 
	{
		
		return null;
	}

	public static Node delete_front(Node head) 
	{
		
		return null;
	}

	public static Node insert_front(Node head) 
	{
	
		return null;
	}

	public static Node display(Node head) 
	{
		return head;
		
		
	}

	public static Node delete_end(Node head) 
	{
	
		return null;
	}

	public static Node insert_end(Node head) 
	{
		Scanner sc1 = new Scanner(System.in);
		Node node = new Node();
		System.out.println("enter the value to insert");
		int data = sc1.nextInt();
		node.data=data;
		node.next=head;
		if(head==null)
		{
			head=node;
			return head;
		}
		else
		{
			Node current = head;
			while(current.next!=head)
			{
				current = current.next;
			}
			current.next = node;
		}
		return head;
	
	}

}
