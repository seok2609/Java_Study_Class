package com.iu.object1.ex1;

public class Student {
	
	String name;
	int num;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	
	public void setTotal() {
		this.total = this.kor + this.eng + this.math;
		this.setAvg();
	}
	
	public void setAvg() {
		this.avg = this.total/3.0;
	}

}

// 클래스명 : 대문자로 시작
// 변수명 : 소문자로 시작 뒤에 소괄호X
// 메서드명 : 소문자로 시작 뒤에 소괄호O
