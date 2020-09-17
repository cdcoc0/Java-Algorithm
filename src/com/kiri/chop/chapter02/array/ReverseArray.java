package com.kiri.chop.chapter02.array;

import java.util.Scanner;

//배열 요소의 값을 읽어 역순으로 정렬

public class ReverseArray {
	
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void reverse(int[] a) {
		for(int i = 0; i < a.length / 2; i++) {
			swap(a, i, a.length - i - 1);
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("요솟수: ");
		int n = stdIn.nextInt();
		
		int[] x = new int[n];
		
		for(int i = 0; i < n; i++) {
			System.out.println("x[" + i + "]: ");
			x[i] = stdIn.nextInt();
		}
		
		reverse(x);
		
		System.out.println("요소를 역순으로 정렬");
		for(int i = 0; i < n; i++) {
			System.out.println("x[" + i + "]:" + x[i]);
		}
	}
}