package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class DuplicateLL 
{

	public static void main(String[] args) 
	{
		Node head = null;
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("enter your choice\n1.insert_end\n2.delete_end\n3.display\n4.insert_front\n5.delete_front\n6.insert_position\n7.delete_position\n8.search\n9.exit");
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1:head = insert_end(head);
			       break;
			case 2:head= delete_end(head);
			       break;
			case 3:display(head);
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
		Scanner sc = new Scanner(System.in);
		System.out.println("'enter element you want to search");
		int key = sc.nextInt();
		Node current = head;
		int count=0;
		while(current.data!=key)
		{
			current = current.next;
			count++;	
		}
		if(current.data==key)
		{
			System.out.println("your element is at"+ count+1);
		}
		if(current.next==null)
		{
			System.out.println("key not found");	
		}
		return head;
	}

	public static Node delete_position(Node head) 
	{
		if(head==null)
		{
			System.out.println("list is empty");
			return head;
		}
		if(head.next==null)
		{
			System.out.println("only one element is present in list deleting it ");
			System.out.println(head.data);
			head=null;
			return head;
		}
		else
		{
			Node current = head;
			Node prev = current;
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the position to delete");
			int position=sc.nextInt();
			for(int i=1;i<position;i++)
			{
				prev = current;
				current = current.next;
			}
			System.out.println("deleted element is:"+current.data);
			prev.next=current.next;
			sc.close();
		}
		return head;
		
	
	}

	public static Node insert_position(Node head) 
	{
		Scanner sc = new Scanner(System.in);
		Node node = new Node();
		
		if(head==null)
		{
			System.out.println("we cant insert node here");
		} 
		else
		{
			System.out.println("enter the  position to insert ");
			int position = sc.nextInt();
			Node current = head;
			Node prev = current;
		    System.out.println("enter value to insert");
			int data = sc.nextInt();
			node.data=data;
			node.next=null;
			for(int i=1;i<position;i++)
			{
	
				prev=current;
				current=current.next;
			}
			prev.next=node;
			node.next=current;
			return head;
		}
		return node;
		
	}
	public static Node delete_front(Node head) 
	{
		if(head==null)
		{
		System.out.println("list is empty");
		}
		else
		{
			System.out.println("deleted element is:"+head.data);
			head = head.next;
	
		}
		return head;
	}

	public static Node insert_front(Node head) 
	{
		Scanner sc1 = new Scanner(System.in);
		Node node = new Node();
		System.out.println("enter the value to insert");
		int data = sc1.nextInt();
		node.data=data;
		node.next=null;
		if(head==null)
		{
			head = node;
			return head;	
		}
		else
		{
			node.next=head;
			head = node;		
		}
	
		return head;
	}

	public static Node display(Node head) 
	{
		if(head == null)
		{
			System.out.println("list is empty");
			return head;
		}
		if(head.next==null)
		{
			System.out.println(head.data);
		}
		else
		{
			Node current = head;
			while( current.next!=null)
			{
				System.out.println(current.data);
			current = current.next;
			
			}
			System.out.println(current.data);
		}
		return head;
		
	}

	public static Node delete_end(Node head) 
	{
		if(head==null)
		{
			System.out.println("list is empty");
			return head;
		
		}
		if(head.next==null)
		{
			System.out.println("deleted element is:"+head.data);
			head=null;
			return head;
		}
		else
		{
			Node current = head;
			Node prev = current;
			while(current.next!=null)
			{
				prev = current;
				current = current.next;
				
			}
			System.out.println("deleted element is:"+current.data);
			prev.next=null;
		}
		return head;
	}

	public static Node insert_end(Node head) 
	{
		Scanner sc1 = new Scanner(System.in);
		Node node = new Node();
		System.out.println("enter the value to insert");
		int data = sc1.nextInt();
		node.data=data;
		node.next=null;
		if(head==null)
		{
			head=node;
			return head;
		}
		else
		{
			Node current = head;
			while(current.next!=null)
			{
				current = current.next;
			}
			current.next = node;
		}
		return head;
	}


}
