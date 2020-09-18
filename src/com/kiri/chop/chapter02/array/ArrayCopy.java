package com.kiri.chop.chapter02.array;

import java.util.Scanner;

public class ArrayCopy {
	
	static void copy(int[] a, int[] b) {
		
		int n = a.length <= b.length ? a.length : b.length;
		
		for(int i = 0; i < n; i++) {
			a[i] = b[i];
		}
	}
	
	
	//a가 b보다 요솟수가 많은 경우 뒷부분은 그냥 냅둔다.
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("배열 a의 요솟수: ");
		int na = stdIn.nextInt();
		int[] a = new int[na];
		
		for(int i = 0; i < na; i++) {
			System.out.println("a[" + i + "]: ");
			a[i] = stdIn.nextInt();
		}
		
		System.out.println("배열 b의 요솟수: ");
		int nb = stdIn.nextInt();
		int[] b = new int[nb];
		
		for(int i = 0; i < nb; i++) {
			System.out.println("b[" + i + "]: ");
			b[i] = stdIn.nextInt();
		}
		
		System.out.println("배열 b를 배열 a에 복사복사");
		copy(a, b);
		
		for(int i = 0; i < na; i++) {
			System.out.println("a[" + i + "]: " + a[i]);
		}
	}
}
