package com.sist.exam07;

import java.util.*;
public class Homework{
			// map을 사용하여 단어를 입력하면, 단어의 설명을 보여줌
			//사전에 단어를 추가, 검색, 삭제할 수 있는 메뉴 만들기
			public static void printMenu() {
			System.out.println("1.단어추가/2.단어검색/3.단어삭제/4.프로그램종료");
		    }
			
			public static void addWord(HashMap<String, String>dic) {
				Scanner sc = new Scanner(System.in);
				System.out.print("추가할 단어를 입력하시오");
			    String word =sc.next();
			    System.out.print("단어의 뜻을 입력하시오");
			    String meaning=sc.next();
			    dic.put(word,meaning);
			    System.out.println("성공적으로 사전에 추가되었습니다");
			}

			public static void searchWord(HashMap<String, String>dic) {
				Scanner sc = new Scanner(System.in);
				System.out.println("검색할 단어를 입력하시오");
				String searchWord= sc.next();
			    System.out.println(dic.get(searchWord));
			}
			public static void removeWord(HashMap<String, String>dic) {
				Scanner sc = new Scanner(System.in);
				System.out.println("삭제할 단어를 입력하시오");
				String removeWord= sc.next();
				System.out.println(dic.remove(removeWord));
				System.out.println("입력하신 단어를 삭제하였습니다.");
			}
			
			public static void main(String[] args) {
				
			 HashMap<String, String>dic = new HashMap<String, String>();
			 dic.put("star", "별");
			 dic.put("sea", "바다");
			 dic.put("moon", "달");
			 dic.put("sun", "태양");
			 dic.put("passion", "열정");
			 
			Scanner sc = new Scanner(System.in);
			//1.추가/2.검색/3.삭제/4.종료
			while(true) {
				printMenu();//위의 메소드를 여기서 호출하기
				int menu = sc.nextInt(); 
				if(menu==4) {
					break;
				} 
				switch(menu) {
				case 1: addWord(dic);break;
				case 2: searchWord(dic);break;
				case 3: removeWord(dic);break;
			    }
			}
			
}
}
				
				
		


