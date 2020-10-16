package com.kiri.chop.chapter03.binary_search;

import java.util.Arrays;
import java.util.Scanner;

public class StringBinarySearch {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		String[] x = {
				"abstract", "assert", "boolean", "break", "byte",
				"case", "catch", "char", "class", "const",
				"continue", "default", "do", "double", "else",
				"enum", "extends", "final", "finally", "float",
				"for", "goto", "if", "implements", "import",
				"instanceof", "int", "interface", "long", "native",
				"new", "package", "private", "protected", "public",
				"return", "short", "static", "strictfp", "super",
				"switch", "synchronized", "this", "throw", "throws",
				"transient", "try", "void", "volatile", "while"
		};
		
		System.out.print("키워드 입력");
		String ky = stdIn.next();
		
		int idx = Arrays.binarySearch(x, ky);
		
		if(idx < 0)
			System.out.println("failed");
		else
			System.out.println("해당 키워드: x[" + idx + "]");
	}
}
