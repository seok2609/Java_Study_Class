package com.iu.object2;

public class Method3 {
	
	//sal
	
	public void sal(int salary) {
		
		System.out.println("월급 계산");
		System.out.println(salary*0.967);
		salary = 20;
		
	}
	
	public void hap(int num1, int num2) {
		System.out.println(num1+num2);		
	}
	
	//info : 이름 나이 이메일주소를 받아서 출력
	
	public void info(String name, int age, String email) {
		System.out.println(name);
		System.out.println(age);
		System.out.println(email);
	}
	
	public void info2(Member member) {
		System.out.println(member.name);
		System.out.println(member.age);
		System.out.println(member.email);
		member.age=100;
	}

}
