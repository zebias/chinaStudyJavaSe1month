package com.javase.chapter16;
import java.util.UUID;
public class UuidTest {
	public static void main(String[] args) {
		for(int i = 0 ;i<10;i++){
			UUID i1 = UUID.randomUUID();
			System.out.println(i1);
		}
	}
}
