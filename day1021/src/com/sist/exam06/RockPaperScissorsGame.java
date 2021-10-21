package com.sist.exam06;
import java.util.Scanner;


import java.util.HashMap;
import java.util.Random;

public class RockPaperScissorsGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//컴퓨터랑 가위바위보하는 게임
		//컴퓨터가 가위, 바위, 보 중에 하나를 자동으로 선택하도록 (제비뽑기)
		//사용자한테 가위,바위,보 중에 하나를 입력받도록
		Scanner sc = new Scanner(System.in);
		
		//0:가위, 1:바위, 2:보
		HashMap<Integer, String> map=  new HashMap<Integer, String>();
		map.put(0,"가위");
		map.put(1,"바위");
		map.put(2,"보");
		
		//rendom
		Random r= new Random();
		int com = r.nextInt(3); //바운더리 3: 0,1,2중에 하나 발생
		
		System.out.println("0: 가위,1:바위,2:보");
		System.out.println("선택하세요.");
		int user = sc.nextInt();
		
		System.out.print("컴퓨터는 "+map.get(com)+"를 내었습니다.");
		System.out.print("당신은 "+map.get(user)+"를 내었습니다.");
		
		
		
		
		if(com==user){ //비기는 경우
			System.out.println("둘은 비겼습니다.");
		}else if(user == 0 && com==2  ||user==1&&com==0||user==2&&com==1){ //이기는 경우:사용자가 가위로 이길수도, 바위, 보
			System.out.println("당신이 승자입니다.");
		}else {
			System.out.println("당신은 패자입니다.");
	
		}
		
		
		}

}
