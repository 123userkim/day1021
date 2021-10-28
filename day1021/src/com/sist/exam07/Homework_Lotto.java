package com.sist.exam07;

import java.util.*;

public class Homework_Lotto {

	public static void main(String[] args) {
		// set을 이용하여 5개의 로또번호를 생성하기

		for(int k=1 ;k<=5 ;k++) {
			
		TreeSet<Integer> set = new TreeSet<Integer>();
		Random r = new Random();
		while (set.size()<5) { //set이 5이 되기 전까지
			set.add(r.nextInt(45)+1);
		}
		System.out.println(set);	
		
		}
	}
}
