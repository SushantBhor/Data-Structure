package sorting;

import java.util.Arrays;
import java.util.Iterator;

public class mergesort {

	public static void merge(int[] a, int left, int right) {
		if (left >= right)
			return;
		
		int mid = (left + right) / 2;
		merge(a, left, mid);
		merge(a, mid + 1, right);
		
		int temp[] = new int[right - left + 1];
		int i = left, k = 0, j = mid + 1;
		while (i <= mid && j <= right) {
			if (a[i] < a[j])
				temp[k++] = a[i++];
			else
				temp[k++] = a[j++];
		}
		while (i <= mid) {
			temp[k++] = a[i++];
		}
		while (j <= right) {
			temp[k++] = a[j++];
		}
		for (i = 0; i < temp.length; i++) {
			a[left+i] = temp[i];
		}
	}

	
	public static void main(String[] args) {
		int a[] = { 2, 8, 6, 9, 4, 3, 7 };
		System.out.println(Arrays.toString(a));
		merge(a, 0, a.length - 1);
		System.out.println(Arrays.toString(a));
	}
}
