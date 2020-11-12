package com.kiri.chop.chapter05.recursive;

import java.util.Scanner;

public class Euclid {
	
	static int gcd(int x, int y) {
		if(y == 0)
			return x;
		else
			return gcd(y, x % y);
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("두 정수의 최대공약수 구하기");
		System.out.println("정수 x: "); int x = stdIn.nextInt();
		System.out.println("정수 y: "); int y = stdIn.nextInt();
		
		System.out.println("x, y의 최대공약수: " + gcd(x, y));
	}
}
