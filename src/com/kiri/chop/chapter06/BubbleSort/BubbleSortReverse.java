package com.kiri.chop.chapter06.BubbleSort;

import java.util.Scanner;

public class BubbleSortReverse {
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void bubbleSortReverse(int[] a, int n) {
		for(int i = n - 1; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				if(a[j] > a[j + 1])
					swap(a, j, j + 1);
			}
		}
	}
	
	public static void main(String args[]) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("요솟수: ");
		int ax = stdIn.nextInt();
		int[] a = new int[ax];
		
		for(int i = 0; i < ax; i++) {
			System.out.print("a[" + i + "]: ");
			a[i] = stdIn.nextInt();
		}
		
		bubbleSortReverse(a, ax);
		System.out.println("역방향 버블정렬");
		
		for(int i = 0; i < ax; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
	}
}
