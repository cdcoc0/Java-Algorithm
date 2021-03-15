package com.kiri.chop.chapter06.StraightInsertionSort;

public class Ex1 {
	static void ex1(int[] a, int n) {
		for(int i = 1; i < n; i++) {
			int j;
			int tmp = a[i];
			for(j = i; j > 0 && a[j - 1] > tmp ;j--) 
					a[j] = a[j - 1];
			a[j] = tmp;
		}
	}
}
