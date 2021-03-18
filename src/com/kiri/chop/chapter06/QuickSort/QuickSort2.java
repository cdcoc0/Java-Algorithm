package com.kiri.chop.chapter06.QuickSort;

public class QuickSort2 {
	
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	static void quickSort(int[] a, int left, int right) {
		IntStack lstack = new IntStack(right - left + 1);
		IntStack rstack = new IntStack(right - left + 1);
		
		lstack.push(left);
		rstack.push(right);
		
		while(lstack.isEmpty() != true) {
			int pl = left = lstack.pop(); //���� Ŀ��
			int pr = right = rstack.pop(); //������ Ŀ��
			int x = a[(left + right) / 2]; //�ǹ�
			
			do {
				while(a[pl] < x) pl++;
				while(x < a[pr]) pr--;
				if(pl <= pr)
					swap(a, pl++, pr--);
			} while(pl <= pr);
			
			if(left < pr) {
				lstack.push(left);
				rstack.push(pr);
			}
			
			if(pl < right) {
				lstack.push(pl);
				rstack.push(right);
			}
		}
	}
}
