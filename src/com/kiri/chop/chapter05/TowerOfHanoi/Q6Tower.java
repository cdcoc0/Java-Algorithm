package com.kiri.chop.chapter05.TowerOfHanoi;

import java.util.Scanner;

public class Q6Tower {
	
	static String[] tower = {"0", "A±âµÕ", "B±âµÕ", "C±âµÕ"};
	
	static void moveAlphabet(int no, int x, int y) {
		
		if(no > 1) {
			moveAlphabet(no - 1, x, 6 - x - y);
		}
		
		System.out.println("¿ø¹Ý[" + no + "]À» " + tower[x] + "¿¡¼­ " + tower[y] + "±âµÕÀ¸·Î ¿Å±è");
		
		if(no > 1) {
			moveAlphabet(no - 1, 6 - x - y, y);
		}
		
		/*int z = 0;
		if(no > 1) {
			z = 6 - x - y;
			moveAlphabet(no - 1, x, z);
		}
		
		if(x == 1) {
			System.out.print("¿ø¹Ý[" + no + "]À» a±âµÕ¿¡¼­ ");
			if(z == 2) {
				System.out.println("b±âµÕÀ¸·Î ¿Å±è");
			} else {
				System.out.println("c±âµÕÀ¸·Î ¿Å±è");
			}
		} else if(x == 2) {
			System.out.print("¿ø¹Ý[" + no + "]À» b±âµÕ¿¡¼­ " );
			if(z == 1) {
				System.out.println("a±âµÕÀ¸·Î ¿Å±è");
			} else {
				System.out.println("c±âµÕÀ¸·Î ¿Å±è");
			}
		} else if(x == 3) {
			System.out.print("¿ø¹Ý[" + no + "]À» c±âµÕ¿¡¼­ ");
			if(z == 1) {
				System.out.println("a±âµÕÀ¸·Î ¿Å±è");
			} else {
				 System.out.println("b±âµÕÀ¸·Î ¿Ã±è");
			}
		}
		
		if(no > 1) {
			moveAlphabet(no - 1, 6 - x - y, y);
		}*/
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("Tower of Hanoi");
		System.out.println("¿ø¹Ý °³¼ö: ");
		int no = stdIn.nextInt();
		
		moveAlphabet(no, 1, 3);
	}
}
