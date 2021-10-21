package com.sist.exam02;

import java.util.ArrayList;

class Person{
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Person() {
		super();
	}
	
	public void sayHello() {
		System.out.println(name+"님, 안녕하세요!");
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
}

public class ArrayListTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add(true); //list안에는 어떤 자료형이든지 다 담을 수가 있음
		list.add(new Person("홍길동",20));
		list.add(new Person("이순신",40));
		list.add(26.7);
		list.add(new Person("유관순",30));
		list.add("안녕 자바");
		list.add(2021);
		//list에 데이터가 있는 만큼 반복 실행하면서 
		//데이터를 하나씩 끄집어내서 sayHello메소드 호출
		for(int i=0  ;  i<list.size()  ;i++  ) {
			Object object =list.get(i);
			System.out.println(object);
			if(object instanceof Person) {
				((Person)object).sayHello();
			}
			
			
			//Person p =(Person)list.get(i); 
			//person으로 캐스팅: 자료형이 안맞음
			//list.size()는 object임 그래서 Person p에 들어갈수 x
			//p.sayHello();
		}
		
	}

}
