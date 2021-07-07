package com.kiri.chop.chapter08.bruteForce;

import java.util.Scanner;

public class BFmatch {
	//���Ʈ-���������� ���ڿ��� �˻��ϴ� �޼���
	static int bfMatch(String txt, String pat) {
		int pt = 0; //txtĿ��
		int pp = 0; //pattern Ŀ��
		
		while(pt != txt.length() && pp != pat.length()) {
			if(txt.charAt(pt) == pat.charAt(pp)) {
				pt++;
				pp++;
			} else {
				pt = pt - pp + 1;
				pp = 0;
			}
		}
		if(pp == pat.length()) //�˻� ����
			return pt - pp;
		return -1; //�˻� ����
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("�ؽ�Ʈ: ");
		String s1 = stdIn.next(); //�ؽ�Ʈ�� ���ڿ�
		
		System.out.println("����: ");
		String s2 = stdIn.next(); //���Ͽ� ���ڿ�
		
		int idx = bfMatch(s1, s2);
		
		if(idx == -1)
			System.out.println("�ؽ�Ʈ�� ���� ����");
		else {
			//��ġ�ϴ� ���� �ٷ� �ձ����� ���� ����
			int len = 0;
			for(int i = 0; i < idx; i++) {
				len += s1.substring(i, i + 1).getBytes().length;
			}
			len += s2.length();
			
			System.out.println((idx + 1) + "��° ���ں��� ��ġ");
			System.out.printf(String.format("����: %%%ds\n", len), s2);
		}
	}
}
