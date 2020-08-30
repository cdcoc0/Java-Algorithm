package com.kiri.chop.chapter01.concept;

import java.util.Scanner;

public class JudgeSign {
	
	//입력한 정숫값이 양수인지 음수인지 0인지 판단
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요.");
		int n = stdIn.nextInt();
		
		if (n > 0)
			System.out.println("정수입니다.");
		
		else if(n < 0)
			System.out.println("음수입니다.");
		
		else
			System.out.println("0입니다.");
	}
}
