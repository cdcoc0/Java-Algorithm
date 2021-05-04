package com.kiri.chop.chapter06.StraightSelectionSort;

public class Test {
	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		while(i < 10) {
			i++;
			if(i % 2 == 1)
				continue;
			sum += i;
		}
		
		System.out.println(sum);
	}
}
