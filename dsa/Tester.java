package dsa;

import java.util.Scanner;

public class Tester
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		SinglyLinkedList list=new SinglyLinkedList();
		list.insertByValue(new Product(1, "Chips", 40, 10));
		list.insertByValue(new Product(2, "Sugar", 50, 20));
		list.insertByValue(new Product(3, "Nuts", 60, 30));
		list.insertByValue(new Product(4, "Biscuits", 70, 40));
		list.insertByValue(new Product(5, "Butter", 80, 50));
		int ch=1;
		while(ch>0)
		{
			System.out.println("1.Insert in position");
			System.out.println("2.Insert by value");
			System.out.println("3.delete by position");
			System.out.println("4.Delete by value");
			System.out.println("5.Middle element");
			System.out.println("6.Search by pname");
			System.out.println("7.delete alternative nodes");
			System.out.println("8.Sort desc");
			System.out.println("9.delete from third");
			System.out.println("10.Display nodes");
			System.out.println("11.reverse order");
			System.out.println("----------------------------------------");
			System.out.println("Eneter your choice :");
			System.out.println("----------------------------------------");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Enter position : ");
				int pos=sc.nextInt();
				System.out.println("Enter product details");
				list.insertAt(pos, new Product(sc.nextInt(),sc.next(),sc.nextDouble(),sc.nextInt()));
				break;
			case 2:
				System.out.println("Enter product details ");
				list.insertByValue(new Product(sc.nextInt(),sc.next(),sc.nextDouble(),sc.nextInt()));
				break;
			case 3:
				System.out.println("Enter position : ");
				list.deleteByPosistion(sc.nextInt());
				break;
			case 4:
				System.out.println("Enter a price for deleting product :");
				list.deleteteByValue(sc.nextDouble());
				break;
			case 5:
				list.middleProduct();
				break;
			case 6:
				System.out.println("Enter product name : ");
				list.serchByName(sc.next());
				break;
			case 7:
				list.deleteAlternate();
				break;
			case 8:
				System.out.println("Sorting products :");
				list.sorting();
				break;
			case 9:
				System.out.println("Nodes from 3rd last node");
				list.diplayFromThirdPos();
				break;
			case 10:
				System.out.println("Products are : ----------");
				list.display();
				System.out.println("---------------------------------------------");
				break;
			case 11:
				System.out.println("Products in reverse order-------------------");
				list.reverseOrder();;
				break;
				default:
					System.out.println("Invalid input-");
					break;
			}

		}
		
	}

}
