package com.sist.exam06;
import java.util.Scanner;


import java.util.HashMap;
import java.util.Random;

public class RockPaperScissorsGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��ǻ�Ͷ� �����������ϴ� ����
		//��ǻ�Ͱ� ����, ����, �� �߿� �ϳ��� �ڵ����� �����ϵ��� (����̱�)
		//��������� ����,����,�� �߿� �ϳ��� �Է¹޵���
		Scanner sc = new Scanner(System.in);
		
		//0:����, 1:����, 2:��
		HashMap<Integer, String> map=  new HashMap<Integer, String>();
		map.put(0,"����");
		map.put(1,"����");
		map.put(2,"��");
		
		//rendom
		Random r= new Random();
		int com = r.nextInt(3); //�ٿ���� 3: 0,1,2�߿� �ϳ� �߻�
		
		System.out.println("0: ����,1:����,2:��");
		System.out.println("�����ϼ���.");
		int user = sc.nextInt();
		
		System.out.print("��ǻ�ʹ� "+map.get(com)+"�� �������ϴ�.");
		System.out.print("����� "+map.get(user)+"�� �������ϴ�.");
		
		
		
		
		if(com==user){ //���� ���
			System.out.println("���� �����ϴ�.");
		}else if(user == 0 && com==2  ||user==1&&com==0||user==2&&com==1){ //�̱�� ���:����ڰ� ������ �̱����, ����, ��
			System.out.println("����� �����Դϴ�.");
		}else {
			System.out.println("����� �����Դϴ�.");
	
		}
		
		
		}

}
