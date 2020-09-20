package com.kiri.chop.chapter02.array;

import java.util.Scanner;

public class CardConvRevDetail {
	static int cardConvR(int x, int r, char[] d) {
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		System.out.println(r + "|	" + x);
		System.out.println(" +----------");
		//System.out.printf(String.format("%%2d | %%%dd\n", n), r, x);
		
		do {
			d[digits++] = dchar.charAt(x % r);
			x /= r;
			
			if(x > 0) {
			System.out.println(r + "|	" + x + " ... " + d[digits - 1]);
			System.out.println(" +----------");
			}
			
			/*System.out.printf("   +");
			for (int i = 0; i < n + 2; i++)
				System.out.print('-');
			System.out.println();

			if (x / r != 0)
				System.out.printf(String.format("%%2d | %%%dd    … %%d\n", n), r, x / r, x % r);
			else
				System.out.printf(String.format("     %%%dd    … %%d\n", n), x / r, x % r);
			d[digits++] = dchar.charAt(x % r); // r로 나눈 나머지를 저장
			x /= r;*/
			
		} while(x != 0);
		
		System.out.println("   	0 ... " + d[digits - 1]);
		
		return digits;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		int cd;
		int dg;
		int retry;
		char[] cno = new char[32];
		
		System.out.println("10진수를 기수로 변환");
		
		do {
			do {
				System.out.println("음이 아닌 정수 입력: ");
				n = stdIn.nextInt();
			} while(n < 0);
			
			do {
				System.out.println("어떤 진수로 변환?(2~36)");
				cd = stdIn.nextInt();
			} while(cd < 2 || cd > 36);
			
			dg = cardConvR(n, cd, cno);
			
			System.out.print(cd + "진수로 ");
			
			for(int i = dg - 1; i >= 0; i--) {
				System.out.print(cno[i]);
			}
			System.out.println("입니다.");
			
			System.out.println("한 번 더? (1.예 / 2.아니오)");
			retry = stdIn.nextInt();
		} while(retry == 1);
	}
}
