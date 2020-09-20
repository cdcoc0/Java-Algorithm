package com.kiri.chop.chapter02.array;

import java.util.Scanner;

//입력 받은 10진수를 2진수 ~ 36진수로 변환해 나타냄
public class CardConvRev {
	
	//정숫값 x를 r진수로 변환해 배열 d에 아랫자리부터 넣어두고 자릿수 반환
	static int cardConvR(int x, int r, char[] d) {
		
		int digits = 0; // 변환 후의 자릿수
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {
			d[digits++] = dchar.charAt(x % r);
			//++가 digits 뒤에 있기 때문에 대입 후 digits 증가
			x /= r;
		} while (x != 0);
		return digits;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int no; // 변환하는 정수
		int cd; // 기수
		int dno; // 변환 후의 자릿수
		int retry; //다시 한 번?
		char[] cno = new char[32]; // 변환 후 각 자리의 숫자를 넣어두는 문자의 배열
		
		System.out.println("10진수를 기수 변환");
		do {
			do {
				System.out.println("변환하는 음이 아닌 정수");
				no = stdIn.nextInt();
			} while(no < 0);
			
			do {
				System.out.println("어떤 진수로 변환?(2~36)");
				cd = stdIn.nextInt();
			} while(cd < 2 || cd > 36);
			
			dno = cardConvR(no, cd, cno);
			//no를 cd진수로 변환
			
			System.out.println(cd + "진수로는 ");
			for(int i = dno - 1; i >= 0; i--) {
				System.out.print(cno[i]);
			}
			System.out.println();
			
			System.out.println("함 더? (1.예 / 2.아니오): ");
			retry = stdIn.nextInt();
		} while(retry == 1);
	}
}