package com.kiri.chop.chapter02.array;

import java.util.Scanner;

//�� �迭�� ��� ���� ������
public class ArrayEqual {
	
	static boolean equals(int[] a, int[] b) {
		if(a.length != b.length)
			return false;
		
		for(int i = 0; i < a.length; i++) {
			if(a[i] != b[i])
				return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("�迭 a�� ��ڼ�: ");
		int na = stdIn.nextInt();
		int[] a = new int[na];
		
		for(int i = 0; i < na; i++) {
			System.out.println("a[" + i + "]�� ��: ");
			a[i] = stdIn.nextInt();
		}
		
		System.out.println("�迭 b�� ��ڼ�: ");
		int nb = stdIn.nextInt();
		int[] b = new int[nb];
		
		for(int i = 0; i < nb; i++) {
			System.out.println("b[" + i + "]�� ��: ");
			b[i] = stdIn.nextInt();
		}
		
		System.out.println("�迭 a�� b�� " + 
		(equals(a, b) ? "����." : "���� �ʴ�."));
	}
}