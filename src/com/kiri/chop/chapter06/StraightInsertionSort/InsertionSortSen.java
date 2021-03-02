package com.kiri.chop.chapter06.StraightInsertionSort;

public class InsertionSortSen {
	static void insertionSortSen(int[] a, int n) {
		for(int i = 2; i < n; i++) {
			int tmp = a[0] = a[i];
			int j = i;
			for(; a[j - 1] > tmp; j--) {
				a[j] = a[j - 1];
			}
			
			if(j > 0)
				a[j] = tmp;
		}
	}
}
