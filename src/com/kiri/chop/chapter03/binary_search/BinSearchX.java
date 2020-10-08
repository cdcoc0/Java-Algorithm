package com.kiri.chop.chapter03.binary_search;

public class BinSearchX {
	static int binSearchX(int[] a, int n, int key) {
		int pl = 0;
		int pr = n-1;
		
		do {
			int pc = (pl + pr) / 2;
			if(a[pc] == key) {
				for(int i = 0; i <= pc; i++) {
					if(a[i] == key)
						return i;
				}
				return pc;
			}
			/*if (a[pc] == key) {
				for (; pc > pl; pc--) // key와 같은 맨 앞의 요소를 찾습니다
					if (a[pc - 1] < key)
						break;
				return pc; // 검색성공*/
			else if(a[pc] < key)
				pl = pc + 1;
			else
				pr = pc - 1;
			
		} while(pl <= pr);
		
		return -1;
	}
}
