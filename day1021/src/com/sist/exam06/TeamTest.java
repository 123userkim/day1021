package com.sist.exam06;
import com.sist.exam04.Student;
import java.util.*;
 

public class TeamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Double> score = new ArrayList<Double>();
		Scanner sc = new Scanner(System.in);
		double num;
		double sum=0.0;
		
	 
		for(int i = 0 ; i<10 ;i++) {
			System.out.println("�ɻ����������� �Է��Ͻÿ�");
			num= sc.nextDouble();
			sum =sum+num;
			score.add(num);
		}//�ɻ����� ���� �Է� �� ���� 
		
		//�����ϱ�
		Collections.sort(score);
		System.out.println(score);
	
		sum=sum-score.get(0);
		sum-=score.get(9);
		System.out.println("�������� "+sum);
 			 
	}

}
