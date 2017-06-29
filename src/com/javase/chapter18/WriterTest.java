package com.javase.chapter18;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriterTest {

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File("a.txt")));
		bw.write("Œ“≤›!");
//		bw.flush();
		bw.close();
	}
}
