package com.kiri.chop.chapter08.KMP;

public class KMPmatch {
	static int kmpMatch(String txt, String pat) {
		int pt = 1; //txt Ŀ��
		int pp = 0; //pattern Ŀ��
		int[] skip = new int[pat.length() + 1];
		
		//�ǳʶٱ� ǥ ����
		skip[pt] = 0;
		while(pt != pat.length()) {
			if(pat.charAt(pt) == pat.charAt(pp))
				skip[++pt] = ++pp;
			else if(pp == 0)
				skip[++pt] = pp;
			else
				pp = skip[pp];
		}
		
		//�˻�
		pt = pp = 0;
		while(pt != txt.length() && pp != pat.length()) {
			if(txt.charAt(pt) == pat.charAt(pp)) {
				pt++;
				pp++;
			} else if(pp == 0)
				pt++;
			else
				pp = skip[pp];
		}
		
		if(pp == pat.length())
			return pt - pp;
		return -1; //�˻� ����
	}
}
