package com.kiri.chop.chapter01.repetition;

import java.util.Scanner;

public class Q11Digit {
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		int n;
		int sum = 0;
		//값 입력
		System.out.println("양의 정수의 자릿수를 구합니다.");
		do {
			System.out.println("양의 정수를 입력하세요.");
			n = stdIn.nextInt();
		}
		
		while (n <= 0);
		
		//자릿수 계산
		//자릿수만큼 1씩 증가
		for(int i = n; i > 0; i /= 10) {
			
			sum += 1;
		}
		System.out.println(n + "의 자릿수: " + sum);
		
		//답
		/*
		 * Scanner stdIn = new Scanner(System.in);

		System.out.println("양의 정수값의 자릿수를 구합니다.");

		int n;
		do {
			System.out.print("정수값：");
			n = stdIn.nextInt();
		} while (n <= 0);

		int no = 0; 			// 자릿수
		while (n > 0) {
			n /= 10; 			// n을 10으로 나눔
			no++;
		}

		System.out.println("그 수는 " + no + "자리입니다.");
		 */
	}
}
