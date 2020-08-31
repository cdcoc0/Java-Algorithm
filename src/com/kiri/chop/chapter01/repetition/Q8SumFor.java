package com.kiri.chop.chapter01.repetition;

import java.util.Scanner;

public class Q8SumFor {
	public static void main(String[] args) {
		
		//가우스의 덧셈
		Scanner stdIn = new Scanner(System.in);
		System.out.println("1부터 n까지 정수의 합");
		System.out.println("n값을 입력하세요.");
		int n = stdIn.nextInt();
		
		int sum = (n + 1) * (n / 2) + (n % 2 == 1 ? (n + 1) / 2 : 0); // 합
		
	}
}
