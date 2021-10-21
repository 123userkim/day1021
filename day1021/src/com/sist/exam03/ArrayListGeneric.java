package com.sist.exam03;

import java.util.*;

public class ArrayListGeneric{

	
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(100);
		list.add("홍길동");
		list.add(26.7);
		list.add(new Date());
		list.add(true);
		System.out.println(list);
		
		ArrayList<String> list2 = new ArrayList<String>();
		//list2.add(100); int는 사용이 불가함 
		list2.add("홍길동");
		list2.add("유관순");
		list2.add("이순신");
		
		
		ArrayList<String> list3 = new ArrayList<String>();
		list3.add(100+""); //뭐든 +""하면 String 변환
		list3.add("홍길동");
		list3.add(26.7+"");
		list3.add(new Date()+"");
		list3.add(true+"");
		System.out.println(list3);
		
		//ArrayList<int>list4 = new ArrayList<int>();
		//리스트에 담을 수 있는 자료형을 정수형으로 제한하기 위하여 
		//기본 자료형인 int 사용이 불가함 -> 객체로 만들어주는 integer클래스 사용
		ArrayList<Integer> list4 = new ArrayList<Integer>();
		list4.add(50);
		list4.add(60);
		list4.add(70);
		list4.add(80);
		//list4.add(80.5);
		System.out.println(list4);
	}
}
