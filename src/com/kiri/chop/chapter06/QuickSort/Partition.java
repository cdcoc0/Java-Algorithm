package com.kiri.chop.chapter06.QuickSort;

import java.util.Scanner;

public class Partition {
	//�迭 ��� a[idx1]�� a[idx2]�� ���� �ٲ�
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	//�迭�� ����
	static void partition(int[] a, int n) {
		int pl = 0; //���� Ŀ��
		int pr = n - 1; //������ Ŀ��
		int x = a[n / 2]; //�ǹ�(��� ��ġ ��)
		
		do {
			while(a[pl] < x) pl++;
			while(a[pr] > x) pr--;
			if(pl <= pr) 
				swap(a, pl++, pr--);
		} while(pl <= pr);
		
		System.out.println("�ǹ� ��: " + x);
		
		System.out.println("�ǹ� ������ �׷�");
		for(int i = 0; i <= pl - 1; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		if(pl > pr + 1) {
			System.out.println("�ǹ��� ��ġ�ϴ� �׷�");
			for(int i = pr + 1; i <= pl - 1; i++) {
				System.out.print(a[i] + " ");
			}
			System.out.println();
		}
		
		System.out.println("�ǹ� �̻��� �׷�");
		for(int i = pr + 1; i < n; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("�迭�� �����ϴ�.");
		System.out.print("��ڼ�: ");
		int nx = stdIn.nextInt();
		int[] x = new int[nx];
		
		for(int i = 0; i < nx; i++) {
			System.out.println("x[" + i + "]: ");
			x[i] = stdIn.nextInt();
		}
		partition(x, nx);
	}
}