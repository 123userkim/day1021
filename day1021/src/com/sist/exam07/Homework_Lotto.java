package com.sist.exam07;

import java.util.*;

public class Homework_Lotto {

	public static void main(String[] args) {
		// set�� �̿��Ͽ� 5���� �ζǹ�ȣ�� �����ϱ�

		for(int k=1 ;k<=5 ;k++) {
			
		TreeSet<Integer> set = new TreeSet<Integer>();
		Random r = new Random();
		while (set.size()<5) { //set�� 5�� �Ǳ� ������
			set.add(r.nextInt(45)+1);
		}
		System.out.println(set);	
		
		}
	}
}
