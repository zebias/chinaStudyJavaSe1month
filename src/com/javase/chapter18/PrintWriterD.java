package com.javase.chapter18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterD {
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("test.txt");
		FileWriter f1 = new FileWriter(f);
		
		PrintWriter out = new PrintWriter(f1);
		out.write("printwriter\n");
		out.print("print\n");
		
//		File ff = new File("F:hehe.txt");
//		FileWriter ff1 = new FileWriter(ff);
//		BufferedWriter bw = new BufferedWriter(ff1);
//		bw.write("bufferedwriter\n");
		//bw.flush();
		
		BufferedWriter bw2 = new BufferedWriter(new FileWriter(new File("test.txt")));
		char[] c1 = "char".toCharArray();
		bw2.write(c1, 0, c1.length);
		//bw2.flush();
		
		BufferedWriter bw1 = new BufferedWriter(f1);
		char[] c = "char".toCharArray();
		bw1.write(c, 0, c.length);
		//bw1.flush();	
		//bw1.close();
		BufferedReader br = new BufferedReader(new FileReader(f));
		String s = br.readLine();
		while(s != null){
			System.out.println(s);
			s = br.readLine();
		}

		bw1.close();
		out.close();
		br.close();
	//	bw.close();
		bw2.close();
	}

}
