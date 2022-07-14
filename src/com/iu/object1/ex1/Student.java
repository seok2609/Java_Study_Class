package com.iu.object1.ex1;

public class Student {
	
	String name;
	private	int num;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = this.checkPoint(kor);
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = this.checkPoint(eng);
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = this.checkPoint(math);
	}

	public int getTotal() {
		return total;
	}

	public double getAvg() {
		return avg;
	}
	
	private int checkPoint(int point) {
		if(point < 0 || point > 100) {
			return 0;
		}
		return point;
	}

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
