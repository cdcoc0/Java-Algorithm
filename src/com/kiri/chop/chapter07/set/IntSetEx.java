package com.kiri.chop.chapter07.set;

public class IntSetEx {
	private int max; //집햅의 최대 개수
	private int num; //집합의 요소 개수
	private int[] set; //집합 본체
	
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
	
	//집합의 최대 개수
	public int capacity() {
		return max;
	}
	
	//집합의 요소 개수
	public int size() {
		return num;
	}
	
	//집합에서 n을 검색(index 반환)
	public int indexOf(int n) {
		for(int i = 0; i < num; i++) {
			if(set[i] == n) return i;
		}
		return -1;
	}
	
	//집합에 n이 있는지 없는지 확인
	public boolean contains(int n) {
		return indexOf(n) == -1 ? false : true;
	}
	
	//집합에 n을 추가
	public boolean add(int n) {
		if(num >= max || contains(n) == true) {
			return false; //가득 찼거나 이미 n이 존재
		} else {
			set[num++] = n; //가장 마지막 자리에 n 추가
			return true;
		}
	}
	
	//집합에서 n을 삭제
	public boolean remove(int n) {
		int idx; //n이 저장된 요소의 인덱스
		
		if(num <= 0 || (idx = indexOf(n)) == -1) { //비어 있거나 n이 존재하지 않음
			return false;
		} else {
			set[idx] = set[--num]; //마지막 요소를 삭제한 곳으로 옮김
			return true;
		}
	}
	
	//집합 s에 복사
	public void copyTo(IntSetEx s) {
		int n = (s.max < num) ? s.max : num; //복사할 요소 개수
		for(int i = 0; i < n; i++) {
			s.set[i] = set[i];
		}
		s.num = n;
	}
	
	//집합 s를 복사
	public void copyFrom(IntSetEx s) {
		int n = (max < s.num) ? max: s.num; //복사할 요소 개수
		for(int i = 0; i < n; i++) {
			set[i] = s.set[i];
		}
		num = n;
	}
	
	//집합 s와 같은지 확인
	public boolean equalTo(IntSetEx s) {
		if(num != s.num) return false; //요소 개수가 같지 않으면 집합도 같지 않음
		for(int i = 0; i < num; i++) {
			int j = 0;
			for( ; j < s.num; j++) {
				if(set[i] == s.set[j])
					break;
			}
			if(j == s.num)
				return false; //set[i]는 s에 포함되지 않음
		}
		return true;
	}
	
	//집합 s1과 s2의 합집합을 복사
	public void unionOf(IntSetEx s1, IntSetEx s2) {
		copyFrom(s1); //집합 s1 복사
		for(int i = 0; i < s2.num; i++) //집합 s2의 요소 추가
			add(s2.set[i]);
	} //중복되는 요소?
	
	//"{a b c}" 형식의 문자열로 표현을 바꿈
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
