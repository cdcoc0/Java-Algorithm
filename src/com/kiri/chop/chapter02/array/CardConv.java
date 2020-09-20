package com.kiri.chop.chapter02.array;

import java.util.Scanner;

public class CardConv {
	static int cardConv(int x, int r, char[] d) {
		
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		do {
			d[digits++] = dchar.charAt(x % r);
			x /= r;
			
		} while(x != 0);
		
		for(int i = 0; i < digits / 2; i++) {
			char t = d[i];
			d[i] = d[digits - i - 1];
			d[digits - i - 1] = t;
		}
		
		return digits;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		int cd;
		int dg;
		int retry;
		char[] cno = new char[32];
		
		System.out.println("10진수를 기수로 변환해용");
		
		do {
			do {
				System.out.println("음수가 아닌 정수: ");
				n = stdIn.nextInt();
			} while(n < 0);
			
			do {
				System.out.println("변환할 진수 입력(2~36)");
				cd = stdIn.nextInt();
			} while(cd < 2 || cd > 36);
			
			dg = cardConv(n, cd, cno);
			System.out.print(cd + "진수로는 ");
			
			for(int i = 0; i < dg; i++) {
				System.out.print(cno[i]);
			}
			System.out.println("입니다요");
			
			System.out.println("한 번 더 원해? (1.예 / 2.아니요)");
			retry = stdIn.nextInt();
		} while(retry == 1);
	}
}
