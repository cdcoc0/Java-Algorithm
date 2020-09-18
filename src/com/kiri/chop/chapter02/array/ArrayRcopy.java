package com.kiri.chop.chapter02.array;

import java.util.Scanner;

public class ArrayRcopy {
	static void rcopy(int[] a, int[] b) {
		int n = a.length <= b.length ? a.length : b.length;
		
		for(int i = 0; i < n; i++) {
			a[i] = b[n - i - 1];
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("a요솟수: ");
		int na = stdIn.nextInt();
		
		int[] a = new int[na];
		for(int i = 0; i < na; i++) {
			System.out.println("a[" + i + "]: ");
			a[i] = stdIn.nextInt();
		}
		
		System.out.println("b요솟수: ");
		int nb = stdIn.nextInt();
		
		int[] b = new int[nb];
		for(int i = 0; i < nb; i++) {
			System.out.println("b[" + i + "]: ");
			b[i] = stdIn.nextInt();
		}
		
		System.out.println("배열 b의 요소를 배열 a에 역순으로 복사");
		rcopy(a, b);
		
		for(int i = 0; i < na; i++) {
			System.out.println("a[" + i + "]: " + a[i]);
		}
	}
}
