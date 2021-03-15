package com.kiri.chop.chapter06.ShellSort;

import java.util.Scanner;

public class Ex1 {
	static void ex1(int[] a, int n) {
		for(int h = n / 2; h > 0; h /= 2) {
			for(int i = h; i < n; i++) {
				int tmp = a[i];
				int j;
				for(j = i - h; j >= 0 && a[j] > tmp; j -= h) {
					a[j + h] = a[j];
				}
				a[j + h] = tmp;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("�� ����(����1)");
		System.out.println("��ڼ�: ");
		int nx = stdIn.nextInt();
		int[] x = new int[nx];
		
		for(int i = 0; i < nx; i++) {
			System.out.println("x[" + i + "]: ");
			x[i] = stdIn.nextInt();
		}
		
		ex1(x, nx);
		
		System.out.println("�������� ���� �Ϸ�");
		for(int i = 0; i < nx; i++) {
			System.out.println("x[" + i + "] = " + x[i]);
		}
	}
}
