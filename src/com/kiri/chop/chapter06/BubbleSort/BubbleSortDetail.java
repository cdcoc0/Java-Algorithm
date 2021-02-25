package com.kiri.chop.chapter06.BubbleSort;

import java.util.Scanner;

public class BubbleSortDetail {
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void bubbleSortD(int[] a, int n) {
		int compare = 0;
		int pass = 0;
		
		for(int i = 0; i < n - 1; i++) {
			System.out.println("ÆÐ½º" + (i + 1));
			
			
			for(int j = n - 1; j > i; j--) {
				if(a[j] < a[j - 1]) {
					for(int k = 0; k < n; k++) {
						if(k == j)
							System.out.printf("+%d\t", a[k]);
						else
							System.out.printf("%d\t", a[k]);
					}
					swap(a, j, j - 1);
					pass++;
				} else {
					for(int k = 0; k < n; k++) {
						if(k == j)
							System.out.printf("-%d\t", a[k]);
						else
							System.out.printf("%d\t", a[k]);
					}
				}
				System.out.println();
				compare ++;
			}
		}
		System.out.println("ºñ±³ È½¼ö: " + compare);
		System.out.println("±³È¯ È½¼ö:" + pass);

	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("¿ä¼Ú¼ö: ");
		int na = stdIn.nextInt();
		int[] a = new int[na];
		
		for(int i = 0; i < na; i++) {
			System.out.println("a[" + i + "]: ");
			a[i] = stdIn.nextInt();
		}
		
		bubbleSortD(a, na);
		for(int i = 0; i < na; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
	}
}
