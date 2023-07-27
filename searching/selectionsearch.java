package searching;

import java.util.Arrays;
import java.util.Scanner;

public class selectionsearch {
	
	public static int selectionsearch(int []a,int k)
	{
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]==k)
				return i;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		int a[]= { 2, 8, 6, 9, 4, 3, 7 };
		System.out.println("Enter the key want to find");
		Scanner sc =new Scanner(System.in);
		int r=selectionsearch(a,sc.nextInt());
		if(r==-1)
		{
		System.out.println("Key Is Not Found");
		return;
		}
		System.out.println("Key Is Found At Index "+r);
	}

}
