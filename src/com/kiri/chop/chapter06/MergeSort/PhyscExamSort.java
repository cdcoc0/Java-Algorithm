package com.kiri.chop.chapter06.MergeSort;

import java.util.Comparator;

public class PhyscExamSort {
	
	//신체검사 데이터
	static class PhyscData {
		String name;
		int height;
		double vision;
		
		//생성자
		PhyscData(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
		
		//신체검사 데이터를 문자열로 반환
		public String toString() {
			return name + " " + height + " " + vision + " ";
		}
		
		//키 오름차순용 comparator
		static final Comparator<PhyscData> HEIGHT_ORDER = new HeightOrderComparator();
		
		private static class HeightOrderComparator implements Comparator<PhyscData> {
			public int compare(PhyscData d1, PhyscData d2) {
				return (d1.height > d2.height) ? 1 : 
					(d1.height < d2.height) ? -1 : 0;
			}
		}
	}
	
	//Arrays.sort(배열 x, PhyscData.HEIGHT_ORDER); // 배열 x를 HEIGHT_ORDER을 사용하여 정렬
}
