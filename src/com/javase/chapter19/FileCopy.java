package com.javase.chapter19;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
	public static void main(String[] args) throws IOException {
		//ͨ���ֽ���
		//�ȶ�ȡ�ļ�
		FileInputStream fis = new FileInputStream("c:/shop.txt");
		//��д���ļ�
		FileOutputStream fos = new FileOutputStream("c:/shop1.txt");
		
		//�ȶ���д
		//��byte�����
		byte[] b = new byte[1024];
		int i = fis.read(b, 0, b.length);
		while(i != -1){
			//��д
			fos.write(b,0 ,i);
			//ѭ����
			i=fis.read(b, 0, b.length);
		}
		fis.close();
		fos.close();
	}
}
