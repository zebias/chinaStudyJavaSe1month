package com.javase.chapter18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
	public static void main(String[] args) throws IOException {
		/**
		 * �������������
		 */
		FileInputStream fis = new FileInputStream("test.txt");
		FileOutputStream fos = new FileOutputStream("test2.txt");
		
		/**
		 * �����ֽ�����(�߶���д)
		 */
		byte[] b = new byte[1024];
		
		//�ȶ�
		int i = fis.read(b, 0, b.length);
		/**
		 * ѭ��
		 */
		while(i != -1){
			//��д i���Ƕ������ļ�����
			fos.write(b, 0, i);
			//�ٶ�
			i = fis.read(b, 0, b.length);
		}
		fis.close();
		fos.close();
	}
}
