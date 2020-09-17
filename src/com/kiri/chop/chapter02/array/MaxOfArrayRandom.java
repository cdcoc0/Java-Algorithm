package com.kiri.chop.chapter02.array;

import java.util.Random;
import java.util.Scanner;

public class MaxOfArrayRandom {
	
	static int maxOf(int[] a) {
		int max = a[0];
		for(int i = 1; i < a.length; i++) {
			if(a[i] > max)
				max = a[i];
		}
		return max;
	}
	
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("키의 최댓값 구하기");
		System.out.println("사람 수: ");
		int n = stdIn.nextInt();
		
		int[] height = new int[n];
		
		System.out.println("키 값: ");
		for(int i = 0; i < n; i++) {
			height[i] = 100 + rand.nextInt(90);
			System.out.println("height[" + i + "] = " + height[i]);
		}
		System.out.println("최댓값: " + maxOf(height));
	}
}
