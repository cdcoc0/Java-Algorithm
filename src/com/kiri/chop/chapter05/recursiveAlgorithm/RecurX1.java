package com.kiri.chop.chapter05.recursiveAlgorithm;

public class RecurX1 {
	static void recur(int n) {
		while(n > 0) {
			recur(n - 1);
			System.out.println(n);
			n = n - 2;
		}
	}
}
