package com.javase.chapter10;

public class Test01 {
	public static void main(String[] args) {
		
		Ms ms = new Ms("ïʤ","����", 1, '��', 2,true);
		ms.getIsChiRen();
		
		Ms ms2 = new Ms(false);
		ms2.getIsChiRen();
		System.out.println(ms2.hunt());
		
		
		Rw rw = new Rw();
		rw.setName("��Ϊ");
		rw.setType("diao");
		System.out.println(rw.getName()+""+rw.getType());
		
	}
}
