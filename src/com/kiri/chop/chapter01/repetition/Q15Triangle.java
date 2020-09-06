package com.kiri.chop.chapter01.repetition;

public class Q15Triangle {
	static void triangleLB(int a) {
		
		//int a만큼 세로 변 길이
		//int a만큼 가로 증가
		for(int i = 1; i <= a; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	//왼쪽 위가 직각인 이등변 삼각형
	static void triangleLU(int n) {
		
		//int n만큼 세로
		//int n부터 가로 감소
		for(int i = 1; i <= n; i++) {
			for(int j = n; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	/*static void triangleLU(int n) {
		for (int i = 1; i <= n; i++) { 				// i행 (i = 1, 2, … ,n)
			for (int j = 1; j <= n - i + 1; j++) 	// n-i+1개의 '*'를 나타냄
				System.out.print('*');
			System.out.println(); 					// 개행(줄변환)
		}
	}*/
	
	//오른쪽 위가 직각인 이등변 삼각형
	static void triangleRU(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				if(j < i)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}
	/*static void triangleRU(int n) {
		for (int i = 1; i <= n; i++) { 				// i행 (i = 1, 2, … ,n)
			for (int j = 1; j <= i - 1; j++) 		// i-1개의 ' '를 나타냄
				System.out.print(' ');
			for (int j = 1; j <= n - i + 1; j++) 	// n-i+1개의 '*'를 나타냄
				System.out.print('*');
			System.out.println();					// 개행(줄변환)
		}
	}*/
	
	//오른쪽 아래가 직각인 이등변 삼각형
	static void triangleRB(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n-i; j++) {
				System.out.print(" ");
			}
			
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		triangleLB(6);
		triangleLU(8);
		triangleRU(5);
		triangleRB(7);
	}
}
