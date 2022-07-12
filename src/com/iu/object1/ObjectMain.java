package com.iu.object1;

public class ObjectMain {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		//Object 생성
		//클래스명 변수명 = new 클래스
		Monster monster = new Monster();
		System.out.println(monster);
		//멤버 변수 접근
		//변수명.멤버변수명
		System.out.println(monster.name);
		System.out.println(monster.level);
		System.out.println(monster.hp);
		
		monster.name = "오크";
		monster.hp=100;
		monster.level=5;
		
		System.out.println(monster.name);
		System.out.println(monster.level);
		System.out.println(monster.hp);
		//------------------------------------
		
		Monster mob = new Monster();
		
		mob.name="고블린";
		mob.hp=100;
		mob.level=5;
		
		System.out.println(mob.name);
		System.out.println(mob.level);
		System.out.println(mob.hp);
		
		System.out.println(monster=mob);
		
		Weapon sword = new Weapon();
		
		sword.name="단검";
		sword.damage=10;
		sword.inchant=1;
		
		monster.weapon = sword;
		
		System.out.println(monster.weapon.name);
		
		System.out.println(mob.weapon.name);
		
		System.out.println("프로그램 종료");
	}

}
