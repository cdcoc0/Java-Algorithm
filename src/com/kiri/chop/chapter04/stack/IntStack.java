package com.kiri.chop.chapter04.stack;

//int형 스택
public class IntStack {
	private int max; 	//스택 용량
	private int ptr;	//스택 포인터
	private int[] stk;	//스택 본체
	
	
	//예외 처리: 스택이 비어 있음
	public class EmptyIntStackException extends RuntimeException {
		public EmptyIntStackException() {}
	}
	
	public class OverflowIntStackException extends RuntimeException {
		public OverflowIntStackException() {}
	}
	
	//생성자
	public IntStack(int capacity) {
		ptr = 0;
		max = capacity;
		try {
			stk = new int[max];
		} catch(OutOfMemoryError e) {
			max = 0;
		}
	}
	
	//푸시 메서드 push
	public int push(int x) throws OverflowIntStackException {
		if(ptr == max) //ptr은 0이상 max미만
			throw new OverflowIntStackException();
		return stk[ptr++] = x;
	}
	
	public int pop() throws EmptyIntStackException {
		if(ptr <= 0)
			throw new EmptyIntStackException();
		return stk[--ptr];
	}
	
	public int peek() throws EmptyIntStackException {
		if (ptr <= 0)
			throw new EmptyIntStackException();
		return stk[ptr - 1];
	}
	
	//스택에서 x를 찾아 인덱스(없으면 -1)를 반환
	public int indexOf(int x) {
		for(int i = ptr - 1; i >= 0; i--) {
			if(stk[i] == x)
				return i;
		}
		return -1;
	}
	
	//스택을 비움
	public void clear() {
		ptr = 0;
	}
	
	//스택의 용량을 반환
	public int capacity() {
		return max;
	}
	
	//스택에 쌓여 있는 데이터 수 
	public int size() {
		return ptr;
	}
	
	//스택이 비어 있는가?
	public boolean IsEmpty() {
		return ptr <= 0;
	}
	
	//스택이 가득 찼는가?
	public boolean IsFull() {
		return ptr >= max;
	}
	
	//스택 안의 모든 데이터를 바닥 -> 꼭대기 순으로 출력
	public void dump() {
		if (ptr <= 0)
			System.out.println("the stack is empty");
		else {
			for(int i = 0; i < ptr; i++) {
				System.out.println(stk[i]);
			}
		}
	}
}
