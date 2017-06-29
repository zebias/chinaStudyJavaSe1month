package com.javase.chapter18;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriteTest {
	public static void main(String[] args) {
		PrintWriter out = null;
		try {
			 out = new PrintWriter( new FileWriter(new File("ts.txt")));
			int i = 100;
			out.printf("我说你知道"+i);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		out.close();
	}
}
