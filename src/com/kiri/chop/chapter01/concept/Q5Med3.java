package com.kiri.chop.chapter01.concept;

public class Q5Med3 {
	
	static int med3m(int a, int b, int c) {
		if((b >= a && a >= c) || (a >= b && c >= a))
			return a;
		
		if((a > b && b > c) || (b > a && c > b))
			return b;
		
		else
			return c;
	}
	
	//각 if문 안에 같은 조건 판단이 중첩되어 효율적이지 못하다.
}
