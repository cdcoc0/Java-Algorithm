package com.kiri.chop.chapter05.TowerOfHanoi;

public class Q7moveRe {
	
	static void moveNonRe(int no, int x, int y) {
		
		int[] a = new int[100];
		int[] b = new int[100];
		int[] c = new int[100]; //½ºÅÃ
		
		int ptr = 0; //stack pointer
		int sw = 0;
		
		while(true) {
			if(sw == 0 && no > 1) {
				a[ptr] = x;
				b[ptr] = y;
				c[ptr] = sw;
				ptr++;
				
				no -= 1;
				y = 6 - x- y;
				
				continue;
			}
		
		
			System.out.printf("¿ø¹Ý [%d]¸¦ %d±âµÕ¿¡¼­ %d±âµÕÀ¸·Î ¿Å±è\n", no, x, y);
		
			if(sw == 1 && no > 1) {
				a[ptr] = x;
				b[ptr] = y;
				c[ptr] = sw;
				ptr++;
				
				no -= 1;
				x = 6 - x - y;
				
				if(++sw == 2) {
					sw = 0;
				}
				
				continue;
			}
			
			do {
				if(ptr-- == 0)
					return;
				x = a[ptr];
				y = b[ptr];
				sw = c[ptr] + 1;
				no++;
			} while(sw == 2);
		}
	}
}
