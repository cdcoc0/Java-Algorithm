package com.kiri.chop.chapter07.set;

public class IntSetEx {
	private int max; //������ �ִ� ����
	private int num; //������ ��� ����
	private int[] set; //���� ��ü
	
	//Constructor
	public IntSetEx(int capacity) {
		num = 0;
		max = capacity;
		try {
			set = new int[max];
		} catch(OutOfMemoryError e) {
			max = 0;
		}
	}
	
	//������ �ִ� ����
	public int capacity() {
		return max;
	}
	
	//������ ��� ����
	public int size() {
		return num;
	}
	
	//���տ��� n�� �˻�(index ��ȯ)
	public int indexOf(int n) {
		for(int i = 0; i < num; i++) {
			if(set[i] == n) return i;
		}
		return -1;
	}
	
	//���տ� n�� �ִ��� ������ Ȯ��
	public boolean contains(int n) {
		return indexOf(n) == -1 ? false : true;
	}
	
	//���տ� n�� �߰�
	public boolean add(int n) {
		if(num >= max || contains(n) == true) {
			return false; //���� á�ų� �̹� n�� ����
		} else {
			set[num++] = n; //���� ������ �ڸ��� n �߰�
			return true;
		}
	}
	
	//���տ��� n�� ����
	public boolean remove(int n) {
		int idx; //n�� ����� ����� �ε���
		
		if(num <= 0 || (idx = indexOf(n)) == -1) { //��� �ְų� n�� �������� ����
			return false;
		} else {
			set[idx] = set[--num]; //������ ��Ҹ� ������ ������ �ű�
			return true;
		}
	}
	
	//���� s�� ����
	public void copyTo(IntSetEx s) {
		int n = (s.max < num) ? s.max : num; //������ ��� ����
		for(int i = 0; i < n; i++) {
			s.set[i] = set[i];
		}
		s.num = n;
	}
	
	//���� s�� ����
	public void copyFrom(IntSetEx s) {
		int n = (max < s.num) ? max: s.num; //������ ��� ����
		for(int i = 0; i < n; i++) {
			set[i] = s.set[i];
		}
		num = n;
	}
	
	//���� s�� ������ Ȯ��
	public boolean equalTo(IntSetEx s) {
		if(num != s.num) return false; //��� ������ ���� ������ ���յ� ���� ����
		for(int i = 0; i < num; i++) {
			int j = 0;
			for( ; j < s.num; j++) {
				if(set[i] == s.set[j])
					break;
			}
			if(j == s.num)
				return false; //set[i]�� s�� ���Ե��� ����
		}
		return true;
	}
	
	//���� s1�� s2�� �������� ����
	public void unionOf(IntSetEx s1, IntSetEx s2) {
		copyFrom(s1); //���� s1 ����
		for(int i = 0; i < s2.num; i++) //���� s2�� ��� �߰�
			add(s2.set[i]);
	} //�ߺ��Ǵ� ���?
	
	//"{a b c}" ������ ���ڿ��� ǥ���� �ٲ�
	public String toString() {
		StringBuffer temp = new StringBuffer("{ ");
		for(int i = 0; i < num; i++)
			temp.append(set[i] + " ");
		temp.append("}");
		return temp.toString();
	}
	
	public boolean isEmpty() {
		return num == 0;
	}
	
	public boolean isFull() {
		return num >= max;
	}
	
	public void clear() {
		num = 0;
	}
	
	public boolean add(IntSetEx s) {
		boolean flag = false;
		for(int i = 0; i < s.num; i++) {
			if(add(s.set[i]) == true) {
				flag = true;
			};
		};
		return flag;
	}
	
	public boolean retain(IntSetEx s) {
		boolean flag = false;
		
		for(int i = 0; i < num; i++) {
			if(s.contains(set[i]) == false) {
				remove(set[i]);
				flag = true;
			}
		}
		return flag;
	}
	
	public boolean remove(IntSetEx s) {
		boolean flag = false;
		for(int i = 0; i < num; i++) {
			if(s.contains(set[i]) == true) {
				remove(set[i]);
				flag = true;
			}
		}
		return flag;
	}
}
