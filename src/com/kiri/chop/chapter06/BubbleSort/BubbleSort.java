package com.kiri.chop.chapter06.BubbleSort;

import java.util.Scanner;

public class BubbleSort {
	
	//a[idx1]와 a[idx2]의 값을 바꾼다.
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	//버블 정렬
	static void bubbleSort(int[] a, int n) {
		for(int i = 0; i < n - 1; i++) {
			for(int j = n - 1; j > i; j--) {
				if(a[j] < a[j - 1])
					swap(a, j, j - 1);
			}
		}
	}
	
	public static void main(String args[]) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("버블 정렬(버전1)");
		System.out.println("요솟수: ");
		int an = stdIn.nextInt();
		int[] a = new int[an];
		
		for(int i = 0; i < an; i++) {
			System.out.print("x[" + i + "]: ");
			a[i] = stdIn.nextInt();
		}
		
		bubbleSort(a, an); //배열 x를 버블정렬
		
		System.out.println("오름차순 정렬");
		for(int i = 0; i < an; i++) {
			System.out.println("x[" + i + "] = " + a[i]);
		}
	}
}
