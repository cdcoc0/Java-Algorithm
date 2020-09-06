package com.kiri.chop.chapter01.repetition;

public class Q16Phyramid {
	static void spira(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= (((n-1)*2+1)-((i-1)*2+1))/2; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= (i-1)*2+1; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	
	static void spira2(int n) {
		for (int i = 1; i <= n; i++) { 					// i행 (i = 1, 2, … ,n)
			for (int j = 1; j <= n - i + 1; j++) 		// n-i+1개의 ' '를 나타냄
				System.out.print(' ');
			for (int j = 1; j <= (i - 1) * 2 + 1; j++) 	// (i-1)*2+1개의 '*'를 나타냄
				System.out.print('*');
			System.out.println(); 						// 개행(줄변환)
		}
	}
	
	public static void main(String[] args) {
		spira(5);
		
		spira2(4);
	}
}
