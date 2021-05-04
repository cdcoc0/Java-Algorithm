package com.kiri.chop.chapter06.QuickSort;

public class QuickSortReivse {
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void quickSortRevise(int[] a, int left, int right) {
		int pl = left;
		int pr = right;
		int x = a[(pl + pr) / 2];
		
		do {
			while(a[pl] < x) pl++;
			while(a[pr] > x) pr--;
			if(pl <= pr)
				swap(a, pl++, pr--);
		} while(pl <= pr);
		if(left <pr) 
			quickSortRevise(a, left, pr);
		if(pl < right)
			quickSortRevise(a, pl, right);
	}
}
