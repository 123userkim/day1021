package com.sist.exam07;

import java.util.*;
public class Homework{
			// map�� ����Ͽ� �ܾ �Է��ϸ�, �ܾ��� ������ ������
			//������ �ܾ �߰�, �˻�, ������ �� �ִ� �޴� �����
			public static void printMenu() {
			System.out.println("1.�ܾ��߰�/2.�ܾ�˻�/3.�ܾ����/4.���α׷�����");
		    }
			
			public static void addWord(HashMap<String, String>dic) {
				Scanner sc = new Scanner(System.in);
				System.out.print("�߰��� �ܾ �Է��Ͻÿ�");
			    String word =sc.next();
			    System.out.print("�ܾ��� ���� �Է��Ͻÿ�");
			    String meaning=sc.next();
			    dic.put(word,meaning);
			    System.out.println("���������� ������ �߰��Ǿ����ϴ�");
			}

			public static void searchWord(HashMap<String, String>dic) {
				Scanner sc = new Scanner(System.in);
				System.out.println("�˻��� �ܾ �Է��Ͻÿ�");
				String searchWord= sc.next();
			    System.out.println(dic.get(searchWord));
			}
			public static void removeWord(HashMap<String, String>dic) {
				Scanner sc = new Scanner(System.in);
				System.out.println("������ �ܾ �Է��Ͻÿ�");
				String removeWord= sc.next();
				System.out.println(dic.remove(removeWord));
				System.out.println("�Է��Ͻ� �ܾ �����Ͽ����ϴ�.");
			}
			
			public static void main(String[] args) {
				
			 HashMap<String, String>dic = new HashMap<String, String>();
			 dic.put("star", "��");
			 dic.put("sea", "�ٴ�");
			 dic.put("moon", "��");
			 dic.put("sun", "�¾�");
			 dic.put("passion", "����");
			 
			Scanner sc = new Scanner(System.in);
			//1.�߰�/2.�˻�/3.����/4.����
			while(true) {
				printMenu();//���� �޼ҵ带 ���⼭ ȣ���ϱ�
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
				
				
		


