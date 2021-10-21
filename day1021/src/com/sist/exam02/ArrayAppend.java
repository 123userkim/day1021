package com.sist.exam02;

public class ArrayAppend {
	
	public static void printArray(int []data) {
		for(int n:data) {
			System.out.printf("%5d",n);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []data = {10,20,30,40};
		printArray(data);
		//배열의 맨 뒤에 50을 추가하고 싶음
		//1.data 배열 참조변수가 원래배열의 길이+1만큼 다시 메모리를 확보
		//2.data 배열의 요소를 모두 새로 확보한 배열로 이동
		//3. 새로 확보한 배열의 마지막에 50을 대입
		
		int[]data2 = new int[data.length+1];
		for(int i =0 ; i<data.length;i++) {
			data2[i]=data[i];
		}
		data2[data2.length-1]=50;
		data = data2;
		printArray(data);
		//배열은 데이터의 추가, 삭제 작업시에 번거러움=>컬렉션프레임워크
	}

}
