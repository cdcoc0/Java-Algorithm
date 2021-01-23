package com.kiri.chop.chapter05.TowerOfHanoi;

public class Q5RecurX3 {
	
	static void recur3(int n) {
		if(n > 0) {
			recur3 (n - 1);
			recur3 (n - 2);
			System.out.println(n);
		}
	}
	
	static void recurX3(int n) {
		int[] a = new int[100];
		int[] b = new int[100];
		int ptr = -1;
		int sw = 0;
		
		while(true) {
			if(n > 0) {
				ptr++;
				a[ptr] = n;
				b[ptr] = sw;
				
				if(sw == 0)
					n = n - 1;
				else if(sw == 1) {
					n = n - 2;
					sw = 0;
				}
				continue;
			}
			
			do {
				n = a[ptr];
				sw = b[ptr--] + 1;
				
				if(sw == 2) {
					System.out.println(n);
					if(ptr < 0)
						return;
				}
			} while(sw == 2);
		}
	}
	
	public static void main(String[] args) {
		recurX3(5);
	}
}
