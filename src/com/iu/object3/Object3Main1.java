package com.iu.object3;

import java.util.Scanner;

public class Object3Main1 {

	public static void main(String[] args) {
		ReturnTest rt = new ReturnTest();
		rt.info();
		int num = rt.makeRandom(); //5
		System.out.println(num);
		
		
		System.out.println("===========================");
		
//		System.out.println("숫자 입력");
//		Scanner sc = new Scanner(System.in);
//		int select = sc.nextInt();
//		int [] nums = rt.makeRandom2(select);
		
		int [] nums = rt.makeRandom2(10);
		
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
		
		System.out.println("=========================");
		
		Account account = rt.makeAccount();
		System.out.println("통장이름: " + account.title);
		System.out.println("예금주: " + account.host);
		System.out.println("계좌번호: " + account.numbers);
		System.out.println("잔액: " + account.balance);

	}

}
