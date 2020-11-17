package com.kiri.chop.chapter05.recursive;

public class Q2gcd {
	static int gcd(int x, int y) {
		while (y != 0) {
			int temp = y;
			y = x % y;
			x = temp;
		}
		return x;
	}
}
