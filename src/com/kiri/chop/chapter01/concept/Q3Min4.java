package com.kiri.chop.chapter01.concept;

public class Q3Min4 {
	
	static int min4(int a, int b, int c, int d) {
		
		int min = a;
		
		if(b < min)
			min = b;
		
		if(c < min)
			min = c;
		
		if(d < min)
			min = d;
		
		return min;
	}
	
	public static void main(String[] args) {
		
		System.out.println("min4(4, 3, 2, 1) = " + min4(4, 3, 2, 1));
		System.out.println("min4(5, 3, 3, 1) = " + min4(5, 3, 3, 1));
		System.out.println("min4(2, 2, 2, 1) = " + min4(2, 2, 2, 1));
		System.out.println("min4(3, 4, 1, 1) = " + min4(3, 4, 1, 1));
		System.out.println("min4(1, 3, 2, 4) = " + min4(1, 3, 2, 4));
	}
}
