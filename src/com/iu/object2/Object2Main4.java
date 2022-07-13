package com.iu.object2;

public class Object2Main4 {
	public static void main(String[] args) {
		
		Member member = new Member();
		member.name="noze";
		member.age=30;
		member.email="noze@naver.com";
		
		Member member2 = new Member();
		member2.name="naeun";
		member2.age=24;
		member2.email="naeun@naver.com";
		
		Member member3 = new Member();
		member3.name="iu";
		member3.age=30;
		member3.email="iu@naver.com";
		
		Member [] members = new Member[3];
		
		members[0] = member;
		members[1] = member2;
		members[2] = member3;
		
		Method4 m4 = new Method4();
		
		m4.info(members);
		
		System.out.println(members.length);
		
		
	}

}
