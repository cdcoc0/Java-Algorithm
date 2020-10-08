package com.kiri.chop.chapter03.binary_search;

import java.util.Scanner;

public class BinSearchDetail {
	
	static int binSearchDetail(int[] a, int n, int key) {
		int pl = 0;
		int pr = n - 1;
		System.out.print("\t|");
		for(int i = 0; i < n; i++) {
			System.out.print(" " + i + " ");
		}
		System.out.println();
		System.out.print("----------");
		
		for(int i = 0; i < n; i++) {
			System.out.print("---");
		}
		System.out.println();
		
		do {
			int pc = (pl + pr) / 2;
			System.out.print("\t|");
			for(int i = 0; i <= pr; i++) {
				if(i == pc)
					System.out.print(" + ");
				else if(i == pr)
					System.out.print(" ->");
				else if(i == pl)
					System.out.print(" <-");
				else
					System.out.print("   ");
			}
			System.out.println();
			System.out.print(pc + "\t|");
			for(int i = 0; i < n; i++) {
				System.out.print(" " + a[i] + " ");
			}
			System.out.println();
			
			if(a[pc] == key)
				return pc;
			else if(a[pc] < key)
				pl = pc + 1;
			else
				pr = pc - 1;
		} while(pr >= pl);
		
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요솟수: ");
		int num = stdIn.nextInt();
		int[] x = new int[num];
		
		for(int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]: ");
			x[i] = stdIn.nextInt();
		}
		
		System.out.print("찾을 값: ");
		int ky = stdIn.nextInt();
		
		int idx = binSearchDetail(x, num, ky);
		
		if (idx == -1)
			System.out.println("해당 값 없음");
		else
			System.out.println(ky + "은(는) x[" + idx + "]에 있음");
	}
}
