package com.sist.exam07;
import java.util.*;
public class Homework_Frequency {

	public static void main(String[] args) {
		//��������� ���ڸ� �Է¹޾� �ܾ �󵵼��� ���Ͽ� ���
		
		HashMap<String, Integer> map= new HashMap<String, Integer>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڿ��� �Է��Ͻÿ� /�� �ܾ���� �Ͻÿ� ");
		String data = sc.next(); //���ڿ� �Է¹ޱ�
		
		
	    int i;
		String []arr = data.split("/");   //arr��� �迭�� �ܾ ��� ����ֱ�
		for( i=0; i<arr.length;i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		
		
		//containsKey(key): �ʿ��� ���ڷ� ���� Ű�� ������ true ������ false�� ��ȯ
		//containsValue(value): �ʿ��� ���ڷ� ���� ���� ������ true ������ false�� ��ȯ
		for(i=0; i<arr.length; i++) { //arr�� �迭�� ������ ����
			
			if(map.containsKey(arr[i])) {
				map.put( arr[i], map.get(arr[i])+1);
			}else {
				map.put(arr[i],1);
			}
			
		} 
		
		//���
		//map.keySet()->map�� key���� ��Ƽ� Set ���·� ��ȯ
		for(String key : map.keySet()) {
			System.out.println(key + ": " + map.get(key));
			//mep.get()-> map���� �ش� key�� value�� ã�Ƽ� ����
		}
 


		
		
	
		

		
		
	}
}
