package com.javase.chapter18;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) {

		// �����ļ���
		FileTest.getFile("c:/haha1", "ɧï");

	}

	public static boolean getFile(String path, String name) {
		boolean success = false;
		String name1 = name;
		String path1 = path;
		try {
		File file = new File(path1);
		if (!file.isDirectory()) {
			file.mkdirs(); // �����ļ���
		}
		File file2 = new File(path1+File.separator+name1+".txt");
		
			success = file2.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //�����ļ�
		return  success;
	}
}
