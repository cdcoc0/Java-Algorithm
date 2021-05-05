package com.kiri.chop.chapter06.MergeSort;

import java.util.Comparator;

public class PhyscExamSort {
	
	//��ü�˻� ������
	static class PhyscData {
		String name;
		int height;
		double vision;
		
		//������
		PhyscData(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
		
		//��ü�˻� �����͸� ���ڿ��� ��ȯ
		public String toString() {
			return name + " " + height + " " + vision + " ";
		}
		
		//Ű ���������� comparator
		static final Comparator<PhyscData> HEIGHT_ORDER = new HeightOrderComparator();
		
		private static class HeightOrderComparator implements Comparator<PhyscData> {
			public int compare(PhyscData d1, PhyscData d2) {
				return (d1.height > d2.height) ? 1 : 
					(d1.height < d2.height) ? -1 : 0;
			}
		}
	}
	
	//Arrays.sort(�迭 x, PhyscData.HEIGHT_ORDER); // �迭 x�� HEIGHT_ORDER�� ����Ͽ� ����
}
