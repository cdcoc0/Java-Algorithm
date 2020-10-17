package com.kiri.chop.chapter03.binary_search;

import java.util.Comparator;

public class PhysExamSearchV {
	
	static class PhysData {
		private String name;
		private int height;
		private double vision;
		
		public PhysData(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
		
		public String toString() {
			return name + " " + height + " " + vision;
		}
		
		public static final Comparator<PhysData> VISION_ORDER = 
				new VisionOrderComparator();
		
		private static class VisionOrderComparator implements Comparator<PhysData> {
			public int compare(PhysData d1, PhysData d2) {
				return (d1.vision > d2.vision) ? 1: (d1.vision < d2.vision) ? -1 : 0;
			}
		}
	}
}
