package com.iu.object2;

public class Method4 {
	
	
	//info
	//멤버들의 정보를 출력하는 메서드
	
	public void info(Member [] members) {
		
		for(int i=0;i<members.length;i++) {
			System.out.println("이름: " + members[i].name);
			System.out.println("나이: " +members[i].age);
			System.out.println("이메일: " + members[i].email);
		}
		
		members = new Member[2];
		
	}
	
}
