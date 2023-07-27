package sorting;

import java.util.Arrays;
import java.util.Iterator;

public class quicksort {

	public static void quicksort(int[] a, int left, int right) {

		if (left >= right)
			return;

		int i = 0, j = right;
		
		while (i < j) {
			while (a[i] <= a[left]) {
				i++;
			}

			while (a[j] > a[left]) {
				j--;
			}

			if (i < j)
				swap(a, i, j);
		}

		swap(a,j,left);
		quicksort(a, left, j - 1);
		quicksort(a, j + 1, right);
	}

	public static void swap(int a[], int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public static void main(String[] args) {
		int a[] = { 2, 8, 6, 9, 4, 3, 7 };
		System.out.println(Arrays.toString(a));
		quicksort(a, 0, a.length - 1);
		System.out.println(Arrays.toString(a));

	}
}
