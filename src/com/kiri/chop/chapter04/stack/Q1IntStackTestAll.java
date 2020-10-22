package com.kiri.chop.chapter04.stack;

import java.util.Scanner;

public class Q1IntStackTestAll {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		IntStack s = new IntStack(64);
		
		while(true) {
			System.out.println("현재 데이터 수: " + s.size() + " / " + s.capacity());
			System.out.println("(1)푸시 (2)팝 (3)피크 (4)덤프 (5)검색 (6)전체 삭제 (7)isEmpty (8)isFull");
			int menu = stdIn.nextInt();
			
			int x;
			boolean b;
			switch(menu) {
			case 1:
				System.out.println("데이터: ");
				x = stdIn.nextInt();
				try {
					s.push(x);
				} catch(IntStack.OverflowIntStackException e) {
					System.out.println("스택이 가득 찼습니다.");
				}
				break;
			
			case 2:
				try {
					x = s.pop();
					System.out.println("팝한 데이터는 " + x + "입니다.");
				} catch(IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어 있습니다.");
				}
				break;
				
			case 3:
				try {
					x = s.peek();
					System.out.println("피크 데이터는 " + x + "입니다.");
				} catch(IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어 있습니다.");
				}
				break;
				
			case 4:
				s.dump();
				break;
				
			case 5:
				System.out.println("검색할 값: ");
				int n = stdIn.nextInt();
				x = s.indexOf(n);
				if(x == -1)
					System.out.println("해당 값이 존재하지 않습니다.");
				System.out.println(n + "은(는) " + (x + 1) + "번째에 있습니다.");
				break;
				
			case 6:
				s.clear();
				System.out.println("모든 데이터가 삭제되었습니다.");
				break;
				
			case 7:
				b = s.IsEmpty();
				if(b == true)
					System.out.println("스택이 비어있습니다.");
				System.out.println("스택이 비어있지 않습니다.");
				break;
				
			case 8:
				b = s.IsFull();
				if(b == true)
					System.out.println("스택이 가득 차 있습니다.");
				System.out.println("스택이 가득 차 있지 않습니다.");
			}
		}
	}
}
