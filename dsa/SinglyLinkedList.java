package dsa;

import java.util.ArrayList;
import java.util.List;

public class SinglyLinkedList 
{
	
	static class Node
	{
		private Product product;
		private Node next;
		
		public Node()
		{
			this.product=null;
			this.next=null;	
		}
		public Node(Product product)
		{
			this.product=product;
			this.next=null;	
		}
	}
	
	private Node head;
	
	public void insertAt(int pos,Product product)
	{
		Node node=new Node(product);
		
		if(head==null)
		{
			head=node;
			return;
		}
		
		Node trav=head;
		for(int i=0;i<pos-1;i++)
		{
			trav=trav.next;
		}
		node.next=trav.next;
		trav.next=node;
	}
	
	public void insertByValue(Product product)
	{
		Node node=new Node(product);
				
		if(head==null)
		{
			head=node;
			return;
		}
		node.next=head;
		head=node;
	}
	
	public void deleteByPosistion(int pos)
	{	
		if(head==null)
		{
			System.out.println("Empty List");
			return;
		}
		
		Node trav=head;
		for(int i=0;i<pos-1;i++)
		{
			trav=trav.next;
		}
		trav.next=trav.next.next;
		System.out.println("Deleted Successfully ");
		
	}
	public void deleteteByValue(double pr)
	{
		int count=0;
		if(head==null)
		{
			System.out.println("Empty List");
			return;
		}
		Node trav=head;
		while(trav!=null)
		{
			if(trav.product.getPrice()==pr)
			{
				deleteByPosistion(count);
				System.out.println("Value Delete Successfully");
				return;
			}
			count++;
			trav=trav.next;
		}
	}
	
	public void middleProduct()
	{
		Node fast=head;
		Node slow=head;
		
		while(fast.next!=null)
		{
			fast=fast.next.next;
			slow=slow.next;
		}
		System.out.println(slow.product);
		
	}
	
	public void serchByName(String name)
	{
		if(head==null)
		{
			System.out.println("Empty List");
			return;
		}
		Node trav=head;
		while(trav!=null)
		{
			if(name.equalsIgnoreCase(trav.product.getName()))
			{
				System.out.println("Given Product is :"+trav.product);
				break;
			}
			trav=trav.next;
		}
	}
	
	public void deleteAlternate()
	{
		int count=0;
		Node trav=head;
		while(trav!=null)
		{
			
			if(count%0==1)
			{
				deleteByPosistion(count);
			}
			count++;
			trav=trav.next;
		}
	}
	
	public void sorting()
	{
		List<Product> list=new ArrayList<Product>();
		Node trav=head;
		while(trav!=null)
		{
			list.add(trav.product);
			trav=trav.next;
		}
		list.stream().sorted((a,b)->((Integer)a.getPid()).compareTo(b.getPid())).forEach(a->System.out.println(a));
	}
	
	
	public void diplayFromThirdPos()
	{
		Node trav=head;
		int count=0;
		while(trav!=null)
		{
			count++;
			trav=trav.next;
		}
		trav=head;
		int pos=count-3;
		count=0;
		while(trav!=null)
		{
			if(count<=pos)
			{
				System.out.println(trav.product);
			}
			count++;
			trav=trav.next;
		}
	}
	
	public void reverseOrder()
	{
		Node oldHead=head;
		head=null;
		while(oldHead.next!=null)
		{
			Node temp=oldHead;
			oldHead=oldHead.next;
			temp.next=head;
			head=temp;
		}
		displayReverse(head);
		
	}
	
	public void display()
	{
		if(head==null)
		{
			System.out.println("List is empty");
		}
		else	
		{
			Node trav=head;
			while(trav!=null)
			{
				System.out.println(trav.product);
				trav=trav.next;
			}
		}
	}
	public void displayReverse(Node head)
	{
		if(head==null)
		{
			System.out.println("List is empty");
		}
		else	
		{
			Node trav=head;
			
			while(trav!=null)
			{
				System.out.println(trav.product);
				trav=trav.next;
			}
		}
	}
	
	
	

}
