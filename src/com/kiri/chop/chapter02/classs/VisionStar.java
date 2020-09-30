package com.kiri.chop.chapter02.classs;


public class VisionStar {
	
	static final int VMAX = 21;
	
	static class PhyData {
		String name;
		int height;
		double vision;
		
		PhyData(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
	}
	
	static double aveHeight(PhyData[] dat) {
		double sum = 0;
		
		for(int i = 0; i < dat.length; i++) {
			sum += dat[i].height;
		}
		
		return sum / dat.length;
	}
	
	static void distVision(PhyData[] dat, int[] dist) {
		int i = 0;
		
		dist[i] = 0;
		for(i = 0; i < dat.length; i++) {
			if(dat[i].vision >= 0.0 && dat[i].vision <= VMAX / 10.0)
				dist[(int)(dat[i].vision * 10)]++;
		}
	}
	
	public static void main(String[] args) {
		PhyData[] x = {
				new PhyData("박현규", 162, 0.3),
				new PhyData("함진아", 173, 0.7),
				new PhyData("최윤미", 175, 2.0),
				new PhyData("홍연의", 171, 1.5),
				new PhyData("김영준", 174, 1.2),
				new PhyData("이수진", 168, 0.4),
				new PhyData("박용규", 169, 0.8),
		};
		int[] vdist = new int[VMAX];
		
		System.out.println("신체검사 리스트");
		System.out.println("이름	키	시력");
		System.out.println("--------------------");
		for(int i = 0; i < x.length; i++) {
			System.out.printf("%-8s\t%3d\t%1.1f\n", x[i].name, x[i].height, x[i].vision);
		}
		
		System.out.printf("\n평균 키: %5.1f", aveHeight(x));
		distVision(x, vdist);
		System.out.println("\n시력분보");
		for(int i = 0; i < VMAX; i++) {
			System.out.printf("%3.1f ~ :", i / 10.0);
			for(int j = 0; j < vdist[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
