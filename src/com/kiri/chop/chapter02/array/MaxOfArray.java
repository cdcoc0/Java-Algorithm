package com.kiri.chop.chapter02.array;

import java.util.Scanner;

//값을 입력 받아 배열 요소의 최댓값을 구한다.

public class MaxOfArray {
	
	static int maxOf(int[] a) {
		
		int max = a[0];
		for(int i = 1; i < a.length; i++) {
			if(a[i] > max)
				max = a[i];
		}
		return max;
	}
	
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("키의 최댓값 구하기");
		System.out.print("사람 수: ");
		int num = stdIn.nextInt();
		
		int[] height = new int[num];
		
		for(int i = 0; i < num; i++) {
			System.out.println("키는?");
			height[i] = stdIn.nextInt();
		}
		
		System.out.println("키 최댓값: " + maxOf(height));
	}
}
