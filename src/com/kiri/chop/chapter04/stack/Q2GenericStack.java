package com.kiri.chop.chapter04.stack;

public class Q2GenericStack<E> {
	private int max;
	private int ptr;
	private E[] stk;
	
	public static class EmptyGenericStackException extends RuntimeException {
		public EmptyGenericStackException() {}
	}
	
	public static class OverflowGenericStackException extends RuntimeException {
		public OverflowGenericStackException() {}
	}
	
	public Q2GenericStack(int capacity) {
		ptr = 0;
		max = capacity;
		try {
			stk = (E[]) new Object[max];
		} catch(OutOfMemoryError e) {
			max = 0;
		}
	}
	
	public E push(E x) throws OverflowGenericStackException {
		if(ptr >= max)
			throw new OverflowGenericStackException();
		return stk[ptr++] = x;
	}
	
	public E pop(E x) throws EmptyGenericStackException {
		if(ptr <= 0)
			throw new EmptyGenericStackException();
		return stk[--ptr];
	}
	
	public E peek() throws EmptyGenericStackException {
		if(ptr <= 0)
			throw new EmptyGenericStackException();
		return stk[ptr - 1];
	}
	
	public int indexOf(E x) {
		for(int i = ptr - 1; i >= 0; i--) {
			if(stk[i].equals(x))
				return i;
		}
		return -1;
	}
	
	public void clear() {
		ptr = 0;
	}
	
	public int capacity() {
		return max;
	}
	
	public int size() {
		return ptr;
	}
	
	public boolean isEmpty() {
			return ptr <= 0;
	}
	
	public boolean isFull() {
		return ptr >= max;
	}
	
	public void dump() {
		if(ptr <= 0)
			System.out.println("the stack is empty");
		else {
			for(int i = 0; i < ptr; i++) {
				System.out.println(stk[i]);
			}
		}
	}
}
