package com.kiri.chop.chapter02.array;

import java.util.Scanner;

public class LeftDayOfYear {
	
	static int[][] mdays = {
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},			
	};
	
	static int isLeap(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
	}
	
	static int leftDayOfYear(int y, int m, int d) {
		//m월은 해당 월 일수에서 빼기
		int day = mdays[isLeap(y)][m-1] - d;
		
		for(int i = m; i <= 12; i++) {
			day += mdays[isLeap(y)][m];
		}
		
		/*int days = d; // 일수

		for (int i = 1; i < m; i++) // 1월~(m-1)월의 일 수를 더함
			days += mdays[isLeap(y)][i - 1];
		return 365 + isLeap(y) - days;*/
		
		return day;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int retry;
		
		System.out.println("그 해의 남은 일 수 구하기");
		
		do {
			System.out.print("년: "); int year = stdIn.nextInt();
			System.out.print("월: "); int month = stdIn.nextInt();
			System.out.print("일: "); int day = stdIn.nextInt();
			
			System.out.printf("남은 일수: %d\n", leftDayOfYear(year, month, day));
			
			System.out.println("더? (1.예 / 2.아니오)");
			retry = stdIn.nextInt();
		} while(retry == 1);
	}
}
