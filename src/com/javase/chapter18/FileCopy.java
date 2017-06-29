package com.javase.chapter18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
	public static void main(String[] args) throws IOException {
		/**
		 * 创建输入输出流
		 */
		FileInputStream fis = new FileInputStream("test.txt");
		FileOutputStream fos = new FileOutputStream("test2.txt");
		
		/**
		 * 创建字节数组(边读边写)
		 */
		byte[] b = new byte[1024];
		
		//先读
		int i = fis.read(b, 0, b.length);
		/**
		 * 循环
		 */
		while(i != -1){
			//再写 i就是读到的文件长度
			fos.write(b, 0, i);
			//再读
			i = fis.read(b, 0, b.length);
		}
		fis.close();
		fos.close();
	}
}
