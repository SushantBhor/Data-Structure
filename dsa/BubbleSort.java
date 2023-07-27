package dsa;

import java.util.Scanner;

public class BubbleSort
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int[] arr1=bubbleSort(arr);
		for(int i:arr1)
		{
			System.out.print(i+"  ");
		}
		
	}
	public static int[] bubbleSort(int[] arr)
	{
		int inner=0,outer=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					System.out.println("Swapped elements : "+ arr[j]+" "+arr[i]);
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
				inner++;
			}
			outer++;
		}
		System.out.println("Number of inner passes are :"+inner);
		System.out.println("Number of outer passes are :"+outer);
		return arr;
	}

}
