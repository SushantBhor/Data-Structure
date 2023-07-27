package searching;

import java.util.Scanner;

public class binarysearch {
	public static int Binarysearch(int[] a, int k) {
		int l = 0, r = a.length - 1;
		while (l < r) {
			int mid = (r - l) / 2;

			if (a[mid] == k)
				return mid;
			if (a[mid] > k)
				r = mid - 1;
			else
				l = mid + 1;
		}
		return -1;
	}

	public static void main(String[] args) {
		int a[] = { 2, 8, 6, 9, 4, 3, 7 };
		System.out.println("Enter the key want to find");
		Scanner sc = new Scanner(System.in);
		int r = Binarysearch(a, sc.nextInt());
		if (r == -1) {
			System.out.println("Key Is Not Found");
			return;
		}
		System.out.println("Key Is Found At Index " + r);
	}

}
