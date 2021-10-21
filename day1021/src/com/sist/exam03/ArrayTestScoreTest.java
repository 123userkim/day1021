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
		    System.out.printf("%d 번째 학생의 점수를 입력",i+1);
			list.add( sc.nextInt() ); //list라는 것에 입력을 받기!!
			tot += list.get(i);
		}
		
		double avg =(double) tot/list.size();
		
		for(int i =0; i<list.size();i++) {
			System.out.printf("%d번 학생의 점수는 %d\n",i+1,list.get(i));
			
		}
		System.out.println();//줄바꾸기
		System.out.println("총점 : "+tot);
		System.out.printf("평균: %.1f" +avg);
		 
		
		
		 
	}

}
