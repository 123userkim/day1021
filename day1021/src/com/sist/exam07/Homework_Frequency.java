package com.sist.exam07;
import java.util.*;
public class Homework_Frequency {

	public static void main(String[] args) {
		//사용자한테 문자를 입력받아 단어별 빈도수를 구하여 출력
		
		HashMap<String, Integer> map= new HashMap<String, Integer>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력하시오 /로 단어구분을 하시오 ");
		String data = sc.next(); //문자열 입력받기
		
		
	    int i;
		String []arr = data.split("/");   //arr라는 배열에 단어를 모두 집어넣기
		for( i=0; i<arr.length;i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		
		
		//containsKey(key): 맵에서 인자로 보낸 키가 있으면 true 없으면 false를 반환
		//containsValue(value): 맵에서 인자로 보낸 값이 있으면 true 없으면 false를 반환
		for(i=0; i<arr.length; i++) { //arr의 배열을 돌리는 동안
			
			if(map.containsKey(arr[i])) {
				map.put( arr[i], map.get(arr[i])+1);
			}else {
				map.put(arr[i],1);
			}
			
		} 
		
		//출력
		//map.keySet()->map의 key들을 모아서 Set 형태로 반환
		for(String key : map.keySet()) {
			System.out.println(key + ": " + map.get(key));
			//mep.get()-> map에서 해당 key의 value를 찾아서 리턴
		}
 


		
		
	
		

		
		
	}
}
