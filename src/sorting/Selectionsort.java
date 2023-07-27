package sorting;

import java.util.Arrays;
import java.util.Iterator;

public class Selectionsort {

	public static void selection(int[] a,int n) {
		
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<=n;j++)
			{
				if(a[j]<a[i])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
				
	}
	public static void main(String[] args) {
		int a[] = { 2, 8, 6, 9, 4, 3, 7 };
		System.out.println(Arrays.toString(a));
		selection(a,a.length - 1);
		System.out.println(Arrays.toString(a));

	}
}
