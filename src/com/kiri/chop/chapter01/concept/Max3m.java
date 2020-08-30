package com.kiri.chop.chapter01.concept;

public class Max3m {
	
	//메소드를 작성해 여러 값에 대해서도 최댓값을 구할 수 있는지 확인하기
	
	static int max3(int a, int b, int c) {
		int max = a;
				
		if(b > max) 
			max = b;
		
		if(c > max)
			max = c;
		
		return max;
	}
	
	public static void main(String[] args) {
		
		System.out.println("max3(3, 2, 1) = " + max3(3, 2, 1));
		System.out.println("max3(3, 2, 2) = " + max3(3, 2, 2));
		System.out.println("max3(3, 1, 2) = " + max3(3, 1, 2));
		System.out.println("max3(2, 3, 1) = " + max3(2, 3, 1));
	}
}
