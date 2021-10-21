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
			System.out.println("심사위원점수를 입력하시오");
			num= sc.nextDouble();
			sum =sum+num;
			score.add(num);
		}//심사위원 점수 입력 다 받음 
		
		//정렬하기
		Collections.sort(score);
		System.out.println(score);
	
		sum=sum-score.get(0);
		sum-=score.get(9);
		System.out.println("총점수는 "+sum);
 			 
	}

}
