package com.javase.chapter18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamTest {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("«Î ‰»Î…ß≤Ÿ◊˜:");
		String str = reader.readLine();
		while(str != null){
			System.out.println(str);
			str = reader.readLine();
			
		}
		reader.close();
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File("tx.txt")));

		bw.write("sao");
		bw.write(str);
		bw.close();
	}
}
