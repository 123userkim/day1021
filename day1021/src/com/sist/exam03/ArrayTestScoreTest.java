package com.sist.exam03;
import java.util.Scanner;
import java.util.ArrayList;

public class ArrayTestScoreTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		Scanner sc = new Scanner(System.in);
		
		int tot=0;
		
		for(int i=0;i<5;i++) {
		    System.out.printf("%d ��° �л��� ������ �Է�",i+1);
			list.add( sc.nextInt() ); //list��� �Ϳ� �Է��� �ޱ�!!
			tot += list.get(i);
		}
		
		double avg =(double) tot/list.size();
		
		for(int i =0; i<list.size();i++) {
			System.out.printf("%d�� �л��� ������ %d\n",i+1,list.get(i));
			
		}
		System.out.println();//�ٹٲٱ�
		System.out.println("���� : "+tot);
		System.out.printf("���: %.1f" +avg);
		 
		
		
		 
	}

}
