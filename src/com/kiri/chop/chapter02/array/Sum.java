package com.kiri.chop.chapter02.array;

import java.util.Scanner;

public class Sum {
	static int sumOf(int[] a) {
		
		int sum = 0;
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("배열 요소의 합 구하기");
		System.out.println("요솟수: ");
		int n = stdIn.nextInt();
		
		int[] x = new int[n];
		
		for(int i = 0; i < n; i++) {
			System.out.println("x[" + i + "]의 값: ");
			x[i] = stdIn.nextInt();
		}
		
		System.out.println("배열 요소들의 합: " + sumOf(x));
	}
}
