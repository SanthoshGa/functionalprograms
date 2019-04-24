package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class RemoveDuplicates
{
	static class Node
	{  
        static int data;  
        Node next;  
  
        public Node(int data) 
        {  
            this.data = data;  
            this.next = null;  
        } 
        public static void main(String[] args) 
        {
        	Scanner sc = new Scanner(System.in);
        	System.out.println("enter \n1.addNode\n2.removeDuplicate\n3.display");
        	int choice = sc.nextInt();
        	switch(choice)
        	{
        	case 1:addNode(data);
        	       break;
        	case 2:removeDuplicate();
        	       break;
        	case 3:display();
        	       break;
        	}
        	
			
		}
    }  
   
    public static Node head = null;  
    public static Node tail = null;  
  
     
    public static void addNode(int data) 
    {
    	while(true)
    	{
    	Scanner sc = new Scanner(System.in);
    	System.out.println("enter elements to add");
    	int data1 = sc.nextInt();
          
        Node newNode = new Node(data1);    
        if(head == null) 
        {   
            head = newNode;  
            tail = newNode;  
        }  
        else 
        {  
             
            tail.next = newNode;  
            tail = newNode;  
        }
    	}	
    }   
    public static void removeDuplicate() 
    {   
        Node current = head, index = null, temp = null;  
  
        if(head == null) 
        {  
            return;  
        }  
        else 
        {  
            while(current != null)
            {    
                temp = current; 
                index = current.next;  
  
                while(index != null) 
                {  
                    
                    if(current.data == index.data) 
                    {  
                        temp.next = index.next;  
                    }  
                    else 
                    {  
                       
                        temp = index;  
                    }  
                    index = index.next;  
                }  
                current = current.next;  
            }  
        }  
    }  
   
    public static void display() 
    {  
        Node current = head;  
        if(head == null) 
        {  
            System.out.println("List is empty");  
            return;  
        }  
        while(current != null) 
        {  
             
            System.out.print(current.data + " ");  
            current = current.next;  
        }  
        System.out.println();  
    }  

}
