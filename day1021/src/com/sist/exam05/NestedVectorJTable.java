package com.sist.exam05;

import java.util.*;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class NestedVectorJTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
Vector<Vector<String>> list = new Vector<Vector<String>>();
		
Vector<String >row1= new Vector<String>();
		row1.add("홍길동");
		row1.add("서울");
		row1.add("010-1234-1111");
		
		Vector<String >row2= new Vector<String>();
		row2.add("유관순");
		row2.add("인천");
		row2.add("010-1234-2222");
		
		Vector<String >row3= new Vector<String>();
		row3.add("김유신");
		row3.add("제주");
		row3.add("010-1234-3333");
		
		//row 123을 list에 담을 것
		list.add(row1);
		list.add(row2);
		list.add(row3);
		
		
		//table에 들어갈 데이터 만들기
		Vector<String> colNames = new Vector<String>();
		colNames.add("이름");
		colNames.add("주소");
		colNames.add("전화");
		
		JTable table = new JTable(list,colNames);
		
		JScrollPane jsp= new JScrollPane(table);
		//table이 생성될 떼, jsp
		
		JFrame frame = new JFrame();
		
		frame.add(jsp);
		
		frame.setSize(400,300);
		frame.setVisible(true);
		
		//jframe>jscrollePen>table 
		
		//행열로 구성될 때 vector 쓰기
	}
	}


