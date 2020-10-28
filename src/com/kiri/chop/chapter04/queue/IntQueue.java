package com.kiri.chop.chapter04.queue;

public class IntQueue {
	private int max; // 큐의 용량
	private int front; // 첫 번째 요소 커서
	private int rear; //마지막 요소 커서
	private int num; //현재 데이터 수
	private int[] que;
	
	//실행 시 예외: 큐가 비어 있음
	public class EmptyIntQueueException extends RuntimeException {
		public EmptyIntQueueException() {}
	}
	
	//실행 시 예외: 큐가 가득 참
	public class OverflowIntQueueException extends RuntimeException {
		public OverflowIntQueueException() {}
	}
	
	//생성자
	public IntQueue(int capacity) {
		num = front = rear = 0;
		max = capacity;
		try {
			que = new int[max];
		} catch(OutOfMemoryError e) {
			max = 0;
		}
	}
	
	public int enque(int x) throws OverflowIntQueueException {
		if(num >= max)
			throw new OverflowIntQueueException();
		
		que[rear++] = x;
		num++;
		
		if(rear == max)
			rear = 0;
		
		return x;
	}
	
	public int deque() throws EmptyIntQueueException {
		if(num <= 0)
			throw new EmptyIntQueueException();
		
		int x = que[front++];
		num--;
		
		if(front == max)
			front = 0;
		
		return x;
	}
	
	public int peek() throws EmptyIntQueueException {
		if(num <= 0)
			throw new EmptyIntQueueException();
		
		return que[front];
	}
	
	public int indexOf(int x) {
		for(int i = 0; i < num; i++) {
			int idx = (i + front) % max;
			if(que[idx] == x)
				return idx;
		}
		return -1;
	}
	
	public int search(int x) {
		for (int i = 0; i < num; i++)
			if (que[(i + front) % max] == x)
				return i + 1;
		return 0;
	}
	
	public void clear() {
		num = front = rear = 0;
	}
	
	public int capacity() {
		return max;
	}
	
	public int size() {
		return num;
	}
	
	public boolean IsEmpty() {
		return num <= 0;
	}
	
	public boolean IsFull() {
		return num >= max;
	}
	
	public void dump() {
		if(num <= 0)
			System.out.println("the queue is empty");
		else {
			for(int i = 0; i < num; i++) {
				System.out.println(que[(i + front) % max]);
			}
		}
	}
}
