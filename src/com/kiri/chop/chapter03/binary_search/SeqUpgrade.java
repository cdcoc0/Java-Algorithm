package com.kiri.chop.chapter03.binary_search;

import java.util.Scanner;

public class SeqUpgrade {
	
	static int searchIdx(int[] a, int n, int key, int[] idx) {
		int i = 0;
		int sum = 0;
		
		for(i = 0; i < n; i++) {
			if(a[i] == key)
				idx[sum++] = i;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요솟수: ");
		int num = stdIn.nextInt();
		int[] x = new int[num];
		int[] y = new int[num];
		
		for(int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]: ");
			x[i] = stdIn.nextInt();
		}
		
		System.out.print("찾는 값: ");
		int ky = stdIn.nextInt();
		
		int sum = searchIdx(x, num, ky, y);
		
		if(sum == 0)
			System.out.println("해당 값 없음");
		else
			for(int i = 0; i <sum; i++) {
				System.out.println("x[" + y[i] + "]");
			}
	}
}
