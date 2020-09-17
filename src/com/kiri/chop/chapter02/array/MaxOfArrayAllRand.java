package com.kiri.chop.chapter02.array;

import java.util.Random;

public class MaxOfArrayAllRand {
	
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
		
		int n = 1 + rand.nextInt(10);
		System.out.println("사람수: " + n);
		
		int[] height = new int[n];
		
		for(int i = 0; i < n; i++) {
			height[i] = 100 + rand.nextInt(90);
			System.out.println("height[" + i + "] = " + height[i]);
		}
		System.out.println("최댓값: " + maxOf(height));
	}
}
