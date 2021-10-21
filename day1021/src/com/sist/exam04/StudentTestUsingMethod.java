package com.sist.exam04;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentTestUsingMethod {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void printMenu() {
		System.out.println("1.�߰�, 2.�˻�, 3.���� 4.��� ��� 5.��� ���� 0.����");
		System.out.println("�޴��� �����Ͻÿ�");
	}
	
	public static void intsertStudent(ArrayList<Student> list) {
		String name,addr,phone;
		System.out.println("�л��� �̸��� �Է��Ͻÿ�");
		name = sc.next();
		System.out.println("�л��� �ּҸ� �Է��Ͻÿ�");
		addr = sc.next();
		System.out.println("�л��� ��ȭ��ȣ�� �Է��Ͻÿ�");
		phone = sc.next();
		list.add( new Student(name, addr, phone) );
	}
	
	public static void searchStudent(ArrayList<Student> list) {
		String name,addr,phone;
		System.out.println("�˻��� �л��� �̸��� �Է��Ͻÿ�");
		name = sc.next();
		Student searchStudent = null;
		for(int i=0; i<list.size();i++) {
			if(list.get(i).getName().equals(name)) {
				searchStudent =list.get(i);
				break; //ã������ �׳� ����
			}
		}
		if(searchStudent != null) {
			System.out.println(searchStudent);
		}else {
			System.out.println("ã���� �ϴ� �л�"+name+" �� �����ϴ�.");
		}
	}
	
	public static void allStudent(ArrayList<Student>list) {
		if(list.isEmpty()) {
			System.out.println("�����Ͱ� �����ϴ�.");
			
		}else {
			for(Student student :list) {
			System.out.println(student);
			}
		}
	}
	
	public static void deleteStudent(ArrayList<Student> list) {
		String name,addr,phone;
		System.out.println("������ �л��� �̸��� �Է��Ͻÿ�");
		name = sc.next();
		int i;
		int cnt = list.size();
		//����Ʈ�� �����ϸ� ����Ʈ�� ũ�Ⱑ �����
		//�����ϱ� ���� ����Ʈ�� ũ�⸦ �̸� ������ �����ϱ�
		for(i = 0 ; i<list.size();i++) {
			if(list.get(i).getName().equals(name)) {
				list.remove(i);
				break;
			}
		}
		
		//�򰥸��ϱ� �׳� �������� ���� ����
		//3���ε� 1���� ���ϱ� 2�� ����: list.size()-1
		//i�� list size���� ������ ������ �� ��
		if(i<cnt) {
			System.out.println(name +"�л��� �����͸� �����߽��ϴ�.");
		}else {
			System.out.println("�����Ϸ��� �л� "+name+"�� �����ϴ�.");
		}
	}
	
	public static void allDelete(ArrayList<Student> list) {
		list.clear();
		System.out.println("�����͸� ��� �����߽��ϴ�.");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> list = new ArrayList<Student>();
		
		 //���� ����Ǵ� �� ���Ƽ� ������ ����
		
		while(true) {
			printMenu();//���� �޼ҵ带 ���⼭ ȣ������
			int menu = sc.nextInt(); 
			if(menu==0) {
				break;
			}//0�̸� while�� Ż���Ͻÿ�
			
			//�߰��غ���
			switch(menu) {
			case 1: intsertStudent(list);break;
			case 2: searchStudent(list);break;
			case 3: deleteStudent(list);break;
			case 4: allStudent(list);break;
			case 5: allDelete(list);break;
			}
		}		
	}
	
	//main �޼ҵ� �ȿ� ��� ������ ��ó�� �� ����ְ� �Ǹ� �������� ������
	//������ ��ü���� ��ó���� �޼ҵ忡�� �ñ�� main�޼ҵ忡�� �ش� �޼ҵ带 ȣ������
	//readability����
}
