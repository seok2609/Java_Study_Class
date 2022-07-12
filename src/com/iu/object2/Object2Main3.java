package com.iu.object2;

public class Object2Main3 {
	
	public static void main(String[] args) {
		
		Method3 m3 = new Method3();
		//월급 입력
		int salary = 5000000;
		m3.sal(salary);
		System.out.println(salary);
		//m3.hap(10, 20);
		
		System.out.println("=============================");
		
		m3.info("noze", 27, "1234@naver.com");
		
		System.out.println("=============================");
		
		Member member = new Member();
		member.name="naeun";
		member.age=24;
		member.email="abc@naver.com";
		
		m3.info2(member);
		System.out.println(member.age);
	}

}
