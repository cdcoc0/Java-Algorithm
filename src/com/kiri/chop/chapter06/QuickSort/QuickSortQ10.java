package com.kiri.chop.chapter06.QuickSort;

public class QuickSortQ10 {
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void quickSort2(int[] a, int n) {
		int pl = 0;
		int pr = n - 1;
		int x = a[(pl + pr) / 2];
		
		do {
			while(a[pl] < x) pl++;
			while(a[pr] > x) pr--;
			if(pl <= pr)
				swap(a, pl++, pr--);
		} while(pl <= pr);
		
		if(0 < pr) quickSort2(a, pr);
		if(pl < n - 1) quickSort2(a, n);
	}
}
