package com.kiri.chop.chapter03.binary_search;

import java.util.Scanner;

public class SeqSearchSenFor {
	
	static int seqSearchSen(int[] a, int n, int key) {
		int i = 0;
		a[n] = key;
		
		for(i = 0; a[i] == key; i++) {
			
		}
		return i == n ? -1 : i;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요솟수: ");
		int num = stdIn.nextInt();
		int[] x = new int[num + 1];
		
		System.out.println("요소 입력");
		for(int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]: ");
			x[i] = stdIn.nextInt();
		}
		
		System.out.print("찾을 값: ");
		int ky = stdIn.nextInt();
		
		int idx = seqSearchSen(x, num, ky);
		if(idx == -1)
			System.out.println("해당 결과 없음");
		else
			System.out.println(ky + "은(는) x[" + idx + "]");
	}
}
