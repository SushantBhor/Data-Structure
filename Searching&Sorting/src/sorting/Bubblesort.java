package sorting;

import java.util.Arrays;
import java.util.Iterator;

public class Bubblesort {

	public static void Bubblesort(int[] a, int n) {

		for (int i = 0; i <=n; i++) {
			for (int k = 0; k <=n - i - 1; k++) {
				if (a[k] > a[k + 1]) {
					int temp = a[k];
					a[k] = a[k + 1];
					a[k + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int a[] = { 2, 8, 6, 9, 4, 3, 7 };
		System.out.println(Arrays.toString(a));
		Bubblesort(a, a.length - 1);
		System.out.println(Arrays.toString(a));

	}
}
