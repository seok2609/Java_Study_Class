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

	}

}
