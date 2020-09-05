package com.kiri.chop.chapter01.repetition;

public class MultipleTable {
	public static void main(String[] args) {
		
		System.out.println("\t-----°ö¼ÀÇ¥-----");
		
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%3d", i * j);
			}
			System.out.println();
		}
	}
}
