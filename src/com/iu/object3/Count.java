package com.iu.object3;

public class Count {
	
	//메서드 오버로딩: 메서드명이 같아도 아래와 같이 갯수가 다르거나 타입의 구성이 다르면 선언 가능
	
	public void hap(int num1, int num2) {
		System.out.println(num1+num2);
	}
	
	public void hap(int num1, double num2) {
		System.out.println(num1+num2);
	}
	public void hap(int num1, int num2, int num3) {
		
	}

}
