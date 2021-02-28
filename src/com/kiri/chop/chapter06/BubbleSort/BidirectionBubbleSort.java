package com.kiri.chop.chapter06.BubbleSort;

import java.util.Scanner;

public class BidirectionBubbleSort {
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void bidirectionBubbleSort(int[] a, int n) {		
		int right = n - 1;
		int left = 0;
		int last = right;
		while(left < right) {
			
			for(int j = right; j > left; j--) {
				if(a[j] < a[j - 1]) {
					swap(a, j, j - 1);
					last = j;
				}
			}
			left = last;
			
			for(int j = left; j < right; j++) {
				if(a[j] > a[j + 1]) {
					swap(a, j, j + 1);
					last = j;
				}
			}
			right = last;
		}
	}
	
	public static void main(String args[]) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("¿ä¼Ú¼ö: ");
		int na = stdIn.nextInt();
		int[] a = new int[na];
		
		for(int i = 0; i < na; i++) {
			System.out.print("a[" + i + "]:");
			a[i] = stdIn.nextInt();
		}
		
		bidirectionBubbleSort(a, na);
		
		System.out.println("°á°ú: ");
		for(int i = 0; i < na; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
	}
}
