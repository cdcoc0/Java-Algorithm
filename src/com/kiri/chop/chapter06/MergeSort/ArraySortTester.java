package com.kiri.chop.chapter06.MergeSort;

import java.util.Arrays;
import java.util.Scanner;

//Arrays.sort 메서드 사용해 정렬(퀵 정렬)
public class ArraySortTester {
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("요솟수: ");
		int num = stdIn.nextInt();
		int[] x = new int[num];
		
		for(int i = 0; i < num; i++) {
			System.out.println("x[" + i + "]: ");
			x[i] = stdIn.nextInt();
		}
		
		Arrays.sort(x);
		
		System.out.println("오름차순 정렬");
		for(int i = 0; i < num; i++)
			System.out.println("x[" + i + "] = " + x[i]);
	}
}
