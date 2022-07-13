package com.iu.object1.ex1;

import java.util.Scanner;

public class StudentMain {
	
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		//StudentController의 start 메서드 호출
		Scanner sc = new Scanner(System.in);
		StudentController con  = new StudentController();
		
//		System.out.println("1. 학생 정보 입력");
//		System.out.println("2. 학생 정보 조회");
//		System.out.println("3. 학생 정보 검색");
//		System.out.println("4. 학생 정보 삭제");
//		System.out.println("5. 학생 정보 추가");
//		System.out.println("6. 프로그램 종료");
//		int select = sc.nextInt();
		
		con.start();
		
	
	
		//System.out.println("프로그램 종료");
	}

}
