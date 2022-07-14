package com.iu.object4;

public class Car {
	
	String company = "쌍용";
	String brand;
	String color;
	boolean gear; //true면 오토, false면 수동
	
	//Instance 초기화 블럭 {}
//	{
//		this.company = "기아";
//		this.brand = "K5";
//		this.color = "Balck";
//		this.gear = false;
//	}
	
	public Car () {
		this("White");
//		this.company = "현대";
//		this.brand = "아반떼";
//		this.color = "White";
//		this.gear = true;
	}
	
	public Car (String color) {
//		this.company = "현대";
//		this.brand = "아반떼";
//		this.color = color;
//		this.gear = true;
		this("아반떼", color);
	}
	
	public Car(String brand, String color) {
		this.company = "제네시스";
		this.brand = brand;
		this.color = color;
		this.gear = true;
	}
	
	public void info() {
		System.out.println("Company : " + this.company);
		System.out.println("Brand : " + this.brand);
		System.out.println("Color : " + this.color);
		System.out.println("Gear : " + this.gear);
	}
	

}


