package com.javase.chapter18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriterTest01 {
	public static void main(String[] args) throws IOException {
		
		//试错
		File file = new File("test1.txt");
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw3 = new BufferedWriter(fw);
		char[] cc="我草!".toCharArray();
		bw3.write(cc, 0, cc.length);
		bw3.close();
		//创建缓冲流包裹字符流提高读写效率
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File("ab.txt")));
//		Scanner scan = new Scanner(System.in);
//		System.out.println("请输入骚操作!");
//		String wenzi = scan.next();
		
		char[] ch = "骚茂".toCharArray();
		
		bw.write(ch, 0, ch.length);
//		scan.close();
		bw.close();
		
		//对流进行包裹提供更方便的字符输出格式控制
		PrintWriter out = new PrintWriter(new FileWriter(new File("abc.txt")));
		
		//创建一个char数组
		//char[] ch = "牛逼的,我的哥".toCharArray();
		out.println("我靠!天哪");
		int i = 100;
		out.printf("这个不错的啊%d",i);
		out.close();

		//读出
		//创建缓冲流包裹字符流提高读写效率
		BufferedReader br = new BufferedReader(new FileReader(new File("abc.txt")));
		
		char[] ch1 = new char[1024];
		
		int j = br.read(ch1, 0, ch1.length);
		while(j != -1){
			String string = new String(ch1, 0,j);
			System.out.println(string);
			j = br.read(ch1, 0, ch1.length);
		}

		br.close();
		//字符输入输出流

		BufferedReader br1 = new BufferedReader(new FileReader(new File("ab.txt")));
		
		String str2 = br1.readLine();
		while(str2 != null){
			System.out.println(str2);
			str2 = br1.readLine();
		}
		br1.close();
	}	
}
