package com.kiri.chop.chapter05.recursive;

import java.util.Scanner;

public class Factorial {
	
	static int factorial(int n) {
		if(n > 0)
			return n * factorial(n - 1); //자기 자신 호출
		else
			return 1;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수 입력: ");
		int x = stdIn.nextInt();
		
		System.out.println(x + "의 팩토리얼: " + factorial(x));
	}
}
