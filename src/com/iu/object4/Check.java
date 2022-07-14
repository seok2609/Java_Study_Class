package com.iu.object4;

public class Check {
	
	//인공지능
	//이력서 커트
	public boolean resumeCut(Resume r) {
		if(r.age>=40) {
			r.check=false;
			return false;
		}else {
			r.check=true;
			return true;
		}
		
	}

}
