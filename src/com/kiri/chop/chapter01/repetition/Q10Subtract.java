package com.kiri.chop.chapter01.repetition;

import java.util.Scanner;

public class Q10Subtract {
	public static void main(String[] args) {
		
	Scanner stdIn = new Scanner(System.in);
	
	int a;
	int b;
	
	//두 변수 입력
	System.out.println("변수 b-a를 계산합니다.");
	System.out.println("a: ");
	a = stdIn.nextInt();
	System.out.println("b: ");
	b = stdIn.nextInt();
	
	//b > a 판단
	while(b <= a) {
		System.out.println("a보다 큰 값을 입력하세요.");
		System.out.println("b: ");
		b = stdIn.nextInt();
	}
	//계산 실행
	System.out.println("b-a = " + (b-a));
	
	/*Scanner stdIn = new Scanner(System.in);

		System.out.print("a의 값：");
		int a = stdIn.nextInt();

		int b=0;
		while (true) {
			System.out.print("b의 값：");
			b = stdIn.nextInt();
			if (b > a)
				break;
			System.out.println("a보다 큰 값을 입력하세요!");
		}

		System.out.println("b - a는 " + (b - a) + "입니다.");*/
	
	}
}
