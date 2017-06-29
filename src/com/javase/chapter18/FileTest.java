package com.javase.chapter18;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) {

		// 创建文件夹
		FileTest.getFile("c:/haha1", "骚茂");

	}

	public static boolean getFile(String path, String name) {
		boolean success = false;
		String name1 = name;
		String path1 = path;
		try {
		File file = new File(path1);
		if (!file.isDirectory()) {
			file.mkdirs(); // 创建文件夹
		}
		File file2 = new File(path1+File.separator+name1+".txt");
		
			success = file2.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //创建文件
		return  success;
	}
}
