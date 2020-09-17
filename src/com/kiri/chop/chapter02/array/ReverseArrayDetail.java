package com.kiri.chop.chapter02.array;

import java.util.Scanner;

public class ReverseArrayDetail {
	
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void reverse(int[] a) {
		
		for(int i = 0; i < a.length / 2; i++) {
			System.out.println("a[" + i + "]과(와) a[" + (a.length - i - 1) +"]를 교환");
			swap(a, i, a.length - i - 1);
			
			for(int j = 0; j < a.length; j ++) {
				System.out.print(a[j] + " ");
			}
			System.out.println("");
		}
		System.out.println("역순 정렬 종료");
	}
	
	/*// 배열의 요소 a[idx1]와 a[idx2]를 교환
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	// 배열 a의 요소 값을 나타냄
	static void print(int[] a) {
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}

	// 배열 a의 요소를 역순으로 정렬
	static void reverse(int[] a) {
		print(a);
		for (int i = 0; i < a.length / 2; i++) {
			System.out.println("a[" + i + "]와 a[" + (a.length - i - 1) + "]를 교환합니다.");
			swap(a, i, a.length - i - 1);
			print(a);
		}
	}*/
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("요솟수: ");
		int n = stdIn.nextInt();
		
		int[] x = new int[n];
		
		for(int i = 0; i < x.length; i++) {
			System.out.println("x[" + i + "]: ");
			x[i] = stdIn.nextInt();
		}
		
		reverse(x);
		
		System.out.println("요소를 역순으로 정렬");
		
		for(int i = 0; i < n; i++) {
			System.out.println("x[" +i + "]: " + x[i]);
		}
		
	}
}