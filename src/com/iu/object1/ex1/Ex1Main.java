package com.iu.object1.ex1;

import java.util.Scanner;

public class Ex1Main {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
//		Student st1 = new Student();
//		
//		st1.name = "noze";
//		st1.num = 1;
//		st1.kor = 70;
//		st1.eng = 70;
//		st1.math = 70;
//		st1.total = st1.kor+st1.eng+st1.math;
//		st1.avg = st1.total/3.0;
//		
//		Student st2 = new Student();
//		
//		Student st3 = new Student();
//		
//		System.out.println(st1.name);
//		System.out.println(st1.num);
//		System.out.println(st1.kor);
//		System.out.println(st1.eng);
//		System.out.println(st1.math);
//		System.out.println(st1.total);
//		System.out.println(st1.avg);
		
		Student st = null;
		Scanner sc = new Scanner(System.in);
		Student [] students = new Student [3]; 
		
		for(int i=0;i<3;i++) {
			st = new Student();
			System.out.println("이름 입력");
			st.name = sc.next();
			students[i]=st;
			
		}
		
		System.out.println(students[0].name);
		System.out.println(students[1].name);
		System.out.println(students[2].name);
		
		System.out.println(st.name);
		
		
		
		System.out.println("프로그램 종료");
	}

}
