package com.sist.exam04;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentTestUsingMethod {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void printMenu() {
		System.out.println("1.추가, 2.검색, 3.삭제 4.모두 출력 5.모두 삭제 0.종료");
		System.out.println("메뉴를 선택하시오");
	}
	
	public static void intsertStudent(ArrayList<Student> list) {
		String name,addr,phone;
		System.out.println("학생의 이름을 입력하시오");
		name = sc.next();
		System.out.println("학생의 주소를 입력하시오");
		addr = sc.next();
		System.out.println("학생의 전화번호를 입력하시오");
		phone = sc.next();
		list.add( new Student(name, addr, phone) );
	}
	
	public static void searchStudent(ArrayList<Student> list) {
		String name,addr,phone;
		System.out.println("검색할 학생의 이름을 입력하시오");
		name = sc.next();
		Student searchStudent = null;
		for(int i=0; i<list.size();i++) {
			if(list.get(i).getName().equals(name)) {
				searchStudent =list.get(i);
				break; //찾았으면 그냥 끝냄
			}
		}
		if(searchStudent != null) {
			System.out.println(searchStudent);
		}else {
			System.out.println("찾고자 하는 학생"+name+" 은 없습니다.");
		}
	}
	
	public static void allStudent(ArrayList<Student>list) {
		if(list.isEmpty()) {
			System.out.println("데이터가 없습니다.");
			
		}else {
			for(Student student :list) {
			System.out.println(student);
			}
		}
	}
	
	public static void deleteStudent(ArrayList<Student> list) {
		String name,addr,phone;
		System.out.println("삭제할 학생의 이름을 입력하시오");
		name = sc.next();
		int i;
		int cnt = list.size();
		//리슽트를 사제하면 리스트의 크기가 변경됨
		//삭제하기 전에 리스트의 크기를 미리 변수에 저장하기
		for(i = 0 ; i<list.size();i++) {
			if(list.get(i).getName().equals(name)) {
				list.remove(i);
				break;
			}
		}
		
		//헷갈리니까 그냥 빼기전에 변수 지정
		//3명인데 1명을 빼니까 2명 남음: list.size()-1
		//i가 list size보다 작으면 삭제를 한 것
		if(i<cnt) {
			System.out.println(name +"학생의 데이터를 삭제했습니다.");
		}else {
			System.out.println("삭제하려는 학생 "+name+"은 없습니다.");
		}
	}
	
	public static void allDelete(ArrayList<Student> list) {
		list.clear();
		System.out.println("데이터를 모두 삭제했습니다.");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> list = new ArrayList<Student>();
		
		 //같이 적용되는 게 많아서 밖으로 빼기
		
		while(true) {
			printMenu();//위의 메소드를 여기서 호출학학
			int menu = sc.nextInt(); 
			if(menu==0) {
				break;
			}//0이면 while을 탈출하시오
			
			//추가해보기
			switch(menu) {
			case 1: intsertStudent(list);break;
			case 2: searchStudent(list);break;
			case 3: deleteStudent(list);break;
			case 4: allStudent(list);break;
			case 5: allDelete(list);break;
			}
		}		
	}
	
	//main 메소드 안에 모든 복잡한 일처를 다 집어넣게 되면 가독성이 떨어짐
	//각각의 구체적인 일처리는 메소드에게 맡기고 main메소드에선 해당 메소드를 호출해줌
	//readability증가
}
