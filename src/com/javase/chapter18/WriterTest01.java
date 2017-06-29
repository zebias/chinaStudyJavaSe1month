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
		
		//�Դ�
		File file = new File("test1.txt");
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw3 = new BufferedWriter(fw);
		char[] cc="�Ҳ�!".toCharArray();
		bw3.write(cc, 0, cc.length);
		bw3.close();
		//���������������ַ�����߶�дЧ��
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File("ab.txt")));
//		Scanner scan = new Scanner(System.in);
//		System.out.println("������ɧ����!");
//		String wenzi = scan.next();
		
		char[] ch = "ɧï".toCharArray();
		
		bw.write(ch, 0, ch.length);
//		scan.close();
		bw.close();
		
		//�������а����ṩ��������ַ������ʽ����
		PrintWriter out = new PrintWriter(new FileWriter(new File("abc.txt")));
		
		//����һ��char����
		//char[] ch = "ţ�Ƶ�,�ҵĸ�".toCharArray();
		out.println("�ҿ�!����");
		int i = 100;
		out.printf("�������İ�%d",i);
		out.close();

		//����
		//���������������ַ�����߶�дЧ��
		BufferedReader br = new BufferedReader(new FileReader(new File("abc.txt")));
		
		char[] ch1 = new char[1024];
		
		int j = br.read(ch1, 0, ch1.length);
		while(j != -1){
			String string = new String(ch1, 0,j);
			System.out.println(string);
			j = br.read(ch1, 0, ch1.length);
		}

		br.close();
		//�ַ����������

		BufferedReader br1 = new BufferedReader(new FileReader(new File("ab.txt")));
		
		String str2 = br1.readLine();
		while(str2 != null){
			System.out.println(str2);
			str2 = br1.readLine();
		}
		br1.close();
	}	
}
