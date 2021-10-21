package com.sist.exam04;

import java.util.ArrayList;
import java.util.Scanner;


public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> list = new ArrayList<Student>();
		Scanner sc = new Scanner(System.in);
		String name,addr,phone; //���� ����Ǵ� �� ���Ƽ� ������ ����
		
		while(true) {
			System.out.println("1.�߰�, 2.�˻�, 3.���� 4.��� ��� 5.��� ���� 0.����");
			int menu = sc.nextInt(); 

			if(menu==0) {
				break;
			}//0�̸� while�� Ż���Ͻÿ�
			
			//�߰��غ���
			switch(menu) {
			case 1: 
				System.out.println("�л��� �̸��� �Է��Ͻÿ�");
				name = sc.next();
				System.out.println("�л��� �ּҸ� �Է��Ͻÿ�");
				addr = sc.next();
				System.out.println("�л��� ��ȭ��ȣ�� �Է��Ͻÿ�");
				phone = sc.next();
				list.add( new Student(name, addr, phone) );
				break;
				
			case 2:
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
				break;
				
			case 3:
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
				break;
				
			case 4:
				if(list.isEmpty()) {
					System.out.println("�����Ͱ� �����ϴ�.");
					
				}else {
					for(Student student :list) {
					System.out.println(student);
					}
				}
	
				break;
			case 5: 
				list.clear();
				System.out.println("�����͸� ��� �����߽��ϴ�.");
				break;
			}
		}		
	}
}
