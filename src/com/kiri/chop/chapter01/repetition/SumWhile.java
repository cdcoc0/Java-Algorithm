package com.kiri.chop.chapter01.repetition;

import java.util.Scanner;

public class SumWhile {
	public static void main(String[] args) {
		
		//1부터 n까지의 정수 합 구하기
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합");
		System.out.println("n값을 입력하세요.");
		int n = stdIn.nextInt();
		
		int sum = 0;
		int i = 1;
		
		while(i <= n) {
			sum += i;
			i++;
		}
		
		System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
	}
}
