package com.kiri.chop.chapter05.recursive;

import java.util.Scanner;

public class Q1factorial {
	
	static int factorial(int n) {
		int f = 1;
		
		for(; n >= 1; n--) {
			f *= n;
		}
		return f;
	}
	
	/*static int factorial(int n) {
		int fact = 1;

		while (n > 1)
			fact *= n--;
		return (fact);
	}*/
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("팩토리얼 구하기:");
		int n = stdIn.nextInt();
		
		System.out.println(n + "! = " + factorial(n));
	}
}
