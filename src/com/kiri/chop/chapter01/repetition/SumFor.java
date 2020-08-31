package com.kiri.chop.chapter01.repetition;

import java.util.Scanner;

public class SumFor {
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1부터 n까지 정수의 합");
		System.out.println("n값을 입력하세요.");
		int n = stdIn.nextInt();
		
		int sum = 0;
		
		for(int i = 1; i <= n; i++) {
			
			sum += i;
		}
		
		System.out.println("1부터 " + n + "까지의 합: " + sum);
	}
}
