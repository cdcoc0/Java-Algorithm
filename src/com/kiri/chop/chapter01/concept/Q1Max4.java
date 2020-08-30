package com.kiri.chop.chapter01.concept;

public class Q1Max4 {
	
	//³× °©½ºÀÌ ÃÖ´ñ°ª ±¸ÇÏ±â
	static int max4(int a, int b, int c, int d) {
		int max = a;
		
		if(b > max)
			max = b;
		
		if(c > max)
			max = c;
		
		if(d > max)
			max = d;
		
		return max;
	}
	
	public static void main(String[] args) {
		
		System.out.println("max4(4, 3, 2, 1) = " + max4(4, 3, 2, 1));
		System.out.println("max4(4, 3, 2, 1) = " + max4(3, 4, 1, 2));
		System.out.println("max4(4, 3, 2, 1) = " + max4(2, 1, 3, 4));
		System.out.println("max4(4, 3, 2, 1) = " + max4(2, 4, 1, 3));
		System.out.println("max4(4, 3, 2, 1) = " + max4(4, 1, 3, 2));
	}
}
