package sorting;

import java.util.Arrays;
import java.util.Iterator;

public class insertionsort {

	public static void insertion(int[] a, int n) {
		
		for(int i=1;i<=n;i++)
		{
			int key=a[i];
			int j=i-1;
			while(j>=0&&a[j]>key)
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
		}	
	}

	
	public static void main(String[] args) {
		int a[] = { 2, 8, 6, 9, 4, 3, 7 };
		System.out.println(Arrays.toString(a));
		insertion(a, a.length - 1);
		System.out.println(Arrays.toString(a));
	}
}
