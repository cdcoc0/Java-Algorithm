package com.kiri.chop.chapter01.repetition;

import java.util.Scanner;

public class Q7SumFor {
	public static void main(String[] args) {
		
		//1부터 n까지 정수의 합을 구하는 알고리즘을 만들되, 계산 과정을 모두 출력하도록 코드 작성
		
		Scanner stdIn = new Scanner(System.in);
		System.out.println("1부터 n까지 정수의 합");
		System.out.println("n값을 입력하세요.");
		int n = stdIn.nextInt();
		
		int sum = 0;
		
		for(int i = 1; n >= i; i++) {
			for(i = 1; n > i; i++) {
				System.out.print(i + "+");
			}
			System.out.print(i);

			sum += i;
		}
		System.out.println(" = " + sum);
		
		
		//교재 해답
		n = stdIn.nextInt();

		sum = 0; // 합

		for (int i = 1; i <= n; i++) {
			if(i < n)
				System.out.print(i + " + ");
			else
				System.out.print(i);
			sum += i; // sum에 i를 더함
		}
		System.out.println(" = " + sum);
	}
}
