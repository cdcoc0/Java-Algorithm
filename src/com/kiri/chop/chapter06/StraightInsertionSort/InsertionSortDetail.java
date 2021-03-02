package com.kiri.chop.chapter06.StraightInsertionSort;

import java.util.Scanner;

public class InsertionSortDetail {
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void insertionSortDetail(int[] a, int n) {
		for(int i = 1; i < n; i++) {
			int j;
			int tmp = a[i];
			for(j = i; j > 0 && a[j - 1] >= tmp; j--) {
				a[j] = a[j - 1];
			}
			a[j] = tmp;
			for(int k = 0; k < n; k++) {
				if(k == i - 1)
					System.out.print("*");
				else if(k == j)
					System.out.print("+");
				System.out.print("	");
			}
			System.out.println();
			
			for(int k = 0; k < n; k++) {
				System.out.printf("%d\t", a[k]);
			}
			System.out.println();
		}
	}
	
	public static void main(String args[]) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("´Ü¼ø »ðÀÔ Á¤·Ä");
		System.out.print("¿ä¼Ú¼ö: ");
		int na = stdIn.nextInt();
		int[] a = new int[na];
		
		for(int i = 0; i < na; i++) {
			System.out.print("a[" + i + "]: ");
			a[i] = stdIn.nextInt();
		}
		
		insertionSortDetail(a, na);
		
		System.out.println("¿À¸§Â÷·é Á¤·Ä");
		for(int i = 0; i < na; i++) {
			System.out.println("a[" + i + "]= " + a[i]);
		}
	}
}
