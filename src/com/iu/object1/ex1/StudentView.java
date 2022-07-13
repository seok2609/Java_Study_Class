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
			System.out.println(student.name);
			System.out.println(student.num);
			System.out.println(student.kor);
			System.out.println(student.eng);
			System.out.println(student.math);
			System.out.println(student.total);
			System.out.println(student.avg);
	}
	
	//viewAll 메서드 생성
	//학생들의 정보를 받아서 모든 정보를 출력
	
	//학생들의 정보를 받아서 => Student [] students
	
	
	public void viewAll(Student [] students) {
		for(int i=0;i<students.length;i++) {
			System.out.println(students[i].name);
			System.out.println(students[i].num);
			System.out.println(students[i].kor);
			System.out.println(students[i].eng);
			System.out.println(students[i].math);
			System.out.println(students[i].total);
			System.out.println(students[i].avg);
			
		}
		
	}

}
