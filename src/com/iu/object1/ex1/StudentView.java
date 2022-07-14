package com.iu.object1.ex1;


public class StudentView {
	
	//viewMessage 
	//문자열을 받아서 그 문자열을 출력하는 메서드
	
	public void viewMessage(String message) {
		System.out.println(message);
	}
	
	//viewOne 메서드 생성
	//학생 한명의 정보를 받아서 모든 정보를 출력 
	
	public void viewOne(Student student) {
			System.out.println(student.getName());
			System.out.println(student.getNum());
			System.out.println(student.getKor());
			System.out.println(student.getEng());
			System.out.println(student.getMath());
			System.out.println(student.getTotal());
			System.out.println(student.getAvg());
	}
	
	//viewAll 메서드 생성
	//학생들의 정보를 받아서 모든 정보를 출력
	
	//학생들의 정보를 받아서 => Student [] students
	
	
	public void viewAll(Student [] students) {
		for(int i=0;i<students.length;i++) {
			System.out.println(students[i].getName());
			System.out.println(students[i].getNum());
			System.out.println(students[i].getKor());
			System.out.println(students[i].getEng());
			System.out.println(students[i].getMath());
			System.out.println(students[i].getTotal());
			System.out.println(students[i].getAvg());
			
		}
		
	}

}
