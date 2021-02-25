package com.kiri.chop.chapter06.BubbleSort;

public class BubbleSort3 {
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void bubbleSort3(int[] a, int n) {
		int k = 0;
		while(k < n - 1) {
			int last = n - 1;
			for(int j = n - 1; j > k; j--) {
				if(a[j] < a[j - 1]) {
					swap(a, j, j - 1);
					last = j;
				}
				k = last;
			}
		}
	}
}
